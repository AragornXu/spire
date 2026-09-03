// auto-generated boilerplate
package algebra
package instances

import algebra.ring.{Rig, Ring, Rng, Semiring}

trait TupleInstances extends cats.kernel.instances.TupleInstances {

  implicit def tuple1Rig[A0](implicit A0: Rig[A0]): Rig[Tuple1[A0]] =
    new Rig[Tuple1[A0]] {
      def zero = Tuple1(A0.zero)
      def one = Tuple1(A0.one)
      def plus(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.plus(x._1, y._1))
      def times(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.times(x._1, y._1))
    }

  implicit def tuple1Ring[A0](implicit A0: Ring[A0]): Ring[Tuple1[A0]] =
    new Ring[Tuple1[A0]] {
      def zero = Tuple1(A0.zero)
      def one = Tuple1(A0.one)
      def negate(x: Tuple1[A0]) = Tuple1(A0.negate(x._1))
      def plus(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.plus(x._1, y._1))
      def times(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.times(x._1, y._1))
    }

  implicit def tuple1Rng[A0](implicit A0: Rng[A0]): Rng[Tuple1[A0]] =
    new Rng[Tuple1[A0]] {
      def zero = Tuple1(A0.zero)
      def negate(x: Tuple1[A0]) = Tuple1(A0.negate(x._1))
      def plus(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.plus(x._1, y._1))
      def times(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.times(x._1, y._1))
    }

  implicit def tuple1Semiring[A0](implicit A0: Semiring[A0]): Semiring[Tuple1[A0]] =
    new Semiring[Tuple1[A0]] {
      def zero = Tuple1(A0.zero)
      def plus(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.plus(x._1, y._1))
      def times(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.times(x._1, y._1))
    }

