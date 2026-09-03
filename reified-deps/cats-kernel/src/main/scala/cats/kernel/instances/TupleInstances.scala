// auto-generated boilerplate

package cats.kernel
package instances

trait TupleInstances extends TupleInstances1 {

  implicit def catsKernelStdCommutativeGroupForTuple1[A0](
    implicit A0: CommutativeGroup[A0]
  ): CommutativeGroup[Tuple1[A0]] =
    Semigroup.catsKernelCommutativeGroupForTuple1[A0]
  implicit def catsKernelStdOrderForTuple1[A0](
    implicit A0: Order[A0]
  ): Order[Tuple1[A0]] =
    Eq.catsKernelOrderForTuple1[A0]
  implicit def catsKernelStdBoundedSemilatticeForTuple1[A0](
    implicit A0: BoundedSemilattice[A0]
  ): BoundedSemilattice[Tuple1[A0]] =
    Semigroup.catsKernelBoundedSemilatticeForTuple1[A0]


  implicit def catsKernelStdCommutativeGroupForTuple2[A0, A1](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1]
  ): CommutativeGroup[(A0, A1)] =
    Semigroup.catsKernelCommutativeGroupForTuple2[A0, A1]
  implicit def catsKernelStdOrderForTuple2[A0, A1](
    implicit A0: Order[A0], A1: Order[A1]
  ): Order[(A0, A1)] =
    Eq.catsKernelOrderForTuple2[A0, A1]
  implicit def catsKernelStdBoundedSemilatticeForTuple2[A0, A1](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1]
  ): BoundedSemilattice[(A0, A1)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple2[A0, A1]


  implicit def catsKernelStdCommutativeGroupForTuple3[A0, A1, A2](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2]
  ): CommutativeGroup[(A0, A1, A2)] =
    Semigroup.catsKernelCommutativeGroupForTuple3[A0, A1, A2]
  implicit def catsKernelStdOrderForTuple3[A0, A1, A2](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2]
  ): Order[(A0, A1, A2)] =
    Eq.catsKernelOrderForTuple3[A0, A1, A2]
  implicit def catsKernelStdBoundedSemilatticeForTuple3[A0, A1, A2](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2]
  ): BoundedSemilattice[(A0, A1, A2)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple3[A0, A1, A2]


  implicit def catsKernelStdCommutativeGroupForTuple4[A0, A1, A2, A3](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3]
  ): CommutativeGroup[(A0, A1, A2, A3)] =
    Semigroup.catsKernelCommutativeGroupForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdOrderForTuple4[A0, A1, A2, A3](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3]
  ): Order[(A0, A1, A2, A3)] =
    Eq.catsKernelOrderForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdBoundedSemilatticeForTuple4[A0, A1, A2, A3](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3]
  ): BoundedSemilattice[(A0, A1, A2, A3)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple4[A0, A1, A2, A3]


  implicit def catsKernelStdCommutativeGroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4]
  ): CommutativeGroup[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelCommutativeGroupForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdOrderForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4]
  ): Order[(A0, A1, A2, A3, A4)] =
    Eq.catsKernelOrderForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdBoundedSemilatticeForTuple5[A0, A1, A2, A3, A4](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple5[A0, A1, A2, A3, A4]


  implicit def catsKernelStdCommutativeGroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelCommutativeGroupForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdOrderForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5]
  ): Order[(A0, A1, A2, A3, A4, A5)] =
    Eq.catsKernelOrderForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdBoundedSemilatticeForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple6[A0, A1, A2, A3, A4, A5]


  implicit def catsKernelStdCommutativeGroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelCommutativeGroupForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdOrderForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6]
  ): Order[(A0, A1, A2, A3, A4, A5, A6)] =
    Eq.catsKernelOrderForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdBoundedSemilatticeForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple7[A0, A1, A2, A3, A4, A5, A6]


  implicit def catsKernelStdCommutativeGroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelCommutativeGroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdOrderForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Eq.catsKernelOrderForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdBoundedSemilatticeForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]


  implicit def catsKernelStdCommutativeGroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelCommutativeGroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdOrderForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Eq.catsKernelOrderForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdBoundedSemilatticeForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]


  implicit def catsKernelStdCommutativeGroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelCommutativeGroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdOrderForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Eq.catsKernelOrderForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdBoundedSemilatticeForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]


  implicit def catsKernelStdCommutativeGroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelCommutativeGroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdOrderForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Eq.catsKernelOrderForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdBoundedSemilatticeForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]


  implicit def catsKernelStdCommutativeGroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelCommutativeGroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdOrderForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Eq.catsKernelOrderForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdBoundedSemilatticeForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]


  implicit def catsKernelStdCommutativeGroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelCommutativeGroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdOrderForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Eq.catsKernelOrderForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdBoundedSemilatticeForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]


  implicit def catsKernelStdCommutativeGroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelCommutativeGroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdOrderForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Eq.catsKernelOrderForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdBoundedSemilatticeForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]


  implicit def catsKernelStdCommutativeGroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelCommutativeGroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdOrderForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Eq.catsKernelOrderForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdBoundedSemilatticeForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]


  implicit def catsKernelStdCommutativeGroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelCommutativeGroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdOrderForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Eq.catsKernelOrderForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdBoundedSemilatticeForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]


  implicit def catsKernelStdCommutativeGroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelCommutativeGroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdOrderForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Eq.catsKernelOrderForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdBoundedSemilatticeForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]


  implicit def catsKernelStdCommutativeGroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelCommutativeGroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdOrderForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Eq.catsKernelOrderForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdBoundedSemilatticeForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]


  implicit def catsKernelStdCommutativeGroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelCommutativeGroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdOrderForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Eq.catsKernelOrderForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdBoundedSemilatticeForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]


  implicit def catsKernelStdCommutativeGroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18], A19: CommutativeGroup[A19]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelCommutativeGroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdOrderForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18], A19: Order[A19]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Eq.catsKernelOrderForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdBoundedSemilatticeForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18], A19: BoundedSemilattice[A19]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]


  implicit def catsKernelStdCommutativeGroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18], A19: CommutativeGroup[A19], A20: CommutativeGroup[A20]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelCommutativeGroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdOrderForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18], A19: Order[A19], A20: Order[A20]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Eq.catsKernelOrderForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdBoundedSemilatticeForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18], A19: BoundedSemilattice[A19], A20: BoundedSemilattice[A20]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]


  implicit def catsKernelStdCommutativeGroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18], A19: CommutativeGroup[A19], A20: CommutativeGroup[A20], A21: CommutativeGroup[A21]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelCommutativeGroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdOrderForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18], A19: Order[A19], A20: Order[A20], A21: Order[A21]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Eq.catsKernelOrderForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdBoundedSemilatticeForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18], A19: BoundedSemilattice[A19], A20: BoundedSemilattice[A20], A21: BoundedSemilattice[A21]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelBoundedSemilatticeForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]

}

