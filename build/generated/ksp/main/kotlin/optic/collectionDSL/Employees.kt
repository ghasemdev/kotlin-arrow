package optic.collectionDSL

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.collectionDSL.Employees.Companion.iso: arrow.optics.Iso<optic.collectionDSL.Employees, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get()= arrow.optics.Iso(
  get = { employees: optic.collectionDSL.Employees -> employees.employees },
  reverseGet = { optic.collectionDSL.Employees(it) }
)

inline val optic.collectionDSL.Employees.Companion.employees: arrow.optics.Lens<optic.collectionDSL.Employees, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get()= arrow.optics.Lens(
  get = { employees: optic.collectionDSL.Employees -> employees.`employees` },
  set = { employees: optic.collectionDSL.Employees, value: kotlin.collections.List<optic.valueDSL.domain.Employee> -> employees.copy(`employees` = value) }
)



inline val <S> arrow.optics.Iso<S, optic.collectionDSL.Employees>.employees: arrow.optics.Lens<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Lens<S, optic.collectionDSL.Employees>.employees: arrow.optics.Lens<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Optional<S, optic.collectionDSL.Employees>.employees: arrow.optics.Optional<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Prism<S, optic.collectionDSL.Employees>.employees: arrow.optics.Optional<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Getter<S, optic.collectionDSL.Employees>.employees: arrow.optics.Getter<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Setter<S, optic.collectionDSL.Employees>.employees: arrow.optics.Setter<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Traversal<S, optic.collectionDSL.Employees>.employees: arrow.optics.Traversal<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Fold<S, optic.collectionDSL.Employees>.employees: arrow.optics.Fold<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
inline val <S> arrow.optics.Every<S, optic.collectionDSL.Employees>.employees: arrow.optics.Every<S, kotlin.collections.List<optic.valueDSL.domain.Employee>> inline get() = this + optic.collectionDSL.Employees.employees
