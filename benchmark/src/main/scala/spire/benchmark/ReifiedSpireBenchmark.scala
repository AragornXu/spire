/*
 * **********************************************************************\
 * * Project                                                              **
 * *       ______  ______   __    ______    ____                          **
 * *      / ____/ / __  /  / /   / __  /   / __/     (c) 2011-2021        **
 * *     / /__   / /_/ /  / /   / /_/ /   / /_                            **
 * *    /___  / / ____/  / /   / __  /   / __/   Erik Osheim, Tom Switzer **
 * *   ____/ / / /      / /   / / | |   / /__                             **
 * *  /_____/ /_/      /_/   /_/  |_|  /____/     All rights reserved.    **
 * *                                                                      **
 * *      Redistribution and use permitted under the MIT license.         **
 * *                                                                      **
 * \***********************************************************************
 */

package spire
package benchmark

import scala.reflect.ClassTag

import spire.algebra.{CRing, Eq, Field, Rig, VectorSpace}
import spire.implicits._
import spire.math.{Complex, Jet, Polynomial, Quaternion}

/**
 * A small manual benchmark/smoke test for the reified compiler. Unlike the synthetic bcGen.Spire workloads, every value
 * operated on here is a real Spire data structure.
 */
object ReifiedSpireBenchmark {
  final private val Size = 64
  final private val Repeats = 20
  final private val JetDimension = 4

  private def complexInputs[A: ClassTag](fromInt: Int => A): (Array[Complex[A]], Array[Complex[A]]) = {
    val xs = Array.tabulate(Size) { i =>
      Complex(fromInt((i % 23) - 11), fromInt((i % 19) - 9))
    }
    val ys = Array.tabulate(Size) { i =>
      Complex(fromInt((i % 17) - 8), fromInt((i % 13) - 6))
    }
    (xs, ys)
  }

  private def complexKernel[A](xs: Array[Complex[A]], ys: Array[Complex[A]])(implicit ring: CRing[A]): Complex[A] = {
    var checksum = Complex.zero[A]
    var repeat = 0
    while (repeat < Repeats) {
      var i = 0
      while (i < Size) {
        checksum = checksum + (xs(i) * ys(i) + xs(i))
        i += 1
      }
      repeat += 1
    }
    checksum
  }

  private def quaternionInputs[A: ClassTag](fromInt: Int => A): (Array[Quaternion[A]], Array[Quaternion[A]]) = {
    val xs = Array.tabulate(Size) { i =>
      Quaternion(fromInt((i % 11) - 5), fromInt((i % 13) - 6), fromInt((i % 17) - 8), fromInt((i % 19) - 9))
    }
    val ys = Array.tabulate(Size) { i =>
      Quaternion(fromInt((i % 7) - 3), fromInt((i % 9) - 4), fromInt((i % 15) - 7), fromInt((i % 21) - 10))
    }
    (xs, ys)
  }

  private def quaternionKernel[A](xs: Array[Quaternion[A]], ys: Array[Quaternion[A]])(implicit
    ring: CRing[A]
  ): Quaternion[A] = {
    var checksum = Quaternion.zero[A]
    var repeat = 0
    while (repeat < Repeats) {
      var i = 0
      while (i < Size) {
        checksum = checksum + xs(i) * ys(i)
        i += 1
      }
      repeat += 1
    }
    checksum
  }

  private def polynomialInputs[A: ClassTag](fromInt: Int => A)(implicit
    ring: Rig[A],
    eq: Eq[A]
  ): (Polynomial[A], Polynomial[A]) = {
    val lhs = Polynomial.dense(Array.tabulate(Size)(i => fromInt((i % 7) - 3)))
    val rhs = Polynomial.dense(Array.tabulate(Size)(i => fromInt((i % 5) - 2)))
    (lhs, rhs)
  }

  private def polynomialKernel[A](lhs: Polynomial[A], rhs: Polynomial[A])(implicit
    ring: Rig[A],
    eq: Eq[A]
  ): A = {
    var checksum = ring.zero
    var repeat = 0
    while (repeat < Repeats) {
      val product = lhs * rhs
      checksum = ring.plus(checksum, product(ring.one))
      repeat += 1
    }
    checksum
  }