private[instances] trait TupleInstances1 extends TupleInstances2 {

  implicit def catsKernelStdSemilatticeForTuple1[A0](
    implicit A0: Semilattice[A0]
  ): Semilattice[Tuple1[A0]] =
    Semigroup.catsKernelSemilatticeForTuple1[A0]
  implicit def catsKernelStdCommutativeMonoidForTuple1[A0](
    implicit A0: CommutativeMonoid[A0]
  ): CommutativeMonoid[Tuple1[A0]] =
    Semigroup.catsKernelCommutativeMonoidForTuple1[A0]
  implicit def catsKernelStdGroupForTuple1[A0](
    implicit A0: Group[A0]
  ): Group[Tuple1[A0]] =
    Semigroup.catsKernelGroupForTuple1[A0]
  implicit def catsKernelStdHashForTuple1[A0](
    implicit A0: Hash[A0]
  ): Hash[Tuple1[A0]] =
    Eq.catsKernelHashForTuple1[A0]
  implicit def catsKernelStdPartialOrderForTuple1[A0](
    implicit A0: PartialOrder[A0]
  ): PartialOrder[Tuple1[A0]] =
    Eq.catsKernelPartialOrderForTuple1[A0]


  implicit def catsKernelStdSemilatticeForTuple2[A0, A1](
    implicit A0: Semilattice[A0], A1: Semilattice[A1]
  ): Semilattice[(A0, A1)] =
    Semigroup.catsKernelSemilatticeForTuple2[A0, A1]
  implicit def catsKernelStdCommutativeMonoidForTuple2[A0, A1](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1]
  ): CommutativeMonoid[(A0, A1)] =
    Semigroup.catsKernelCommutativeMonoidForTuple2[A0, A1]
  implicit def catsKernelStdGroupForTuple2[A0, A1](
    implicit A0: Group[A0], A1: Group[A1]
  ): Group[(A0, A1)] =
    Semigroup.catsKernelGroupForTuple2[A0, A1]
  implicit def catsKernelStdHashForTuple2[A0, A1](
    implicit A0: Hash[A0], A1: Hash[A1]
  ): Hash[(A0, A1)] =
    Eq.catsKernelHashForTuple2[A0, A1]
  implicit def catsKernelStdPartialOrderForTuple2[A0, A1](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1]
  ): PartialOrder[(A0, A1)] =
    Eq.catsKernelPartialOrderForTuple2[A0, A1]


  implicit def catsKernelStdSemilatticeForTuple3[A0, A1, A2](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2]
  ): Semilattice[(A0, A1, A2)] =
    Semigroup.catsKernelSemilatticeForTuple3[A0, A1, A2]
  implicit def catsKernelStdCommutativeMonoidForTuple3[A0, A1, A2](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2]
  ): CommutativeMonoid[(A0, A1, A2)] =
    Semigroup.catsKernelCommutativeMonoidForTuple3[A0, A1, A2]
  implicit def catsKernelStdGroupForTuple3[A0, A1, A2](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2]
  ): Group[(A0, A1, A2)] =
    Semigroup.catsKernelGroupForTuple3[A0, A1, A2]
  implicit def catsKernelStdHashForTuple3[A0, A1, A2](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2]
  ): Hash[(A0, A1, A2)] =
    Eq.catsKernelHashForTuple3[A0, A1, A2]
  implicit def catsKernelStdPartialOrderForTuple3[A0, A1, A2](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2]
  ): PartialOrder[(A0, A1, A2)] =
    Eq.catsKernelPartialOrderForTuple3[A0, A1, A2]


  implicit def catsKernelStdSemilatticeForTuple4[A0, A1, A2, A3](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3]
  ): Semilattice[(A0, A1, A2, A3)] =
    Semigroup.catsKernelSemilatticeForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdCommutativeMonoidForTuple4[A0, A1, A2, A3](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3]
  ): CommutativeMonoid[(A0, A1, A2, A3)] =
    Semigroup.catsKernelCommutativeMonoidForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdGroupForTuple4[A0, A1, A2, A3](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3]
  ): Group[(A0, A1, A2, A3)] =
    Semigroup.catsKernelGroupForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdHashForTuple4[A0, A1, A2, A3](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3]
  ): Hash[(A0, A1, A2, A3)] =
    Eq.catsKernelHashForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdPartialOrderForTuple4[A0, A1, A2, A3](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3]
  ): PartialOrder[(A0, A1, A2, A3)] =
    Eq.catsKernelPartialOrderForTuple4[A0, A1, A2, A3]


  implicit def catsKernelStdSemilatticeForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4]
  ): Semilattice[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelSemilatticeForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdCommutativeMonoidForTuple5[A0, A1, A2, A3, A4](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelCommutativeMonoidForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdGroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4]
  ): Group[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelGroupForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdHashForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4]
  ): Hash[(A0, A1, A2, A3, A4)] =
    Eq.catsKernelHashForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdPartialOrderForTuple5[A0, A1, A2, A3, A4](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4]
  ): PartialOrder[(A0, A1, A2, A3, A4)] =
    Eq.catsKernelPartialOrderForTuple5[A0, A1, A2, A3, A4]


  implicit def catsKernelStdSemilatticeForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5]
  ): Semilattice[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelSemilatticeForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdCommutativeMonoidForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelCommutativeMonoidForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdGroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5]
  ): Group[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelGroupForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdHashForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5]
  ): Hash[(A0, A1, A2, A3, A4, A5)] =
    Eq.catsKernelHashForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdPartialOrderForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5)] =
    Eq.catsKernelPartialOrderForTuple6[A0, A1, A2, A3, A4, A5]


  implicit def catsKernelStdSemilatticeForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelSemilatticeForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdCommutativeMonoidForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelCommutativeMonoidForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdGroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6]
  ): Group[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelGroupForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdHashForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6)] =
    Eq.catsKernelHashForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdPartialOrderForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6)] =
    Eq.catsKernelPartialOrderForTuple7[A0, A1, A2, A3, A4, A5, A6]


  implicit def catsKernelStdSemilatticeForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelSemilatticeForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdCommutativeMonoidForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelCommutativeMonoidForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdGroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelGroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdHashForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Eq.catsKernelHashForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdPartialOrderForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Eq.catsKernelPartialOrderForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]


  implicit def catsKernelStdSemilatticeForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelSemilatticeForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdCommutativeMonoidForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelCommutativeMonoidForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdGroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelGroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdHashForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Eq.catsKernelHashForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdPartialOrderForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Eq.catsKernelPartialOrderForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]


  implicit def catsKernelStdSemilatticeForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelSemilatticeForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdCommutativeMonoidForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelCommutativeMonoidForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdGroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelGroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdHashForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Eq.catsKernelHashForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdPartialOrderForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Eq.catsKernelPartialOrderForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]


  implicit def catsKernelStdSemilatticeForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelSemilatticeForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdCommutativeMonoidForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelCommutativeMonoidForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdGroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelGroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdHashForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Eq.catsKernelHashForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdPartialOrderForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Eq.catsKernelPartialOrderForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]


  implicit def catsKernelStdSemilatticeForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelSemilatticeForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdCommutativeMonoidForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelCommutativeMonoidForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdGroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelGroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdHashForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Eq.catsKernelHashForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdPartialOrderForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Eq.catsKernelPartialOrderForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]


  implicit def catsKernelStdSemilatticeForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelSemilatticeForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdCommutativeMonoidForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelCommutativeMonoidForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdGroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelGroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdHashForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Eq.catsKernelHashForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdPartialOrderForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Eq.catsKernelPartialOrderForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]


  implicit def catsKernelStdSemilatticeForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelSemilatticeForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdCommutativeMonoidForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelCommutativeMonoidForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdGroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelGroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdHashForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Eq.catsKernelHashForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdPartialOrderForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Eq.catsKernelPartialOrderForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]


  implicit def catsKernelStdSemilatticeForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelSemilatticeForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdCommutativeMonoidForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelCommutativeMonoidForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdGroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelGroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdHashForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Eq.catsKernelHashForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdPartialOrderForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Eq.catsKernelPartialOrderForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]


  implicit def catsKernelStdSemilatticeForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelSemilatticeForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdCommutativeMonoidForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelCommutativeMonoidForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdGroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelGroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdHashForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Eq.catsKernelHashForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdPartialOrderForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Eq.catsKernelPartialOrderForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]


  implicit def catsKernelStdSemilatticeForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelSemilatticeForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdCommutativeMonoidForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelCommutativeMonoidForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdGroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelGroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdHashForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Eq.catsKernelHashForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdPartialOrderForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Eq.catsKernelPartialOrderForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]


  implicit def catsKernelStdSemilatticeForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelSemilatticeForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdCommutativeMonoidForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelCommutativeMonoidForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdGroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelGroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdHashForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Eq.catsKernelHashForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdPartialOrderForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Eq.catsKernelPartialOrderForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]


  implicit def catsKernelStdSemilatticeForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelSemilatticeForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdCommutativeMonoidForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelCommutativeMonoidForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdGroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelGroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdHashForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Eq.catsKernelHashForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdPartialOrderForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Eq.catsKernelPartialOrderForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]


  implicit def catsKernelStdSemilatticeForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18], A19: Semilattice[A19]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelSemilatticeForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdCommutativeMonoidForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18], A19: CommutativeMonoid[A19]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelCommutativeMonoidForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdGroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18], A19: Group[A19]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelGroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdHashForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18], A19: Hash[A19]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Eq.catsKernelHashForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdPartialOrderForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18], A19: PartialOrder[A19]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Eq.catsKernelPartialOrderForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]


  implicit def catsKernelStdSemilatticeForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18], A19: Semilattice[A19], A20: Semilattice[A20]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelSemilatticeForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdCommutativeMonoidForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18], A19: CommutativeMonoid[A19], A20: CommutativeMonoid[A20]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelCommutativeMonoidForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdGroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18], A19: Group[A19], A20: Group[A20]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelGroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdHashForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18], A19: Hash[A19], A20: Hash[A20]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Eq.catsKernelHashForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdPartialOrderForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18], A19: PartialOrder[A19], A20: PartialOrder[A20]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Eq.catsKernelPartialOrderForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]


  implicit def catsKernelStdSemilatticeForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18], A19: Semilattice[A19], A20: Semilattice[A20], A21: Semilattice[A21]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelSemilatticeForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdCommutativeMonoidForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18], A19: CommutativeMonoid[A19], A20: CommutativeMonoid[A20], A21: CommutativeMonoid[A21]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelCommutativeMonoidForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdGroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18], A19: Group[A19], A20: Group[A20], A21: Group[A21]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelGroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdHashForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18], A19: Hash[A19], A20: Hash[A20], A21: Hash[A21]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Eq.catsKernelHashForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdPartialOrderForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18], A19: PartialOrder[A19], A20: PartialOrder[A20], A21: PartialOrder[A21]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Eq.catsKernelPartialOrderForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]

}

