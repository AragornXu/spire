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

package spire.benchmark.reified

import scala.reflect.ClassTag

import spire.algebra.{Field, VectorSpace}
import spire.implicits._
import spire.math.{ConvertableFrom, Jet}

object JetBenchmark {
  private final val OUTERREPEAT = 100
  private final val INNERREPEAT = 50
  private final val SIZE = 64
  private final val DIMENSION = 8

  private def xReal(i: Int): Int = (i % 17) - 8
  private def yReal(i: Int): Int = (i % 13) - 6
  private def xDerivative(i: Int, dimension: Int): Int = ((i + dimension * 3) % 11) - 5
  private def yDerivative(i: Int, dimension: Int): Int = ((i * 2 + dimension * 5) % 9) - 4

  private def makeJet[A: ClassTag](i: Int, real: Int => Int, derivative: (Int, Int) => Int)
    (fromInt: Int => A): Jet[A] = {
    val infinitesimal = Array.tabulate(DIMENSION)(dimension => fromInt(derivative(i, dimension)))
    Jet(fromInt(real(i)), infinitesimal)
  }

  private val floatXs = Array.tabulate(SIZE)(i => makeJet(i, xReal, xDerivative)(_.toFloat))
  private val floatYs = Array.tabulate(SIZE)(i => makeJet(i, yReal, yDerivative)(_.toFloat))
  private val doubleXs = Array.tabulate(SIZE)(i => makeJet(i, xReal, xDerivative)(_.toDouble))
  private val doubleYs = Array.tabulate(SIZE)(i => makeJet(i, yReal, yDerivative)(_.toDouble))

  private val expectedPerRepeat: Long = {
    var total = 0L
    var i = 0
    while (i < SIZE) {
      val a = xReal(i).toLong
      val b = yReal(i).toLong
      total += a * b
      var dimension = 0
      while (dimension < DIMENSION) {
        val du = xDerivative(i, dimension).toLong
        val dv = yDerivative(i, dimension).toLong
        total += b * du + a * dv
        dimension += 1
      }
      i += 1
    }
    total
  }

  private val expectedTotal = expectedPerRepeat * INNERREPEAT

  private def benchmark[A](xs: Array[Jet[A]], ys: Array[Jet[A]])(implicit field: Field[A], vectorSpace: VectorSpace[Array[A], A], convertable: ConvertableFrom[A]): Unit = {
    var total = 0L
    var repeat = 0
    while (repeat < INNERREPEAT) {
      var checksum = field.zero
      var i = 0
      while (i < SIZE) {
        val result = xs(i) * ys(i)
        checksum = field.plus(checksum, result.real)
        var dimension = 0
        while (dimension < DIMENSION) {
          checksum = field.plus(checksum, result.infinitesimal(dimension))
          dimension += 1
        }
        i += 1
      }
      total += convertable.toLong(checksum)
      repeat += 1
    }
    BenchmarkRunner.verify(total, expectedTotal)
  }

  def runMono(args: Array[String]): Unit =
    BenchmarkRunner.run(args) {
      var repeat = 0
      while (repeat < OUTERREPEAT) {
        benchmark[Float](floatXs, floatYs)
        repeat += 1
      }
    }

  def runMega(args: Array[String]): Unit =
    BenchmarkRunner.run(args) {
      var repeat = 0
      while (repeat < OUTERREPEAT) {
        benchmark[Float](floatXs, floatYs)
        benchmark[Double](doubleXs, doubleYs)
        repeat += 1
      }
    }
}

object JetMono {
  def main(args: Array[String]): Unit = JetBenchmark.runMono(args)
}

object JetMega {
  def main(args: Array[String]): Unit = JetBenchmark.runMega(args)
}
