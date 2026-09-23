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

import spire.algebra.{Eq, Semiring}
import spire.implicits._
import spire.math.{ConvertableFrom, Polynomial}

object PolynomialBenchmark {
  private final val OUTERREPEAT = 100
  private final val INNERREPEAT = 50
  private final val COEFFICIENTCOUNT = 64

  private def lhsCoeff(i: Int): Int = (i % 7) - 3
  private def rhsCoeff(i: Int): Int = (i % 5) - 2

  private val intLhs = Polynomial.dense(Array.tabulate(COEFFICIENTCOUNT)(lhsCoeff))
  private val intRhs = Polynomial.dense(Array.tabulate(COEFFICIENTCOUNT)(rhsCoeff))
  private val longLhs = Polynomial.dense(Array.tabulate(COEFFICIENTCOUNT)(i => lhsCoeff(i).toLong))
  private val longRhs = Polynomial.dense(Array.tabulate(COEFFICIENTCOUNT)(i => rhsCoeff(i).toLong))
  private val doubleLhs = Polynomial.dense(Array.tabulate(COEFFICIENTCOUNT)(i => lhsCoeff(i).toDouble))
  private val doubleRhs = Polynomial.dense(Array.tabulate(COEFFICIENTCOUNT)(i => rhsCoeff(i).toDouble))

  private val expectedPerRepeat: Long = {
    val result = new Array[Long](COEFFICIENTCOUNT * 2 - 1)
    var i = 0
    while (i < COEFFICIENTCOUNT) {
      val lhs = lhsCoeff(i).toLong
      var j = 0
      while (j < COEFFICIENTCOUNT) {
        result(i + j) += lhs * rhsCoeff(j).toLong
        j += 1
      }
      i += 1
    }

    var total = 0L
    i = 0
    while (i < result.length) {
      total += result(i)
      i += 1
    }
    total
  }

  private val expectedTotal = expectedPerRepeat * INNERREPEAT

  private def benchmark[A](lhs: Polynomial[A], rhs: Polynomial[A])(implicit ring: Semiring[A], eq: Eq[A], convertable: ConvertableFrom[A]): Unit = {
    var total = 0L
    var repeat = 0
    while (repeat < INNERREPEAT) {
      val result = lhs * rhs
      val coefficients = result.coeffsArray
      var checksum = ring.zero
      var i = 0
      val len = coefficients.length
      while (i < len) {
        checksum = ring.plus(checksum, coefficients(i))
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
        benchmark[Int](intLhs, intRhs)
        repeat += 1
      }
    }

  def runMega(args: Array[String]): Unit =
    BenchmarkRunner.run(args) {
      var repeat = 0
      while (repeat < OUTERREPEAT) {
        benchmark[Int](intLhs, intRhs)
        benchmark[Long](longLhs, longRhs)
        benchmark[Double](doubleLhs, doubleRhs)
        repeat += 1
      }
    }
}

object PolynomialMono {
  def main(args: Array[String]): Unit = PolynomialBenchmark.runMono(args)
}

object PolynomialMega {
  def main(args: Array[String]): Unit = PolynomialBenchmark.runMega(args)
}