private[instances] trait TupleInstances2 extends TupleInstances3 {

  implicit def catsKernelStdBandForTuple1[A0](
    implicit A0: Band[A0]
  ): Band[Tuple1[A0]] =
    Semigroup.catsKernelBandForTuple1[A0]
  implicit def catsKernelStdCommutativeSemigroupForTuple1[A0](
    implicit A0: CommutativeSemigroup[A0]
  ): CommutativeSemigroup[Tuple1[A0]] =
    Semigroup.catsKernelCommutativeSemigroupForTuple1[A0]
  implicit def catsKernelStdMonoidForTuple1[A0](
    implicit A0: Monoid[A0]
  ): Monoid[Tuple1[A0]] =
    Semigroup.catsKernelMonoidForTuple1[A0]


  implicit def catsKernelStdBandForTuple2[A0, A1](
    implicit A0: Band[A0], A1: Band[A1]
  ): Band[(A0, A1)] =
    Semigroup.catsKernelBandForTuple2[A0, A1]
  implicit def catsKernelStdCommutativeSemigroupForTuple2[A0, A1](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1]
  ): CommutativeSemigroup[(A0, A1)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple2[A0, A1]
  implicit def catsKernelStdMonoidForTuple2[A0, A1](
    implicit A0: Monoid[A0], A1: Monoid[A1]
  ): Monoid[(A0, A1)] =
    Semigroup.catsKernelMonoidForTuple2[A0, A1]


  implicit def catsKernelStdBandForTuple3[A0, A1, A2](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2]
  ): Band[(A0, A1, A2)] =
    Semigroup.catsKernelBandForTuple3[A0, A1, A2]
  implicit def catsKernelStdCommutativeSemigroupForTuple3[A0, A1, A2](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2]
  ): CommutativeSemigroup[(A0, A1, A2)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple3[A0, A1, A2]
  implicit def catsKernelStdMonoidForTuple3[A0, A1, A2](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2]
  ): Monoid[(A0, A1, A2)] =
    Semigroup.catsKernelMonoidForTuple3[A0, A1, A2]


  implicit def catsKernelStdBandForTuple4[A0, A1, A2, A3](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3]
  ): Band[(A0, A1, A2, A3)] =
    Semigroup.catsKernelBandForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdCommutativeSemigroupForTuple4[A0, A1, A2, A3](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3]
  ): CommutativeSemigroup[(A0, A1, A2, A3)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdMonoidForTuple4[A0, A1, A2, A3](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3]
  ): Monoid[(A0, A1, A2, A3)] =
    Semigroup.catsKernelMonoidForTuple4[A0, A1, A2, A3]


  implicit def catsKernelStdBandForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4]
  ): Band[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelBandForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdCommutativeSemigroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdMonoidForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4]
  ): Monoid[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelMonoidForTuple5[A0, A1, A2, A3, A4]


  implicit def catsKernelStdBandForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5]
  ): Band[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelBandForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdCommutativeSemigroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdMonoidForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5]
  ): Monoid[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelMonoidForTuple6[A0, A1, A2, A3, A4, A5]


  implicit def catsKernelStdBandForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6]
  ): Band[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelBandForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdCommutativeSemigroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdMonoidForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelMonoidForTuple7[A0, A1, A2, A3, A4, A5, A6]


  implicit def catsKernelStdBandForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelBandForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdCommutativeSemigroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdMonoidForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelMonoidForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]


  implicit def catsKernelStdBandForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelBandForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdCommutativeSemigroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdMonoidForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelMonoidForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]


  implicit def catsKernelStdBandForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelBandForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdCommutativeSemigroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdMonoidForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelMonoidForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]


  implicit def catsKernelStdBandForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelBandForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdCommutativeSemigroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdMonoidForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelMonoidForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]


  implicit def catsKernelStdBandForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelBandForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdCommutativeSemigroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdMonoidForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelMonoidForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]


  implicit def catsKernelStdBandForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelBandForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdCommutativeSemigroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdMonoidForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelMonoidForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]


  implicit def catsKernelStdBandForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelBandForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdCommutativeSemigroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdMonoidForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelMonoidForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]


  implicit def catsKernelStdBandForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelBandForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdCommutativeSemigroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdMonoidForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelMonoidForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]


  implicit def catsKernelStdBandForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelBandForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdCommutativeSemigroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdMonoidForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelMonoidForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]


  implicit def catsKernelStdBandForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelBandForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdCommutativeSemigroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdMonoidForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelMonoidForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]


  implicit def catsKernelStdBandForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelBandForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdCommutativeSemigroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdMonoidForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelMonoidForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]


  implicit def catsKernelStdBandForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelBandForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdCommutativeSemigroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdMonoidForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelMonoidForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]


  implicit def catsKernelStdBandForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18], A19: Band[A19]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelBandForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdCommutativeSemigroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18], A19: CommutativeSemigroup[A19]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdMonoidForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18], A19: Monoid[A19]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelMonoidForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]


  implicit def catsKernelStdBandForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18], A19: Band[A19], A20: Band[A20]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelBandForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdCommutativeSemigroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18], A19: CommutativeSemigroup[A19], A20: CommutativeSemigroup[A20]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdMonoidForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18], A19: Monoid[A19], A20: Monoid[A20]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelMonoidForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]


  implicit def catsKernelStdBandForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18], A19: Band[A19], A20: Band[A20], A21: Band[A21]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelBandForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdCommutativeSemigroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18], A19: CommutativeSemigroup[A19], A20: CommutativeSemigroup[A20], A21: CommutativeSemigroup[A21]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelCommutativeSemigroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdMonoidForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18], A19: Monoid[A19], A20: Monoid[A20], A21: Monoid[A21]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelMonoidForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]

}

