package spire.benchmark.reified

object BenchmarkRunner {
  private final val DefaultRounds = 100

  def run(args: Array[String])(body: => Unit): Unit = {
    val rounds =
      if (args.isEmpty) DefaultRounds
      else if (args.length == 1) args(0).toInt
      else throw new IllegalArgumentException("expected at most one argument: [rounds]")

    require(rounds > 0, s"rounds must be positive, but was $rounds")

    var round = 1
    while (round <= rounds) {
      val startTime = System.nanoTime()
      body
      val duration = System.nanoTime() - startTime
      println(s"round $round: ${duration / 1000L}us")
      round += 1
    }
  }

  def verify(total: Long, expectedTotal: Long): Unit =
    if (total != expectedTotal)
      throw new IllegalStateException(s"total=$total, expectedTotal=$expectedTotal")
}
