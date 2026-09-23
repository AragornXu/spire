package spire.benchmark.reified

import spire.algebra.CRing
import spire.implicits._

class MyComplex[T](var t: T){
  def *(other: MyComplex[T])(implicit ev: CRing[T]): MyComplex[T] = 
    new MyComplex[T]
      (t 
      * 
      other.t)
}

object ComplexTest:
  val SIZE = 1000
  private final val OUTERREPEAT = 1000
  private final val INNERREPEAT = 5

  val intXs: Array[MyComplex[Int]] = Array.tabulate(SIZE)(i => new MyComplex[Int](i))
  val intYs: Array[MyComplex[Int]] = Array.tabulate(SIZE)(i => new MyComplex[Int](0))
  val longXs: Array[MyComplex[Long]] = Array.tabulate(SIZE)(i => new MyComplex[Long](i))
  val longYs: Array[MyComplex[Long]] = Array.tabulate(SIZE)(i => new MyComplex[Long](0))
  val doubleXs: Array[MyComplex[Double]] = Array.tabulate(SIZE)(i => new MyComplex[Double](i))
  val doubleYs: Array[MyComplex[Double]] = Array.tabulate(SIZE)(i => new MyComplex[Double](0))

  private def benchmark[A](xs: Array[MyComplex[A]], ys: Array[MyComplex[A]])(implicit ev: CRing[A]): Unit = {
    var repeat = 0
    while (repeat < INNERREPEAT) {
      var i = 0
      while (i < SIZE) {
        val res = 
          xs(i) 
          * 
          ys(i)
        i += 1
      }
      repeat += 1
    }
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

object ComplexTestMono:
  def main(args: Array[String]): Unit =
    ComplexTest.runMono(args)

object ComplexTestMega:
  def main(args: Array[String]): Unit =
    ComplexTest.runMega(args)