private[instances] trait TupleInstances3 {

  implicit def catsKernelStdSemigroupForTuple1[A0](
    implicit A0: Semigroup[A0]
  ): Semigroup[Tuple1[A0]] =
    Semigroup.catsKernelSemigroupForTuple1[A0]
  implicit def catsKernelStdEqForTuple1[A0](
    implicit A0: Eq[A0]
  ): Eq[Tuple1[A0]] =
    Eq.catsKernelEqForTuple1[A0]


  implicit def catsKernelStdSemigroupForTuple2[A0, A1](
    implicit A0: Semigroup[A0], A1: Semigroup[A1]
  ): Semigroup[(A0, A1)] =
    Semigroup.catsKernelSemigroupForTuple2[A0, A1]
  implicit def catsKernelStdEqForTuple2[A0, A1](
    implicit A0: Eq[A0], A1: Eq[A1]
  ): Eq[(A0, A1)] =
    Eq.catsKernelEqForTuple2[A0, A1]


  implicit def catsKernelStdSemigroupForTuple3[A0, A1, A2](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2]
  ): Semigroup[(A0, A1, A2)] =
    Semigroup.catsKernelSemigroupForTuple3[A0, A1, A2]
  implicit def catsKernelStdEqForTuple3[A0, A1, A2](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2]
  ): Eq[(A0, A1, A2)] =
    Eq.catsKernelEqForTuple3[A0, A1, A2]


  implicit def catsKernelStdSemigroupForTuple4[A0, A1, A2, A3](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3]
  ): Semigroup[(A0, A1, A2, A3)] =
    Semigroup.catsKernelSemigroupForTuple4[A0, A1, A2, A3]
  implicit def catsKernelStdEqForTuple4[A0, A1, A2, A3](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3]
  ): Eq[(A0, A1, A2, A3)] =
    Eq.catsKernelEqForTuple4[A0, A1, A2, A3]


  implicit def catsKernelStdSemigroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4]
  ): Semigroup[(A0, A1, A2, A3, A4)] =
    Semigroup.catsKernelSemigroupForTuple5[A0, A1, A2, A3, A4]
  implicit def catsKernelStdEqForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4]
  ): Eq[(A0, A1, A2, A3, A4)] =
    Eq.catsKernelEqForTuple5[A0, A1, A2, A3, A4]


  implicit def catsKernelStdSemigroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5]
  ): Semigroup[(A0, A1, A2, A3, A4, A5)] =
    Semigroup.catsKernelSemigroupForTuple6[A0, A1, A2, A3, A4, A5]
  implicit def catsKernelStdEqForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5]
  ): Eq[(A0, A1, A2, A3, A4, A5)] =
    Eq.catsKernelEqForTuple6[A0, A1, A2, A3, A4, A5]


  implicit def catsKernelStdSemigroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6)] =
    Semigroup.catsKernelSemigroupForTuple7[A0, A1, A2, A3, A4, A5, A6]
  implicit def catsKernelStdEqForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6)] =
    Eq.catsKernelEqForTuple7[A0, A1, A2, A3, A4, A5, A6]


  implicit def catsKernelStdSemigroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Semigroup.catsKernelSemigroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]
  implicit def catsKernelStdEqForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7)] =
    Eq.catsKernelEqForTuple8[A0, A1, A2, A3, A4, A5, A6, A7]


  implicit def catsKernelStdSemigroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Semigroup.catsKernelSemigroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]
  implicit def catsKernelStdEqForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] =
    Eq.catsKernelEqForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8]


  implicit def catsKernelStdSemigroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Semigroup.catsKernelSemigroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]
  implicit def catsKernelStdEqForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] =
    Eq.catsKernelEqForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9]


  implicit def catsKernelStdSemigroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Semigroup.catsKernelSemigroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]
  implicit def catsKernelStdEqForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] =
    Eq.catsKernelEqForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]


  implicit def catsKernelStdSemigroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Semigroup.catsKernelSemigroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]
  implicit def catsKernelStdEqForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] =
    Eq.catsKernelEqForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]


  implicit def catsKernelStdSemigroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Semigroup.catsKernelSemigroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]
  implicit def catsKernelStdEqForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] =
    Eq.catsKernelEqForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]


  implicit def catsKernelStdSemigroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Semigroup.catsKernelSemigroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]
  implicit def catsKernelStdEqForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] =
    Eq.catsKernelEqForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]


  implicit def catsKernelStdSemigroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Semigroup.catsKernelSemigroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]
  implicit def catsKernelStdEqForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] =
    Eq.catsKernelEqForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]


  implicit def catsKernelStdSemigroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Semigroup.catsKernelSemigroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]
  implicit def catsKernelStdEqForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] =
    Eq.catsKernelEqForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]


  implicit def catsKernelStdSemigroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Semigroup.catsKernelSemigroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]
  implicit def catsKernelStdEqForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] =
    Eq.catsKernelEqForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]


  implicit def catsKernelStdSemigroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Semigroup.catsKernelSemigroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]
  implicit def catsKernelStdEqForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] =
    Eq.catsKernelEqForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]


  implicit def catsKernelStdSemigroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Semigroup.catsKernelSemigroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]
  implicit def catsKernelStdEqForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] =
    Eq.catsKernelEqForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]


  implicit def catsKernelStdSemigroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18], A19: Semigroup[A19]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Semigroup.catsKernelSemigroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]
  implicit def catsKernelStdEqForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18], A19: Eq[A19]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] =
    Eq.catsKernelEqForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]


  implicit def catsKernelStdSemigroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18], A19: Semigroup[A19], A20: Semigroup[A20]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Semigroup.catsKernelSemigroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]
  implicit def catsKernelStdEqForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18], A19: Eq[A19], A20: Eq[A20]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] =
    Eq.catsKernelEqForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]


  implicit def catsKernelStdSemigroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18], A19: Semigroup[A19], A20: Semigroup[A20], A21: Semigroup[A21]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Semigroup.catsKernelSemigroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]
  implicit def catsKernelStdEqForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18], A19: Eq[A19], A20: Eq[A20], A21: Eq[A21]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] =
    Eq.catsKernelEqForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]

}
private[kernel] trait TupleBandInstances extends TupleSemigroupInstances {

  implicit def catsKernelBandForTuple1[A0](
    implicit A0: Band[A0]
  ): Band[Tuple1[A0]] = Band.instance { (x, y) =>
    Tuple1(A0.combine(x._1, y._1))
  }

  implicit def catsKernelBandForTuple2[A0, A1](
    implicit A0: Band[A0], A1: Band[A1]
  ): Band[(A0, A1)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  }

  implicit def catsKernelBandForTuple3[A0, A1, A2](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2]
  ): Band[(A0, A1, A2)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  }

  implicit def catsKernelBandForTuple4[A0, A1, A2, A3](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3]
  ): Band[(A0, A1, A2, A3)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  }

  implicit def catsKernelBandForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4]
  ): Band[(A0, A1, A2, A3, A4)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  }

  implicit def catsKernelBandForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5]
  ): Band[(A0, A1, A2, A3, A4, A5)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  }

  implicit def catsKernelBandForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6]
  ): Band[(A0, A1, A2, A3, A4, A5, A6)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  }

  implicit def catsKernelBandForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  }

  implicit def catsKernelBandForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  }

  implicit def catsKernelBandForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  }

  implicit def catsKernelBandForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  }

  implicit def catsKernelBandForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  }

  implicit def catsKernelBandForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  }

  implicit def catsKernelBandForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  }

  implicit def catsKernelBandForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  }

  implicit def catsKernelBandForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  }

  implicit def catsKernelBandForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  }

  implicit def catsKernelBandForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  }

  implicit def catsKernelBandForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  }

  implicit def catsKernelBandForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18], A19: Band[A19]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  }

  implicit def catsKernelBandForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18], A19: Band[A19], A20: Band[A20]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  }

  implicit def catsKernelBandForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Band[A0], A1: Band[A1], A2: Band[A2], A3: Band[A3], A4: Band[A4], A5: Band[A5], A6: Band[A6], A7: Band[A7], A8: Band[A8], A9: Band[A9], A10: Band[A10], A11: Band[A11], A12: Band[A12], A13: Band[A13], A14: Band[A14], A15: Band[A15], A16: Band[A16], A17: Band[A17], A18: Band[A18], A19: Band[A19], A20: Band[A20], A21: Band[A21]
  ): Band[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Band.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  }
}
private[kernel] trait TupleBoundedSemilatticeInstances extends TupleGroupInstances {

  implicit def catsKernelBoundedSemilatticeForTuple1[A0](
    implicit A0: BoundedSemilattice[A0]
  ): BoundedSemilattice[Tuple1[A0]] = BoundedSemilattice.instance(
    Tuple1(A0.empty),
    (x, y) => Tuple1(A0.combine(x._1, y._1))
  )

  implicit def catsKernelBoundedSemilatticeForTuple2[A0, A1](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1]
  ): BoundedSemilattice[(A0, A1)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  )

  implicit def catsKernelBoundedSemilatticeForTuple3[A0, A1, A2](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2]
  ): BoundedSemilattice[(A0, A1, A2)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  )

  implicit def catsKernelBoundedSemilatticeForTuple4[A0, A1, A2, A3](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3]
  ): BoundedSemilattice[(A0, A1, A2, A3)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  )

  implicit def catsKernelBoundedSemilatticeForTuple5[A0, A1, A2, A3, A4](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  )

  implicit def catsKernelBoundedSemilatticeForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  )

  implicit def catsKernelBoundedSemilatticeForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  )

  implicit def catsKernelBoundedSemilatticeForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  )

  implicit def catsKernelBoundedSemilatticeForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  )

  implicit def catsKernelBoundedSemilatticeForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  )

  implicit def catsKernelBoundedSemilatticeForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  )

  implicit def catsKernelBoundedSemilatticeForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  )

  implicit def catsKernelBoundedSemilatticeForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  )

  implicit def catsKernelBoundedSemilatticeForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  )

  implicit def catsKernelBoundedSemilatticeForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  )

  implicit def catsKernelBoundedSemilatticeForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  )

  implicit def catsKernelBoundedSemilatticeForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  )

  implicit def catsKernelBoundedSemilatticeForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  )

  implicit def catsKernelBoundedSemilatticeForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  )

  implicit def catsKernelBoundedSemilatticeForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18], A19: BoundedSemilattice[A19]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  )

  implicit def catsKernelBoundedSemilatticeForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18], A19: BoundedSemilattice[A19], A20: BoundedSemilattice[A20]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  )

  implicit def catsKernelBoundedSemilatticeForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: BoundedSemilattice[A0], A1: BoundedSemilattice[A1], A2: BoundedSemilattice[A2], A3: BoundedSemilattice[A3], A4: BoundedSemilattice[A4], A5: BoundedSemilattice[A5], A6: BoundedSemilattice[A6], A7: BoundedSemilattice[A7], A8: BoundedSemilattice[A8], A9: BoundedSemilattice[A9], A10: BoundedSemilattice[A10], A11: BoundedSemilattice[A11], A12: BoundedSemilattice[A12], A13: BoundedSemilattice[A13], A14: BoundedSemilattice[A14], A15: BoundedSemilattice[A15], A16: BoundedSemilattice[A16], A17: BoundedSemilattice[A17], A18: BoundedSemilattice[A18], A19: BoundedSemilattice[A19], A20: BoundedSemilattice[A20], A21: BoundedSemilattice[A21]
  ): BoundedSemilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = BoundedSemilattice.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty, A21.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  )
}
private[kernel] trait TupleCommutativeGroupInstances extends TupleBoundedSemilatticeInstances {

  implicit def catsKernelCommutativeGroupForTuple1[A0](
    implicit A0: CommutativeGroup[A0]
  ): CommutativeGroup[Tuple1[A0]] = new CommutativeGroup[Tuple1[A0]] {
    def empty = Tuple1(A0.empty)
    def inverse(x: Tuple1[A0]) = Tuple1(A0.inverse(x._1))
    def combine(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.combine(x._1, y._1))
  }

  implicit def catsKernelCommutativeGroupForTuple2[A0, A1](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1]
  ): CommutativeGroup[(A0, A1)] = new CommutativeGroup[(A0, A1)] {
    def empty = (A0.empty, A1.empty)
    def inverse(x: (A0, A1)) = (A0.inverse(x._1), A1.inverse(x._2))
    def combine(x: (A0, A1), y: (A0, A1)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  }

  implicit def catsKernelCommutativeGroupForTuple3[A0, A1, A2](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2]
  ): CommutativeGroup[(A0, A1, A2)] = new CommutativeGroup[(A0, A1, A2)] {
    def empty = (A0.empty, A1.empty, A2.empty)
    def inverse(x: (A0, A1, A2)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3))
    def combine(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  }

  implicit def catsKernelCommutativeGroupForTuple4[A0, A1, A2, A3](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3]
  ): CommutativeGroup[(A0, A1, A2, A3)] = new CommutativeGroup[(A0, A1, A2, A3)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty)
    def inverse(x: (A0, A1, A2, A3)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4))
    def combine(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  }

  implicit def catsKernelCommutativeGroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4]
  ): CommutativeGroup[(A0, A1, A2, A3, A4)] = new CommutativeGroup[(A0, A1, A2, A3, A4)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty)
    def inverse(x: (A0, A1, A2, A3, A4)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5))
    def combine(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  }

  implicit def catsKernelCommutativeGroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6))
    def combine(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  }

  implicit def catsKernelCommutativeGroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  }

  implicit def catsKernelCommutativeGroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  }

  implicit def catsKernelCommutativeGroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  }

  implicit def catsKernelCommutativeGroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  }

  implicit def catsKernelCommutativeGroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  }

  implicit def catsKernelCommutativeGroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  }

  implicit def catsKernelCommutativeGroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  }

  implicit def catsKernelCommutativeGroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  }

  implicit def catsKernelCommutativeGroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  }

  implicit def catsKernelCommutativeGroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  }

  implicit def catsKernelCommutativeGroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  }

  implicit def catsKernelCommutativeGroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  }

  implicit def catsKernelCommutativeGroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  }

  implicit def catsKernelCommutativeGroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18], A19: CommutativeGroup[A19]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19), A19.inverse(x._20))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  }

  implicit def catsKernelCommutativeGroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18], A19: CommutativeGroup[A19], A20: CommutativeGroup[A20]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19), A19.inverse(x._20), A20.inverse(x._21))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  }

  implicit def catsKernelCommutativeGroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: CommutativeGroup[A0], A1: CommutativeGroup[A1], A2: CommutativeGroup[A2], A3: CommutativeGroup[A3], A4: CommutativeGroup[A4], A5: CommutativeGroup[A5], A6: CommutativeGroup[A6], A7: CommutativeGroup[A7], A8: CommutativeGroup[A8], A9: CommutativeGroup[A9], A10: CommutativeGroup[A10], A11: CommutativeGroup[A11], A12: CommutativeGroup[A12], A13: CommutativeGroup[A13], A14: CommutativeGroup[A14], A15: CommutativeGroup[A15], A16: CommutativeGroup[A16], A17: CommutativeGroup[A17], A18: CommutativeGroup[A18], A19: CommutativeGroup[A19], A20: CommutativeGroup[A20], A21: CommutativeGroup[A21]
  ): CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = new CommutativeGroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty, A21.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19), A19.inverse(x._20), A20.inverse(x._21), A21.inverse(x._22))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  }
}
private[kernel] trait TupleCommutativeMonoidInstances extends TupleSemilatticeInstances {

  implicit def catsKernelCommutativeMonoidForTuple1[A0](
    implicit A0: CommutativeMonoid[A0]
  ): CommutativeMonoid[Tuple1[A0]] = CommutativeMonoid.instance(
    Tuple1(A0.empty),
    (x, y) => Tuple1(A0.combine(x._1, y._1))
  )

  implicit def catsKernelCommutativeMonoidForTuple2[A0, A1](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1]
  ): CommutativeMonoid[(A0, A1)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  )

  implicit def catsKernelCommutativeMonoidForTuple3[A0, A1, A2](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2]
  ): CommutativeMonoid[(A0, A1, A2)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  )

  implicit def catsKernelCommutativeMonoidForTuple4[A0, A1, A2, A3](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3]
  ): CommutativeMonoid[(A0, A1, A2, A3)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  )

  implicit def catsKernelCommutativeMonoidForTuple5[A0, A1, A2, A3, A4](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  )

  implicit def catsKernelCommutativeMonoidForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  )

  implicit def catsKernelCommutativeMonoidForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  )

  implicit def catsKernelCommutativeMonoidForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  )

  implicit def catsKernelCommutativeMonoidForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  )

  implicit def catsKernelCommutativeMonoidForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  )

  implicit def catsKernelCommutativeMonoidForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  )

  implicit def catsKernelCommutativeMonoidForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  )

  implicit def catsKernelCommutativeMonoidForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  )

  implicit def catsKernelCommutativeMonoidForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  )

  implicit def catsKernelCommutativeMonoidForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  )

  implicit def catsKernelCommutativeMonoidForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  )

  implicit def catsKernelCommutativeMonoidForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  )

  implicit def catsKernelCommutativeMonoidForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  )

  implicit def catsKernelCommutativeMonoidForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  )

  implicit def catsKernelCommutativeMonoidForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18], A19: CommutativeMonoid[A19]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  )

  implicit def catsKernelCommutativeMonoidForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18], A19: CommutativeMonoid[A19], A20: CommutativeMonoid[A20]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  )

  implicit def catsKernelCommutativeMonoidForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: CommutativeMonoid[A0], A1: CommutativeMonoid[A1], A2: CommutativeMonoid[A2], A3: CommutativeMonoid[A3], A4: CommutativeMonoid[A4], A5: CommutativeMonoid[A5], A6: CommutativeMonoid[A6], A7: CommutativeMonoid[A7], A8: CommutativeMonoid[A8], A9: CommutativeMonoid[A9], A10: CommutativeMonoid[A10], A11: CommutativeMonoid[A11], A12: CommutativeMonoid[A12], A13: CommutativeMonoid[A13], A14: CommutativeMonoid[A14], A15: CommutativeMonoid[A15], A16: CommutativeMonoid[A16], A17: CommutativeMonoid[A17], A18: CommutativeMonoid[A18], A19: CommutativeMonoid[A19], A20: CommutativeMonoid[A20], A21: CommutativeMonoid[A21]
  ): CommutativeMonoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = CommutativeMonoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty, A21.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  )
}
private[kernel] trait TupleCommutativeSemigroupInstances extends TupleBandInstances {

  implicit def catsKernelCommutativeSemigroupForTuple1[A0](
    implicit A0: CommutativeSemigroup[A0]
  ): CommutativeSemigroup[Tuple1[A0]] = CommutativeSemigroup.instance { (x, y) => 
    Tuple1(A0.combine(x._1, y._1))
  }

  implicit def catsKernelCommutativeSemigroupForTuple2[A0, A1](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1]
  ): CommutativeSemigroup[(A0, A1)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  }

  implicit def catsKernelCommutativeSemigroupForTuple3[A0, A1, A2](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2]
  ): CommutativeSemigroup[(A0, A1, A2)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  }

  implicit def catsKernelCommutativeSemigroupForTuple4[A0, A1, A2, A3](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3]
  ): CommutativeSemigroup[(A0, A1, A2, A3)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  }

  implicit def catsKernelCommutativeSemigroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  }

  implicit def catsKernelCommutativeSemigroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  }

  implicit def catsKernelCommutativeSemigroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  }

  implicit def catsKernelCommutativeSemigroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  }

  implicit def catsKernelCommutativeSemigroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  }

  implicit def catsKernelCommutativeSemigroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  }

  implicit def catsKernelCommutativeSemigroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  }

  implicit def catsKernelCommutativeSemigroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  }

  implicit def catsKernelCommutativeSemigroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  }

  implicit def catsKernelCommutativeSemigroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  }

  implicit def catsKernelCommutativeSemigroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  }

  implicit def catsKernelCommutativeSemigroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  }

  implicit def catsKernelCommutativeSemigroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  }

  implicit def catsKernelCommutativeSemigroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  }

  implicit def catsKernelCommutativeSemigroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  }

  implicit def catsKernelCommutativeSemigroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18], A19: CommutativeSemigroup[A19]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  }

  implicit def catsKernelCommutativeSemigroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18], A19: CommutativeSemigroup[A19], A20: CommutativeSemigroup[A20]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  }

  implicit def catsKernelCommutativeSemigroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: CommutativeSemigroup[A0], A1: CommutativeSemigroup[A1], A2: CommutativeSemigroup[A2], A3: CommutativeSemigroup[A3], A4: CommutativeSemigroup[A4], A5: CommutativeSemigroup[A5], A6: CommutativeSemigroup[A6], A7: CommutativeSemigroup[A7], A8: CommutativeSemigroup[A8], A9: CommutativeSemigroup[A9], A10: CommutativeSemigroup[A10], A11: CommutativeSemigroup[A11], A12: CommutativeSemigroup[A12], A13: CommutativeSemigroup[A13], A14: CommutativeSemigroup[A14], A15: CommutativeSemigroup[A15], A16: CommutativeSemigroup[A16], A17: CommutativeSemigroup[A17], A18: CommutativeSemigroup[A18], A19: CommutativeSemigroup[A19], A20: CommutativeSemigroup[A20], A21: CommutativeSemigroup[A21]
  ): CommutativeSemigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = CommutativeSemigroup.instance { (x, y) => 
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  }
}
private[kernel] trait TupleEqInstances {

  implicit def catsKernelEqForTuple1[A0](
    implicit A0: Eq[A0]
  ): Eq[Tuple1[A0]] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1)
  }

  implicit def catsKernelEqForTuple2[A0, A1](
    implicit A0: Eq[A0], A1: Eq[A1]
  ): Eq[(A0, A1)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2)
  }

  implicit def catsKernelEqForTuple3[A0, A1, A2](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2]
  ): Eq[(A0, A1, A2)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3)
  }

  implicit def catsKernelEqForTuple4[A0, A1, A2, A3](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3]
  ): Eq[(A0, A1, A2, A3)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4)
  }

  implicit def catsKernelEqForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4]
  ): Eq[(A0, A1, A2, A3, A4)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5)
  }

  implicit def catsKernelEqForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5]
  ): Eq[(A0, A1, A2, A3, A4, A5)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6)
  }

  implicit def catsKernelEqForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7)
  }

  implicit def catsKernelEqForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8)
  }

  implicit def catsKernelEqForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9)
  }

  implicit def catsKernelEqForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10)
  }

  implicit def catsKernelEqForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11)
  }

  implicit def catsKernelEqForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12)
  }

  implicit def catsKernelEqForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13)
  }

  implicit def catsKernelEqForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14)
  }

  implicit def catsKernelEqForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15)
  }

  implicit def catsKernelEqForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16)
  }

  implicit def catsKernelEqForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17)
  }

  implicit def catsKernelEqForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18)
  }

  implicit def catsKernelEqForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19)
  }

  implicit def catsKernelEqForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18], A19: Eq[A19]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19) && A19.eqv(x._20, y._20)
  }

  implicit def catsKernelEqForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18], A19: Eq[A19], A20: Eq[A20]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19) && A19.eqv(x._20, y._20) && A20.eqv(x._21, y._21)
  }

  implicit def catsKernelEqForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Eq[A0], A1: Eq[A1], A2: Eq[A2], A3: Eq[A3], A4: Eq[A4], A5: Eq[A5], A6: Eq[A6], A7: Eq[A7], A8: Eq[A8], A9: Eq[A9], A10: Eq[A10], A11: Eq[A11], A12: Eq[A12], A13: Eq[A13], A14: Eq[A14], A15: Eq[A15], A16: Eq[A16], A17: Eq[A17], A18: Eq[A18], A19: Eq[A19], A20: Eq[A20], A21: Eq[A21]
  ): Eq[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Eq.instance { (x, y) =>
    A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19) && A19.eqv(x._20, y._20) && A20.eqv(x._21, y._21) && A21.eqv(x._22, y._22)
  }
}
private[kernel] trait TupleGroupInstances extends TupleCommutativeMonoidInstances {

  implicit def catsKernelGroupForTuple1[A0](
    implicit A0: Group[A0]
  ): Group[Tuple1[A0]] = new Group[Tuple1[A0]] {
    def empty = Tuple1(A0.empty)
    def inverse(x: Tuple1[A0]) = Tuple1(A0.inverse(x._1))
    def combine(x: Tuple1[A0], y: Tuple1[A0]) = Tuple1(A0.combine(x._1, y._1))
  }

  implicit def catsKernelGroupForTuple2[A0, A1](
    implicit A0: Group[A0], A1: Group[A1]
  ): Group[(A0, A1)] = new Group[(A0, A1)] {
    def empty = (A0.empty, A1.empty)
    def inverse(x: (A0, A1)) = (A0.inverse(x._1), A1.inverse(x._2))
    def combine(x: (A0, A1), y: (A0, A1)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  }

  implicit def catsKernelGroupForTuple3[A0, A1, A2](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2]
  ): Group[(A0, A1, A2)] = new Group[(A0, A1, A2)] {
    def empty = (A0.empty, A1.empty, A2.empty)
    def inverse(x: (A0, A1, A2)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3))
    def combine(x: (A0, A1, A2), y: (A0, A1, A2)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  }

  implicit def catsKernelGroupForTuple4[A0, A1, A2, A3](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3]
  ): Group[(A0, A1, A2, A3)] = new Group[(A0, A1, A2, A3)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty)
    def inverse(x: (A0, A1, A2, A3)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4))
    def combine(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  }

  implicit def catsKernelGroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4]
  ): Group[(A0, A1, A2, A3, A4)] = new Group[(A0, A1, A2, A3, A4)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty)
    def inverse(x: (A0, A1, A2, A3, A4)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5))
    def combine(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  }

  implicit def catsKernelGroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5]
  ): Group[(A0, A1, A2, A3, A4, A5)] = new Group[(A0, A1, A2, A3, A4, A5)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6))
    def combine(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  }

  implicit def catsKernelGroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6]
  ): Group[(A0, A1, A2, A3, A4, A5, A6)] = new Group[(A0, A1, A2, A3, A4, A5, A6)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  }

  implicit def catsKernelGroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  }

  implicit def catsKernelGroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  }

  implicit def catsKernelGroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  }

  implicit def catsKernelGroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  }

  implicit def catsKernelGroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  }

  implicit def catsKernelGroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  }

  implicit def catsKernelGroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  }

  implicit def catsKernelGroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  }

  implicit def catsKernelGroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  }

  implicit def catsKernelGroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  }

  implicit def catsKernelGroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  }

  implicit def catsKernelGroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  }

  implicit def catsKernelGroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18], A19: Group[A19]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19), A19.inverse(x._20))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  }

  implicit def catsKernelGroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18], A19: Group[A19], A20: Group[A20]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19), A19.inverse(x._20), A20.inverse(x._21))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  }

  implicit def catsKernelGroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Group[A0], A1: Group[A1], A2: Group[A2], A3: Group[A3], A4: Group[A4], A5: Group[A5], A6: Group[A6], A7: Group[A7], A8: Group[A8], A9: Group[A9], A10: Group[A10], A11: Group[A11], A12: Group[A12], A13: Group[A13], A14: Group[A14], A15: Group[A15], A16: Group[A16], A17: Group[A17], A18: Group[A18], A19: Group[A19], A20: Group[A20], A21: Group[A21]
  ): Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = new Group[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
    def empty = (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty, A21.empty)
    def inverse(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.inverse(x._1), A1.inverse(x._2), A2.inverse(x._3), A3.inverse(x._4), A4.inverse(x._5), A5.inverse(x._6), A6.inverse(x._7), A7.inverse(x._8), A8.inverse(x._9), A9.inverse(x._10), A10.inverse(x._11), A11.inverse(x._12), A12.inverse(x._13), A13.inverse(x._14), A14.inverse(x._15), A15.inverse(x._16), A16.inverse(x._17), A17.inverse(x._18), A18.inverse(x._19), A19.inverse(x._20), A20.inverse(x._21), A21.inverse(x._22))
    def combine(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) = (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  }
}
private[kernel] trait TupleHashInstances extends TupleEqInstances {

  implicit def catsKernelHashForTuple1[A0](
    implicit A0: Hash[A0]
  ): Hash[Tuple1[A0]] = new Hash[Tuple1[A0]] {
    def hash(x: Tuple1[A0]) =
      Tuple1(A0.hash(x._1)).hashCode()
    def eqv(x: Tuple1[A0], y: Tuple1[A0]) =
      A0.eqv(x._1, y._1)
  }

  implicit def catsKernelHashForTuple2[A0, A1](
    implicit A0: Hash[A0], A1: Hash[A1]
  ): Hash[(A0, A1)] = new Hash[(A0, A1)] {
    def hash(x: (A0, A1)) =
      Tuple2(A0.hash(x._1), A1.hash(x._2)).hashCode()
    def eqv(x: (A0, A1), y: (A0, A1)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2)
  }

  implicit def catsKernelHashForTuple3[A0, A1, A2](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2]
  ): Hash[(A0, A1, A2)] = new Hash[(A0, A1, A2)] {
    def hash(x: (A0, A1, A2)) =
      Tuple3(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3)).hashCode()
    def eqv(x: (A0, A1, A2), y: (A0, A1, A2)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3)
  }

  implicit def catsKernelHashForTuple4[A0, A1, A2, A3](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3]
  ): Hash[(A0, A1, A2, A3)] = new Hash[(A0, A1, A2, A3)] {
    def hash(x: (A0, A1, A2, A3)) =
      Tuple4(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4)).hashCode()
    def eqv(x: (A0, A1, A2, A3), y: (A0, A1, A2, A3)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4)
  }

  implicit def catsKernelHashForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4]
  ): Hash[(A0, A1, A2, A3, A4)] = new Hash[(A0, A1, A2, A3, A4)] {
    def hash(x: (A0, A1, A2, A3, A4)) =
      Tuple5(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4), y: (A0, A1, A2, A3, A4)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5)
  }

  implicit def catsKernelHashForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5]
  ): Hash[(A0, A1, A2, A3, A4, A5)] = new Hash[(A0, A1, A2, A3, A4, A5)] {
    def hash(x: (A0, A1, A2, A3, A4, A5)) =
      Tuple6(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5), y: (A0, A1, A2, A3, A4, A5)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6)
  }

  implicit def catsKernelHashForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6)] = new Hash[(A0, A1, A2, A3, A4, A5, A6)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6)) =
      Tuple7(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6), y: (A0, A1, A2, A3, A4, A5, A6)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7)
  }

  implicit def catsKernelHashForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7)) =
      Tuple8(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7), y: (A0, A1, A2, A3, A4, A5, A6, A7)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8)
  }

  implicit def catsKernelHashForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) =
      Tuple9(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9)
  }

  implicit def catsKernelHashForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) =
      Tuple10(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10)
  }

  implicit def catsKernelHashForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) =
      Tuple11(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11)
  }

  implicit def catsKernelHashForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) =
      Tuple12(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12)
  }

  implicit def catsKernelHashForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) =
      Tuple13(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13)
  }

  implicit def catsKernelHashForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) =
      Tuple14(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14)
  }

  implicit def catsKernelHashForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) =
      Tuple15(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15)
  }

  implicit def catsKernelHashForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) =
      Tuple16(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16)
  }

  implicit def catsKernelHashForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) =
      Tuple17(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16), A16.hash(x._17)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17)
  }

  implicit def catsKernelHashForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) =
      Tuple18(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16), A16.hash(x._17), A17.hash(x._18)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18)
  }

  implicit def catsKernelHashForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) =
      Tuple19(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16), A16.hash(x._17), A17.hash(x._18), A18.hash(x._19)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19)
  }

  implicit def catsKernelHashForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18], A19: Hash[A19]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) =
      Tuple20(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16), A16.hash(x._17), A17.hash(x._18), A18.hash(x._19), A19.hash(x._20)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19) && A19.eqv(x._20, y._20)
  }

  implicit def catsKernelHashForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18], A19: Hash[A19], A20: Hash[A20]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) =
      Tuple21(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16), A16.hash(x._17), A17.hash(x._18), A18.hash(x._19), A19.hash(x._20), A20.hash(x._21)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19) && A19.eqv(x._20, y._20) && A20.eqv(x._21, y._21)
  }

  implicit def catsKernelHashForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Hash[A0], A1: Hash[A1], A2: Hash[A2], A3: Hash[A3], A4: Hash[A4], A5: Hash[A5], A6: Hash[A6], A7: Hash[A7], A8: Hash[A8], A9: Hash[A9], A10: Hash[A10], A11: Hash[A11], A12: Hash[A12], A13: Hash[A13], A14: Hash[A14], A15: Hash[A15], A16: Hash[A16], A17: Hash[A17], A18: Hash[A18], A19: Hash[A19], A20: Hash[A20], A21: Hash[A21]
  ): Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = new Hash[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] {
    def hash(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) =
      Tuple22(A0.hash(x._1), A1.hash(x._2), A2.hash(x._3), A3.hash(x._4), A4.hash(x._5), A5.hash(x._6), A6.hash(x._7), A7.hash(x._8), A8.hash(x._9), A9.hash(x._10), A10.hash(x._11), A11.hash(x._12), A12.hash(x._13), A13.hash(x._14), A14.hash(x._15), A15.hash(x._16), A16.hash(x._17), A17.hash(x._18), A18.hash(x._19), A19.hash(x._20), A20.hash(x._21), A21.hash(x._22)).hashCode()
    def eqv(x: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21), y: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)) =
      A0.eqv(x._1, y._1) && A1.eqv(x._2, y._2) && A2.eqv(x._3, y._3) && A3.eqv(x._4, y._4) && A4.eqv(x._5, y._5) && A5.eqv(x._6, y._6) && A6.eqv(x._7, y._7) && A7.eqv(x._8, y._8) && A8.eqv(x._9, y._9) && A9.eqv(x._10, y._10) && A10.eqv(x._11, y._11) && A11.eqv(x._12, y._12) && A12.eqv(x._13, y._13) && A13.eqv(x._14, y._14) && A14.eqv(x._15, y._15) && A15.eqv(x._16, y._16) && A16.eqv(x._17, y._17) && A17.eqv(x._18, y._18) && A18.eqv(x._19, y._19) && A19.eqv(x._20, y._20) && A20.eqv(x._21, y._21) && A21.eqv(x._22, y._22)
  }
}
private[kernel] trait TupleMonoidInstances extends TupleCommutativeSemigroupInstances {

  implicit def catsKernelMonoidForTuple1[A0](
    implicit A0: Monoid[A0]
  ): Monoid[Tuple1[A0]] = Monoid.instance(
    Tuple1(A0.empty),
    (x, y) => Tuple1(A0.combine(x._1, y._1))
  )

  implicit def catsKernelMonoidForTuple2[A0, A1](
    implicit A0: Monoid[A0], A1: Monoid[A1]
  ): Monoid[(A0, A1)] = Monoid.instance(
    (A0.empty, A1.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  )

  implicit def catsKernelMonoidForTuple3[A0, A1, A2](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2]
  ): Monoid[(A0, A1, A2)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  )

  implicit def catsKernelMonoidForTuple4[A0, A1, A2, A3](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3]
  ): Monoid[(A0, A1, A2, A3)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  )

  implicit def catsKernelMonoidForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4]
  ): Monoid[(A0, A1, A2, A3, A4)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  )

  implicit def catsKernelMonoidForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5]
  ): Monoid[(A0, A1, A2, A3, A4, A5)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  )

  implicit def catsKernelMonoidForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  )

  implicit def catsKernelMonoidForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  )

  implicit def catsKernelMonoidForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  )

  implicit def catsKernelMonoidForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  )

  implicit def catsKernelMonoidForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  )

  implicit def catsKernelMonoidForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  )

  implicit def catsKernelMonoidForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  )

  implicit def catsKernelMonoidForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  )

  implicit def catsKernelMonoidForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  )

  implicit def catsKernelMonoidForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  )

  implicit def catsKernelMonoidForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  )

  implicit def catsKernelMonoidForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  )

  implicit def catsKernelMonoidForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  )

  implicit def catsKernelMonoidForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18], A19: Monoid[A19]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  )

  implicit def catsKernelMonoidForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18], A19: Monoid[A19], A20: Monoid[A20]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  )

  implicit def catsKernelMonoidForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Monoid[A0], A1: Monoid[A1], A2: Monoid[A2], A3: Monoid[A3], A4: Monoid[A4], A5: Monoid[A5], A6: Monoid[A6], A7: Monoid[A7], A8: Monoid[A8], A9: Monoid[A9], A10: Monoid[A10], A11: Monoid[A11], A12: Monoid[A12], A13: Monoid[A13], A14: Monoid[A14], A15: Monoid[A15], A16: Monoid[A16], A17: Monoid[A17], A18: Monoid[A18], A19: Monoid[A19], A20: Monoid[A20], A21: Monoid[A21]
  ): Monoid[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Monoid.instance(
    (A0.empty, A1.empty, A2.empty, A3.empty, A4.empty, A5.empty, A6.empty, A7.empty, A8.empty, A9.empty, A10.empty, A11.empty, A12.empty, A13.empty, A14.empty, A15.empty, A16.empty, A17.empty, A18.empty, A19.empty, A20.empty, A21.empty),
    (x, y) => (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  )
}
private[kernel] trait TupleOrderInstances extends TuplePartialOrderInstances {

  implicit def catsKernelOrderForTuple1[A0](
    implicit A0: Order[A0]
  ): Order[Tuple1[A0]] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple2[A0, A1](
    implicit A0: Order[A0], A1: Order[A1]
  ): Order[(A0, A1)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple3[A0, A1, A2](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2]
  ): Order[(A0, A1, A2)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple4[A0, A1, A2, A3](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3]
  ): Order[(A0, A1, A2, A3)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4]
  ): Order[(A0, A1, A2, A3, A4)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5]
  ): Order[(A0, A1, A2, A3, A4, A5)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6]
  ): Order[(A0, A1, A2, A3, A4, A5, A6)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16), A16.compare(x._17, y._17)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16), A16.compare(x._17, y._17), A17.compare(x._18, y._18)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16), A16.compare(x._17, y._17), A17.compare(x._18, y._18), A18.compare(x._19, y._19)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18], A19: Order[A19]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16), A16.compare(x._17, y._17), A17.compare(x._18, y._18), A18.compare(x._19, y._19), A19.compare(x._20, y._20)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18], A19: Order[A19], A20: Order[A20]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16), A16.compare(x._17, y._17), A17.compare(x._18, y._18), A18.compare(x._19, y._19), A19.compare(x._20, y._20), A20.compare(x._21, y._21)).find(_ != 0).getOrElse(0)
  }

  implicit def catsKernelOrderForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Order[A0], A1: Order[A1], A2: Order[A2], A3: Order[A3], A4: Order[A4], A5: Order[A5], A6: Order[A6], A7: Order[A7], A8: Order[A8], A9: Order[A9], A10: Order[A10], A11: Order[A11], A12: Order[A12], A13: Order[A13], A14: Order[A14], A15: Order[A15], A16: Order[A16], A17: Order[A17], A18: Order[A18], A19: Order[A19], A20: Order[A20], A21: Order[A21]
  ): Order[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Order.from { (x, y) =>
    Array(A0.compare(x._1, y._1), A1.compare(x._2, y._2), A2.compare(x._3, y._3), A3.compare(x._4, y._4), A4.compare(x._5, y._5), A5.compare(x._6, y._6), A6.compare(x._7, y._7), A7.compare(x._8, y._8), A8.compare(x._9, y._9), A9.compare(x._10, y._10), A10.compare(x._11, y._11), A11.compare(x._12, y._12), A12.compare(x._13, y._13), A13.compare(x._14, y._14), A14.compare(x._15, y._15), A15.compare(x._16, y._16), A16.compare(x._17, y._17), A17.compare(x._18, y._18), A18.compare(x._19, y._19), A19.compare(x._20, y._20), A20.compare(x._21, y._21), A21.compare(x._22, y._22)).find(_ != 0).getOrElse(0)
  }
}
private[kernel] trait TuplePartialOrderInstances extends TupleHashInstances {

  implicit def catsKernelPartialOrderForTuple1[A0](
    implicit A0: PartialOrder[A0]
  ): PartialOrder[Tuple1[A0]] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple2[A0, A1](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1]
  ): PartialOrder[(A0, A1)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple3[A0, A1, A2](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2]
  ): PartialOrder[(A0, A1, A2)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple4[A0, A1, A2, A3](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3]
  ): PartialOrder[(A0, A1, A2, A3)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple5[A0, A1, A2, A3, A4](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4]
  ): PartialOrder[(A0, A1, A2, A3, A4)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16), A16.partialCompare(x._17, y._17)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16), A16.partialCompare(x._17, y._17), A17.partialCompare(x._18, y._18)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16), A16.partialCompare(x._17, y._17), A17.partialCompare(x._18, y._18), A18.partialCompare(x._19, y._19)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18], A19: PartialOrder[A19]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16), A16.partialCompare(x._17, y._17), A17.partialCompare(x._18, y._18), A18.partialCompare(x._19, y._19), A19.partialCompare(x._20, y._20)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18], A19: PartialOrder[A19], A20: PartialOrder[A20]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16), A16.partialCompare(x._17, y._17), A17.partialCompare(x._18, y._18), A18.partialCompare(x._19, y._19), A19.partialCompare(x._20, y._20), A20.partialCompare(x._21, y._21)).find(_ != 0.0).getOrElse(0.0)
  }

  implicit def catsKernelPartialOrderForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: PartialOrder[A0], A1: PartialOrder[A1], A2: PartialOrder[A2], A3: PartialOrder[A3], A4: PartialOrder[A4], A5: PartialOrder[A5], A6: PartialOrder[A6], A7: PartialOrder[A7], A8: PartialOrder[A8], A9: PartialOrder[A9], A10: PartialOrder[A10], A11: PartialOrder[A11], A12: PartialOrder[A12], A13: PartialOrder[A13], A14: PartialOrder[A14], A15: PartialOrder[A15], A16: PartialOrder[A16], A17: PartialOrder[A17], A18: PartialOrder[A18], A19: PartialOrder[A19], A20: PartialOrder[A20], A21: PartialOrder[A21]
  ): PartialOrder[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = PartialOrder.from { (x, y) =>
    Array(A0.partialCompare(x._1, y._1), A1.partialCompare(x._2, y._2), A2.partialCompare(x._3, y._3), A3.partialCompare(x._4, y._4), A4.partialCompare(x._5, y._5), A5.partialCompare(x._6, y._6), A6.partialCompare(x._7, y._7), A7.partialCompare(x._8, y._8), A8.partialCompare(x._9, y._9), A9.partialCompare(x._10, y._10), A10.partialCompare(x._11, y._11), A11.partialCompare(x._12, y._12), A12.partialCompare(x._13, y._13), A13.partialCompare(x._14, y._14), A14.partialCompare(x._15, y._15), A15.partialCompare(x._16, y._16), A16.partialCompare(x._17, y._17), A17.partialCompare(x._18, y._18), A18.partialCompare(x._19, y._19), A19.partialCompare(x._20, y._20), A20.partialCompare(x._21, y._21), A21.partialCompare(x._22, y._22)).find(_ != 0.0).getOrElse(0.0)
  }
}
private[kernel] trait TupleSemigroupInstances {

  implicit def catsKernelSemigroupForTuple1[A0](
    implicit A0: Semigroup[A0]
  ): Semigroup[Tuple1[A0]] = Semigroup.instance { (x, y) =>
    Tuple1(A0.combine(x._1, y._1))
  }

  implicit def catsKernelSemigroupForTuple2[A0, A1](
    implicit A0: Semigroup[A0], A1: Semigroup[A1]
  ): Semigroup[(A0, A1)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  }

  implicit def catsKernelSemigroupForTuple3[A0, A1, A2](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2]
  ): Semigroup[(A0, A1, A2)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  }

  implicit def catsKernelSemigroupForTuple4[A0, A1, A2, A3](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3]
  ): Semigroup[(A0, A1, A2, A3)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  }

  implicit def catsKernelSemigroupForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4]
  ): Semigroup[(A0, A1, A2, A3, A4)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  }

  implicit def catsKernelSemigroupForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5]
  ): Semigroup[(A0, A1, A2, A3, A4, A5)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  }

  implicit def catsKernelSemigroupForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  }

  implicit def catsKernelSemigroupForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  }

  implicit def catsKernelSemigroupForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  }

  implicit def catsKernelSemigroupForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  }

  implicit def catsKernelSemigroupForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  }

  implicit def catsKernelSemigroupForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  }

  implicit def catsKernelSemigroupForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  }

  implicit def catsKernelSemigroupForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  }

  implicit def catsKernelSemigroupForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  }

  implicit def catsKernelSemigroupForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  }

  implicit def catsKernelSemigroupForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  }

  implicit def catsKernelSemigroupForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  }

  implicit def catsKernelSemigroupForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  }

  implicit def catsKernelSemigroupForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18], A19: Semigroup[A19]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  }

  implicit def catsKernelSemigroupForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18], A19: Semigroup[A19], A20: Semigroup[A20]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  }

  implicit def catsKernelSemigroupForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Semigroup[A0], A1: Semigroup[A1], A2: Semigroup[A2], A3: Semigroup[A3], A4: Semigroup[A4], A5: Semigroup[A5], A6: Semigroup[A6], A7: Semigroup[A7], A8: Semigroup[A8], A9: Semigroup[A9], A10: Semigroup[A10], A11: Semigroup[A11], A12: Semigroup[A12], A13: Semigroup[A13], A14: Semigroup[A14], A15: Semigroup[A15], A16: Semigroup[A16], A17: Semigroup[A17], A18: Semigroup[A18], A19: Semigroup[A19], A20: Semigroup[A20], A21: Semigroup[A21]
  ): Semigroup[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Semigroup.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  }
}
private[kernel] trait TupleSemilatticeInstances extends TupleMonoidInstances {

  implicit def catsKernelSemilatticeForTuple1[A0](
    implicit A0: Semilattice[A0]
  ): Semilattice[Tuple1[A0]] = Semilattice.instance { (x, y) =>
    Tuple1(A0.combine(x._1, y._1))
  }

  implicit def catsKernelSemilatticeForTuple2[A0, A1](
    implicit A0: Semilattice[A0], A1: Semilattice[A1]
  ): Semilattice[(A0, A1)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2))
  }

  implicit def catsKernelSemilatticeForTuple3[A0, A1, A2](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2]
  ): Semilattice[(A0, A1, A2)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3))
  }

  implicit def catsKernelSemilatticeForTuple4[A0, A1, A2, A3](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3]
  ): Semilattice[(A0, A1, A2, A3)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4))
  }

  implicit def catsKernelSemilatticeForTuple5[A0, A1, A2, A3, A4](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4]
  ): Semilattice[(A0, A1, A2, A3, A4)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5))
  }

  implicit def catsKernelSemilatticeForTuple6[A0, A1, A2, A3, A4, A5](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5]
  ): Semilattice[(A0, A1, A2, A3, A4, A5)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6))
  }

  implicit def catsKernelSemilatticeForTuple7[A0, A1, A2, A3, A4, A5, A6](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7))
  }

  implicit def catsKernelSemilatticeForTuple8[A0, A1, A2, A3, A4, A5, A6, A7](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8))
  }

  implicit def catsKernelSemilatticeForTuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9))
  }

  implicit def catsKernelSemilatticeForTuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10))
  }

  implicit def catsKernelSemilatticeForTuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11))
  }

  implicit def catsKernelSemilatticeForTuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12))
  }

  implicit def catsKernelSemilatticeForTuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13))
  }

  implicit def catsKernelSemilatticeForTuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14))
  }

  implicit def catsKernelSemilatticeForTuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15))
  }

  implicit def catsKernelSemilatticeForTuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16))
  }

  implicit def catsKernelSemilatticeForTuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17))
  }

  implicit def catsKernelSemilatticeForTuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18))
  }

  implicit def catsKernelSemilatticeForTuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19))
  }

  implicit def catsKernelSemilatticeForTuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18], A19: Semilattice[A19]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20))
  }

  implicit def catsKernelSemilatticeForTuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18], A19: Semilattice[A19], A20: Semilattice[A20]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21))
  }

  implicit def catsKernelSemilatticeForTuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](
    implicit A0: Semilattice[A0], A1: Semilattice[A1], A2: Semilattice[A2], A3: Semilattice[A3], A4: Semilattice[A4], A5: Semilattice[A5], A6: Semilattice[A6], A7: Semilattice[A7], A8: Semilattice[A8], A9: Semilattice[A9], A10: Semilattice[A10], A11: Semilattice[A11], A12: Semilattice[A12], A13: Semilattice[A13], A14: Semilattice[A14], A15: Semilattice[A15], A16: Semilattice[A16], A17: Semilattice[A17], A18: Semilattice[A18], A19: Semilattice[A19], A20: Semilattice[A20], A21: Semilattice[A21]
  ): Semilattice[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Semilattice.instance { (x, y) =>
    (A0.combine(x._1, y._1), A1.combine(x._2, y._2), A2.combine(x._3, y._3), A3.combine(x._4, y._4), A4.combine(x._5, y._5), A5.combine(x._6, y._6), A6.combine(x._7, y._7), A7.combine(x._8, y._8), A8.combine(x._9, y._9), A9.combine(x._10, y._10), A10.combine(x._11, y._11), A11.combine(x._12, y._12), A12.combine(x._13, y._13), A13.combine(x._14, y._14), A14.combine(x._15, y._15), A15.combine(x._16, y._16), A16.combine(x._17, y._17), A17.combine(x._18, y._18), A18.combine(x._19, y._19), A19.combine(x._20, y._20), A20.combine(x._21, y._21), A21.combine(x._22, y._22))
  }
}