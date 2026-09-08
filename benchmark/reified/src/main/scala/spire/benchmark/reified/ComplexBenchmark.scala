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

import spire.algebra.CRing
import spire.implicits._
import spire.math.{Complex, ConvertableFrom}

object ComplexBenchmark {
  private final val OuterRepeat = 100
  private final val InnerRepeat = 100
  private final val Size = 512

  private def xReal(i: Int): Int = (i % 23) - 11
  private def xImag(i: Int): Int = (i % 19) - 9
  private def yReal(i: Int): Int = (i % 17) - 8
  private def yImag(i: Int): Int = (i % 13) - 6

  private val intXs = Array.tabulate(Size)(i => Complex(xReal(i), xImag(i)))
  private val intYs = Array.tabulate(Size)(i => Complex(yReal(i), yImag(i)))
  private val longXs = Array.tabulate(Size)(i => Complex(xReal(i).toLong, xImag(i).toLong))
  private val longYs = Array.tabulate(Size)(i => Complex(yReal(i).toLong, yImag(i).toLong))
  private val doubleXs = Array.tabulate(Size)(i => Complex(xReal(i).toDouble, xImag(i).toDouble))
  private val doubleYs = Array.tabulate(Size)(i => Complex(yReal(i).toDouble, yImag(i).toDouble))

  private val expectedPerRepeat: Long = {
    var total = 0L
    var i = 0
    while (i < Size) {
      val a = xReal(i).toLong
      val b = xImag(i).toLong
      val c = yReal(i).toLong
      val d = yImag(i).toLong
      total += a * c - b * d + a
      total += b * c + a * d + b
      i += 1
    }
    total
  }

  private val expectedTotal = expectedPerRepeat * InnerRepeat

  private def benchmark[A](xs: Array[Complex[A]], ys: Array[Complex[A]])(implicit
    ring: CRing[A],
    convertable: ConvertableFrom[A]
  ): Unit = {
    var total = 0L
    var repeat = 0
    while (repeat < InnerRepeat) {
      var checksum = ring.zero
      var i = 0
      while (i < Size) {
        val result = xs(i) * ys(i) + xs(i)
        checksum = ring.plus(checksum, result.real)
        checksum = ring.plus(checksum, result.imag)
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
      while (repeat < OuterRepeat) {
        benchmark[Int](intXs, intYs)
        repeat += 1
      }
    }

  def runMega(args: Array[String]): Unit =
    BenchmarkRunner.run(args) {
      var repeat = 0
      while (repeat < OuterRepeat) {
        benchmark[Int](intXs, intYs)
        benchmark[Long](longXs, longYs)
        benchmark[Double](doubleXs, doubleYs)
        repeat += 1
      }
    }
}

object ComplexMono {
  def main(args: Array[String]): Unit = ComplexBenchmark.runMono(args)
}

object ComplexMega {
  def main(args: Array[String]): Unit = ComplexBenchmark.runMega(args)
}
