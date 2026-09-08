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
import spire.math.{ConvertableFrom, Quaternion}

object QuaternionBenchmark {
  private final val OUTERREPEAT = 100
  private final val INNERREPEAT = 50
  private final val SIZE = 256

  private def xr(i: Int): Int = (i % 11) - 5
  private def xi(i: Int): Int = (i % 13) - 6
  private def xj(i: Int): Int = (i % 17) - 8
  private def xk(i: Int): Int = (i % 19) - 9
  private def yr(i: Int): Int = (i % 7) - 3
  private def yi(i: Int): Int = (i % 9) - 4
  private def yj(i: Int): Int = (i % 15) - 7
  private def yk(i: Int): Int = (i % 21) - 10

  private val intXs = Array.tabulate(SIZE)(i => Quaternion(xr(i), xi(i), xj(i), xk(i)))
  private val intYs = Array.tabulate(SIZE)(i => Quaternion(yr(i), yi(i), yj(i), yk(i)))
  private val longXs =
    Array.tabulate(SIZE)(i => Quaternion(xr(i).toLong, xi(i).toLong, xj(i).toLong, xk(i).toLong))
  private val longYs =
    Array.tabulate(SIZE)(i => Quaternion(yr(i).toLong, yi(i).toLong, yj(i).toLong, yk(i).toLong))
  private val doubleXs =
    Array.tabulate(SIZE)(i => Quaternion(xr(i).toDouble, xi(i).toDouble, xj(i).toDouble, xk(i).toDouble))
  private val doubleYs =
    Array.tabulate(SIZE)(i => Quaternion(yr(i).toDouble, yi(i).toDouble, yj(i).toDouble, yk(i).toDouble))

  private val expectedPerRepeat: Long = {
    var total = 0L
    var n = 0
    while (n < SIZE) {
      val ar = xr(n).toLong
      val ai = xi(n).toLong
      val aj = xj(n).toLong
      val ak = xk(n).toLong
      val br = yr(n).toLong
      val bi = yi(n).toLong
      val bj = yj(n).toLong
      val bk = yk(n).toLong
      total += ar * br - ai * bi - aj * bj - ak * bk
      total += ar * bi + ai * br + aj * bk - ak * bj
      total += ar * bj - ai * bk + aj * br + ak * bi
      total += ar * bk + ai * bj - aj * bi + ak * br
      n += 1
    }
    total
  }

  private val expectedTotal = expectedPerRepeat * INNERREPEAT

  private def benchmark[A](xs: Array[Quaternion[A]], ys: Array[Quaternion[A]])(implicit
    ring: CRing[A],
    convertable: ConvertableFrom[A]
  ): Unit = {
    var total = 0L
    var repeat = 0
    while (repeat < INNERREPEAT) {
      var checksum = ring.zero
      var i = 0
      while (i < SIZE) {
        val result = xs(i) * ys(i)
        checksum = ring.plus(checksum, result.r)
        checksum = ring.plus(checksum, result.i)
        checksum = ring.plus(checksum, result.j)
        checksum = ring.plus(checksum, result.k)
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
        benchmark[Int](intXs, intYs)
        repeat += 1
      }
    }

  def runMega(args: Array[String]): Unit =
    BenchmarkRunner.run(args) {
      var repeat = 0
      while (repeat < OUTERREPEAT) {
        benchmark[Int](intXs, intYs)
        benchmark[Long](longXs, longYs)
        benchmark[Double](doubleXs, doubleYs)
        repeat += 1
      }
    }
}

object QuaternionMono {
  def main(args: Array[String]): Unit = QuaternionBenchmark.runMono(args)
}

object QuaternionMega {
  def main(args: Array[String]): Unit = QuaternionBenchmark.runMega(args)
}