  private def jetInputs[A: ClassTag](fromInt: Int => A): (Array[Jet[A]], Array[Jet[A]]) = {
    def derivatives(i: Int, factor: Int): Array[A] =
      Array.tabulate(JetDimension)(d => fromInt(((i * factor + d * 3) % 11) - 5))

    val xs = Array.tabulate(Size)(i => Jet(fromInt((i % 17) - 8), derivatives(i, 1)))
    val ys = Array.tabulate(Size)(i => Jet(fromInt((i % 13) - 6), derivatives(i, 2)))
    (xs, ys)
  }

  private def jetKernel[A](xs: Array[Jet[A]], ys: Array[Jet[A]])(implicit
    field: Field[A],
    vectorSpace: VectorSpace[Array[A], A]
  ): A = {
    var checksum = field.zero
    var repeat = 0
    while (repeat < Repeats) {
      var i = 0
      while (i < Size) {
        val result = xs(i) * ys(i)
        checksum = field.plus(checksum, result.real)
        var d = 0
        while (d < JetDimension) {
          checksum = field.plus(checksum, result.infinitesimal(d))
          d += 1
        }
        i += 1
      }
      repeat += 1
    }
    checksum
  }

  def main(args: Array[String]): Unit = {
    val intComplex = complexInputs[Int](identity)
    val longComplex = complexInputs[Long](_.toLong)
    val doubleComplex = complexInputs[Double](_.toDouble)
    val complexIntResult = complexKernel(intComplex._1, intComplex._2)
    val complexLongResult = complexKernel(longComplex._1, longComplex._2)
    val complexDoubleResult = complexKernel(doubleComplex._1, doubleComplex._2)
    require(complexLongResult == Complex(complexIntResult.real.toLong, complexIntResult.imag.toLong))
    require(complexDoubleResult == Complex(complexIntResult.real.toDouble, complexIntResult.imag.toDouble))

    val intQuaternion = quaternionInputs[Int](identity)
    val longQuaternion = quaternionInputs[Long](_.toLong)
    val doubleQuaternion = quaternionInputs[Double](_.toDouble)
    val quaternionIntResult = quaternionKernel(intQuaternion._1, intQuaternion._2)
    val quaternionLongResult = quaternionKernel(longQuaternion._1, longQuaternion._2)
    val quaternionDoubleResult = quaternionKernel(doubleQuaternion._1, doubleQuaternion._2)
    require(quaternionLongResult.r == quaternionIntResult.r.toLong)
    require(quaternionDoubleResult.r == quaternionIntResult.r.toDouble)

    val intPolynomial = polynomialInputs[Int](identity)
    val longPolynomial = polynomialInputs[Long](_.toLong)
    val doublePolynomial = polynomialInputs[Double](_.toDouble)
    val polynomialIntResult = polynomialKernel(intPolynomial._1, intPolynomial._2)
    val polynomialLongResult = polynomialKernel(longPolynomial._1, longPolynomial._2)
    val polynomialDoubleResult = polynomialKernel(doublePolynomial._1, doublePolynomial._2)
    require(polynomialLongResult == polynomialIntResult.toLong)
    require(polynomialDoubleResult == polynomialIntResult.toDouble)

    val floatJets = jetInputs[Float](_.toFloat)
    val doubleJets = jetInputs[Double](_.toDouble)
    val jetFloatResult = jetKernel(floatJets._1, floatJets._2)
    val jetDoubleResult = jetKernel(doubleJets._1, doubleJets._2)
    require(jetDoubleResult == jetFloatResult.toDouble)

    val libraryLocation = classOf[scala.collection.mutable.ListBuffer[_]].getProtectionDomain.getCodeSource.getLocation
    println(s"scala-library: $libraryLocation")
    println(s"scala-library version: ${scala.util.Properties.versionNumberString}")
    println(s"complex: $complexIntResult")
    println(s"quaternion: $quaternionIntResult")
    println(s"polynomial: $polynomialIntResult")
    println(s"jet: $jetDoubleResult")
  }
}
