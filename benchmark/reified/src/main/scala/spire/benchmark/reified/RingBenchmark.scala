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

import spire.algebra.Ring
import spire.implicits._
import spire.math.ConvertableFrom

object RingBenchmark {
  private final val OUTERREPEAT = 20
  private final val INNERREPEAT = 100000
  private final val SIZE = 64

  private val intXs: Array[Int] = Array.tabulate(Size)(i => (i % 11) - 5)
  private val intYs: Array[Int] = Array.tabulate(Size)(i => (i % 7) - 3)
  private val longXs: Array[Long] = Array.tabulate(Size)(i => ((i % 11) - 5).toLong)
  private val longYs: Array[Long] = Array.tabulate(Size)(i => ((i % 7) - 3).toLong)
  private val doubleXs: Array[Double] = Array.tabulate(Size)(i => ((i % 11) - 5).toDouble)
  private val doubleYs: Array[Double] = Array.tabulate(Size)(i => ((i % 7) - 3).toDouble)

  private val expectedTotal: Long = {
    var total = 0L
    var i = 0
    while (i < SIZE) {
      total += intXs(i).toLong + intYs(i).toLong
      i += 1
    }
    total * INNERREPEAT
  }

  private def benchmark[A](xs: Array[A], ys: Array[A])(implicit ring: Ring[A], convertable: ConvertableFrom[A]): Unit = {
    var total = 0L
    var repeat = 0
    while (repeat < INNERREPEAT) {
      var i = 0
      while (i < SIZE) {
        val result: A = ring.plus(xs(i), ys(i))
        total += convertable.toLong(result)
        i += 1
      }
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

object RingMono {
  def main(args: Array[String]): Unit = RingBenchmark.runMono(args)
}

object RingMega {
  def main(args: Array[String]): Unit = RingBenchmark.runMega(args)
}