  implicit def tuple2Rig[A0, A1](implicit A0: Rig[A0], A1: Rig[A1]): Rig[(A0, A1)] =
    new Rig[(A0, A1)] {
      def zero = (A0.zero, A1.zero)
      def one = (A0.one, A1.one)
      def plus(x: (A0, A1), y: (A0, A1)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2))
      def times(x: (A0, A1), y: (A0, A1)) = (A0.times(x._1, y._1), A1.times(x._2, y._2))
    }

  implicit def tuple2Ring[A0, A1](implicit A0: Ring[A0], A1: Ring[A1]): Ring[(A0, A1)] =
    new Ring[(A0, A1)] {
      def zero = (A0.zero, A1.zero)
      def one = (A0.one, A1.one)
      def negate(x: (A0, A1)) = (A0.negate(x._1), A1.negate(x._2))
      def plus(x: (A0, A1), y: (A0, A1)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2))
      def times(x: (A0, A1), y: (A0, A1)) = (A0.times(x._1, y._1), A1.times(x._2, y._2))
    }

  implicit def tuple2Rng[A0, A1](implicit A0: Rng[A0], A1: Rng[A1]): Rng[(A0, A1)] =
    new Rng[(A0, A1)] {
      def zero = (A0.zero, A1.zero)
      def negate(x: (A0, A1)) = (A0.negate(x._1), A1.negate(x._2))
      def plus(x: (A0, A1), y: (A0, A1)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2))
      def times(x: (A0, A1), y: (A0, A1)) = (A0.times(x._1, y._1), A1.times(x._2, y._2))
    }

  implicit def tuple2Semiring[A0, A1](implicit A0: Semiring[A0], A1: Semiring[A1]): Semiring[(A0, A1)] =
    new Semiring[(A0, A1)] {
      def zero = (A0.zero, A1.zero)
      def plus(x: (A0, A1), y: (A0, A1)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2))
      def times(x: (A0, A1), y: (A0, A1)) = (A0.times(x._1, y._1), A1.times(x._2, y._2))
    }

  implicit def tuple3Rig[A0, A1, A2](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2]): Rig[(A0, A1, A2)] =
    new Rig[(A0, A1, A2)] {
      def zero = (A0.zero, A1.zero, A2.zero)
      def one = (A0.one, A1.one, A2.one)
      def plus(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3))
      def times(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3))
    }

  implicit def tuple3Ring[A0, A1, A2](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2]): Ring[(A0, A1, A2)] =
    new Ring[(A0, A1, A2)] {
      def zero = (A0.zero, A1.zero, A2.zero)
      def one = (A0.one, A1.one, A2.one)
      def negate(x: (A0, A1, A2)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3))
      def plus(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3))
      def times(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3))
    }

  implicit def tuple3Rng[A0, A1, A2](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2]): Rng[(A0, A1, A2)] =
    new Rng[(A0, A1, A2)] {
      def zero = (A0.zero, A1.zero, A2.zero)
      def negate(x: (A0, A1, A2)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3))
      def plus(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3))
      def times(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3))
    }

  implicit def tuple3Semiring[A0, A1, A2](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2]): Semiring[(A0, A1, A2)] =
    new Semiring[(A0, A1, A2)] {
      def zero = (A0.zero, A1.zero, A2.zero)
      def plus(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3))
      def times(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3))
    }

  implicit def tuple4Rig[A0, A1, A2, A3](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3]): Rig[(A0, A1, A2, A3)] =
    new Rig[(A0, A1, A2, A3)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero)
      def one = (A0.one, A1.one, A2.one, A3.one)
      def plus(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4))
      def times(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4))
    }

  implicit def tuple4Ring[A0, A1, A2, A3](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3]): Ring[(A0, A1, A2, A3)] =
    new Ring[(A0, A1, A2, A3)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero)
      def one = (A0.one, A1.one, A2.one, A3.one)
      def negate(x: (A0, A1, A2, A3)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4))
      def plus(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4))
      def times(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4))
    }

  implicit def tuple4Rng[A0, A1, A2, A3](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3]): Rng[(A0, A1, A2, A3)] =
    new Rng[(A0, A1, A2, A3)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero)
      def negate(x: (A0, A1, A2, A3)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4))
      def plus(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4))
      def times(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4))
    }

  implicit def tuple4Semiring[A0, A1, A2, A3](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3]): Semiring[(A0, A1, A2, A3)] =
    new Semiring[(A0, A1, A2, A3)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero)
      def plus(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4))
      def times(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4))
    }

  implicit def tuple5Rig[A0, A1, A2, A3, A4](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4]): Rig[(A0, A1, A2, A3, A4)] =
    new Rig[(A0, A1, A2, A3, A4)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one)
      def plus(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5))
      def times(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5))
    }

  implicit def tuple5Ring[A0, A1, A2, A3, A4](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4]): Ring[(A0, A1, A2, A3, A4)] =
    new Ring[(A0, A1, A2, A3, A4)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one)
      def negate(x: (A0, A1, A2, A3, A4)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5))
      def plus(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5))
      def times(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5))
    }

  implicit def tuple5Rng[A0, A1, A2, A3, A4](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4]): Rng[(A0, A1, A2, A3, A4)] =
    new Rng[(A0, A1, A2, A3, A4)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero)
      def negate(x: (A0, A1, A2, A3, A4)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5))
      def plus(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5))
      def times(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5))
    }

  implicit def tuple5Semiring[A0, A1, A2, A3, A4](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4]): Semiring[(A0, A1, A2, A3, A4)] =
    new Semiring[(A0, A1, A2, A3, A4)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero)
      def plus(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5))
      def times(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5))
    }

  implicit def tuple6Rig[A0, A1, A2, A3, A4, A5](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5]): Rig[(A0, A1, A2, A3, A4, A5)] =
    new Rig[(A0, A1, A2, A3, A4, A5)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one)
      def plus(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6))
      def times(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6))
    }

  implicit def tuple6Ring[A0, A1, A2, A3, A4, A5](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5]): Ring[(A0, A1, A2, A3, A4, A5)] =
    new Ring[(A0, A1, A2, A3, A4, A5)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one)
      def negate(x: (A0, A1, A2, A3, A4, A5)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6))
      def plus(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6))
      def times(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6))
    }

  implicit def tuple6Rng[A0, A1, A2, A3, A4, A5](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5]): Rng[(A0, A1, A2, A3, A4, A5)] =
    new Rng[(A0, A1, A2, A3, A4, A5)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6))
      def plus(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6))
      def times(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6))
    }

  implicit def tuple6Semiring[A0, A1, A2, A3, A4, A5](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5]): Semiring[(A0, A1, A2, A3, A4, A5)] =
    new Semiring[(A0, A1, A2, A3, A4, A5)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6))
      def times(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6))
    }

  implicit def tuple7Rig[A0, A1, A2, A3, A4, A5, A6](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6]): Rig[(A0, A1, A2, A3, A4, A5, A6)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7))
      def times(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7))
    }

  implicit def tuple7Ring[A0, A1, A2, A3, A4, A5, A6](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6]): Ring[(A0, A1, A2, A3, A4, A5, A6)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7))
      def times(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7))
    }

  implicit def tuple7Rng[A0, A1, A2, A3, A4, A5, A6](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6]): Rng[(A0, A1, A2, A3, A4, A5, A6)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7))
      def times(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7))
    }

  implicit def tuple7Semiring[A0, A1, A2, A3, A4, A5, A6](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6]): Semiring[(A0, A1, A2, A3, A4, A5, A6)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7))
      def times(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7))
    }

  implicit def tuple8Rig[A0, A1, A2, A3, A4, A5, A6, A7](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8))
    }

  implicit def tuple8Ring[A0, A1, A2, A3, A4, A5, A6, A7](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8))
    }

  implicit def tuple8Rng[A0, A1, A2, A3, A4, A5, A6, A7](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8))
    }

  implicit def tuple8Semiring[A0, A1, A2, A3, A4, A5, A6, A7](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8))
    }

  implicit def tuple9Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9))
    }

  implicit def tuple9Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9))
    }

  implicit def tuple9Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9))
    }

  implicit def tuple9Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9))
    }

  implicit def tuple10Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10))
    }

  implicit def tuple10Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10))
    }

  implicit def tuple10Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10))
    }

  implicit def tuple10Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10))
    }

  implicit def tuple11Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11))
    }

  implicit def tuple11Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11))
    }

  implicit def tuple11Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11))
    }

  implicit def tuple11Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11))
    }

  implicit def tuple12Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12))
    }

  implicit def tuple12Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12))
    }

  implicit def tuple12Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12))
    }

  implicit def tuple12Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12))
    }

  implicit def tuple13Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13))
    }

  implicit def tuple13Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13))
    }

  implicit def tuple13Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13))
    }

  implicit def tuple13Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13))
    }

  implicit def tuple14Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14))
    }

  implicit def tuple14Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14))
    }

  implicit def tuple14Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14))
    }

  implicit def tuple14Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14))
    }

  implicit def tuple15Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15))
    }

  implicit def tuple15Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15))
    }

  implicit def tuple15Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15))
    }

  implicit def tuple15Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15))
    }

  implicit def tuple16Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16))
    }

  implicit def tuple16Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16))
    }

  implicit def tuple16Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16))
    }

  implicit def tuple16Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16))
    }

  implicit def tuple17Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15], A16: Rig[A16]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17))
    }

  implicit def tuple17Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15], A16: Ring[A16]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17))
    }

  implicit def tuple17Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15], A16: Rng[A16]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17))
    }

  implicit def tuple17Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15], A16: Semiring[A16]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17))
    }

  implicit def tuple18Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15], A16: Rig[A16], A17: Rig[A17]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18))
    }

  implicit def tuple18Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15], A16: Ring[A16], A17: Ring[A17]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18))
    }

  implicit def tuple18Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15], A16: Rng[A16], A17: Rng[A17]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18))
    }

  implicit def tuple18Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15], A16: Semiring[A16], A17: Semiring[A17]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18))
    }

  implicit def tuple19Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15], A16: Rig[A16], A17: Rig[A17], A18: Rig[A18]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19))
    }

  implicit def tuple19Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15], A16: Ring[A16], A17: Ring[A17], A18: Ring[A18]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19))
    }

  implicit def tuple19Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15], A16: Rng[A16], A17: Rng[A17], A18: Rng[A18]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19))
    }

  implicit def tuple19Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15], A16: Semiring[A16], A17: Semiring[A17], A18: Semiring[A18]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19))
    }

  implicit def tuple20Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15], A16: Rig[A16], A17: Rig[A17], A18: Rig[A18], A19: Rig[A19]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one, A19.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20))
    }

  implicit def tuple20Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15], A16: Ring[A16], A17: Ring[A17], A18: Ring[A18], A19: Ring[A19]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one, A19.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19), A19.negate(x._20))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20))
    }

  implicit def tuple20Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15], A16: Rng[A16], A17: Rng[A17], A18: Rng[A18], A19: Rng[A19]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19), A19.negate(x._20))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20))
    }

  implicit def tuple20Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15], A16: Semiring[A16], A17: Semiring[A17], A18: Semiring[A18], A19: Semiring[A19]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20))
    }

  implicit def tuple21Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15], A16: Rig[A16], A17: Rig[A17], A18: Rig[A18], A19: Rig[A19], A20: Rig[A20]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one, A19.one, A20.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21))
    }

  implicit def tuple21Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15], A16: Ring[A16], A17: Ring[A17], A18: Ring[A18], A19: Ring[A19], A20: Ring[A20]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one, A19.one, A20.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19), A19.negate(x._20), A20.negate(x._21))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21))
    }

  implicit def tuple21Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15], A16: Rng[A16], A17: Rng[A17], A18: Rng[A18], A19: Rng[A19], A20: Rng[A20]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19), A19.negate(x._20), A20.negate(x._21))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21))
    }

  implicit def tuple21Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15], A16: Semiring[A16], A17: Semiring[A17], A18: Semiring[A18], A19: Semiring[A19], A20: Semiring[A20]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21))
    }

  implicit def tuple22Rig[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](implicit A0: Rig[A0], A1: Rig[A1], A2: Rig[A2], A3: Rig[A3], A4: Rig[A4], A5: Rig[A5], A6: Rig[A6], A7: Rig[A7], A8: Rig[A8], A9: Rig[A9], A10: Rig[A10], A11: Rig[A11], A12: Rig[A12], A13: Rig[A13], A14: Rig[A14], A15: Rig[A15], A16: Rig[A16], A17: Rig[A17], A18: Rig[A18], A19: Rig[A19], A20: Rig[A20], A21: Rig[A21]): Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    new Rig[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero, A21.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one, A19.one, A20.one, A21.one)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21), A21.plus(x._22, y._22))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21), A21.times(x._22, y._22))
    }

  implicit def tuple22Ring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](implicit A0: Ring[A0], A1: Ring[A1], A2: Ring[A2], A3: Ring[A3], A4: Ring[A4], A5: Ring[A5], A6: Ring[A6], A7: Ring[A7], A8: Ring[A8], A9: Ring[A9], A10: Ring[A10], A11: Ring[A11], A12: Ring[A12], A13: Ring[A13], A14: Ring[A14], A15: Ring[A15], A16: Ring[A16], A17: Ring[A17], A18: Ring[A18], A19: Ring[A19], A20: Ring[A20], A21: Ring[A21]): Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    new Ring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero, A21.zero)
      def one = (A0.one, A1.one, A2.one, A3.one, A4.one, A5.one, A6.one, A7.one, A8.one, A9.one, A10.one, A11.one, A12.one, A13.one, A14.one, A15.one, A16.one, A17.one, A18.one, A19.one, A20.one, A21.one)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19), A19.negate(x._20), A20.negate(x._21), A21.negate(x._22))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21), A21.plus(x._22, y._22))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21), A21.times(x._22, y._22))
    }

  implicit def tuple22Rng[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](implicit A0: Rng[A0], A1: Rng[A1], A2: Rng[A2], A3: Rng[A3], A4: Rng[A4], A5: Rng[A5], A6: Rng[A6], A7: Rng[A7], A8: Rng[A8], A9: Rng[A9], A10: Rng[A10], A11: Rng[A11], A12: Rng[A12], A13: Rng[A13], A14: Rng[A14], A15: Rng[A15], A16: Rng[A16], A17: Rng[A17], A18: Rng[A18], A19: Rng[A19], A20: Rng[A20], A21: Rng[A21]): Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    new Rng[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero, A21.zero)
      def negate(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.negate(x._1), A1.negate(x._2), A2.negate(x._3), A3.negate(x._4), A4.negate(x._5), A5.negate(x._6), A6.negate(x._7), A7.negate(x._8), A8.negate(x._9), A9.negate(x._10), A10.negate(x._11), A11.negate(x._12), A12.negate(x._13), A13.negate(x._14), A14.negate(x._15), A15.negate(x._16), A16.negate(x._17), A17.negate(x._18), A18.negate(x._19), A19.negate(x._20), A20.negate(x._21), A21.negate(x._22))
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21), A21.plus(x._22, y._22))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21), A21.times(x._22, y._22))
    }

  implicit def tuple22Semiring[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](implicit A0: Semiring[A0], A1: Semiring[A1], A2: Semiring[A2], A3: Semiring[A3], A4: Semiring[A4], A5: Semiring[A5], A6: Semiring[A6], A7: Semiring[A7], A8: Semiring[A8], A9: Semiring[A9], A10: Semiring[A10], A11: Semiring[A11], A12: Semiring[A12], A13: Semiring[A13], A14: Semiring[A14], A15: Semiring[A15], A16: Semiring[A16], A17: Semiring[A17], A18: Semiring[A18], A19: Semiring[A19], A20: Semiring[A20], A21: Semiring[A21]): Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    new Semiring[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
      def zero = (A0.zero, A1.zero, A2.zero, A3.zero, A4.zero, A5.zero, A6.zero, A7.zero, A8.zero, A9.zero, A10.zero, A11.zero, A12.zero, A13.zero, A14.zero, A15.zero, A16.zero, A17.zero, A18.zero, A19.zero, A20.zero, A21.zero)
      def plus(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.plus(x._1, y._1), A1.plus(x._2, y._2), A2.plus(x._3, y._3), A3.plus(x._4, y._4), A4.plus(x._5, y._5), A5.plus(x._6, y._6), A6.plus(x._7, y._7), A7.plus(x._8, y._8), A8.plus(x._9, y._9), A9.plus(x._10, y._10), A10.plus(x._11, y._11), A11.plus(x._12, y._12), A12.plus(x._13, y._13), A13.plus(x._14, y._14), A14.plus(x._15, y._15), A15.plus(x._16, y._16), A16.plus(x._17, y._17), A17.plus(x._18, y._18), A18.plus(x._19, y._19), A19.plus(x._20, y._20), A20.plus(x._21, y._21), A21.plus(x._22, y._22))
      def times(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.times(x._1, y._1), A1.times(x._2, y._2), A2.times(x._3, y._3), A3.times(x._4, y._4), A4.times(x._5, y._5), A5.times(x._6, y._6), A6.times(x._7, y._7), A7.times(x._8, y._8), A8.times(x._9, y._9), A9.times(x._10, y._10), A10.times(x._11, y._11), A11.times(x._12, y._12), A12.times(x._13, y._13), A13.times(x._14, y._14), A14.times(x._15, y._15), A15.times(x._16, y._16), A16.times(x._17, y._17), A17.times(x._18, y._18), A18.times(x._19, y._19), A19.times(x._20, y._20), A20.times(x._21, y._21), A21.times(x._22, y._22))
    }
}