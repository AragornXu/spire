package spire.benchmark.reified

class Box[T](var t: T){
  def copyTo(other: Box[T], foo: Foo) = other.t = foo.get(this.t).t2
}

class Copier[T](val t2: T){
  def id(t: T) = t
}

trait Foo:
  implicit def get[A](a: A): Copier[A] = new Copier[A](a)

class Foo2 extends Foo

object Test:
  val SIZE = 10000
  private final val OUTERREPEAT = 1000
  private final val INNERREPEAT = 5

  val xs: Array[Box[Int]] = Array.tabulate(SIZE)(i => new Box[Int](i))
  val ys: Array[Box[Int]] = Array.tabulate(SIZE)(i => new Box[Int](0))
  val foo = new Foo2

  private def benchmark(xs: Array[Box[Int]], ys: Array[Box[Int]]): Unit = {
    var repeat = 0
    while (repeat < INNERREPEAT) {
      var i = 0
      while (i < SIZE) {
        xs(i).copyTo(ys(i), foo)
        i += 1
      }
      repeat += 1
    }
  }

  def runMono(args: Array[String]): Unit =
    BenchmarkRunner.run(args) {
      var repeat = 0
      while (repeat < OUTERREPEAT) {
        benchmark(xs, ys)
        repeat += 1
      }
    }

object TestMono:
  def main(args: Array[String]): Unit =
    Test.runMono(args)