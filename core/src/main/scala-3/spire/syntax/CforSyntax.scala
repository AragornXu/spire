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
package syntax

trait CforSyntax:
  import macros._
  import collection.immutable.NumericRange

  final type RangeLike = Range | NumericRange[Long]

  final type RangeElem[X <: RangeLike] = X match
    case Range              => Int
    case NumericRange[Long] => Long

  final inline def cfor[A](inline init: A)(inline test: A => Boolean, inline next: A => A)(inline body: A => Unit): Unit =
    var index = init
    while test(index) do
      body(index)
      index = next(index)

  inline def cforRange(inline r: Range)(inline body: Int => Unit): Unit =
    val n = r.length
    var idx = 0
    while idx < n do
      body(r(idx))
      idx += 1

  inline def cforRange(inline r: NumericRange[Long])(inline body: Long => Unit): Unit =
    val n = r.length
    var idx = 0
    while idx < n do
      body(r(idx))
      idx += 1

  final inline def cforRange2(inline r1: Range, inline r2: Range)(inline body: (Int, Int) => Unit): Unit =
    cforRange(r1) { x => cforRange(r2) { y => body(x, y) } }

  final inline def cforRange2(inline r1: NumericRange[Long], inline r2: NumericRange[Long])(inline body: (Long, Long) => Unit): Unit =
    cforRange(r1) { x => cforRange(r2) { y => body(x, y) } }

  // inline def cforRange[R <: RangeLike](inline r: R)(inline body: RangeElem[R] => Unit): Unit =
  //   ${ cforRangeMacroGen('r, 'body) }

  // inline def cforRange2[R <: RangeLike](inline r1: R, inline r2: R)(
  //   inline body: (RangeElem[R], RangeElem[R]) => Unit
  // ): Unit =
  //   cforRange(r1) { x => cforRange(r2) { y => body(x, y) } }
end CforSyntax
