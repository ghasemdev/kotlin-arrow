package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Employee.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Employee, kotlin.Pair<kotlin.String, optic.valueDSL.domain.Company?>> inline get()= arrow.optics.Iso(
  get = { employee: optic.valueDSL.domain.Employee -> kotlin.Pair(employee.`name`, employee.`company`) },
  reverseGet = { pair: kotlin.Pair<kotlin.String, optic.valueDSL.domain.Company?> -> optic.valueDSL.domain.Employee(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Employee.Companion.name: arrow.optics.Lens<optic.valueDSL.domain.Employee, kotlin.String> inline get()= arrow.optics.Lens(
  get = { employee: optic.valueDSL.domain.Employee -> employee.`name` },
  set = { employee: optic.valueDSL.domain.Employee, value: kotlin.String -> employee.copy(`name` = value) }
)

inline val optic.valueDSL.domain.Employee.Companion.nullableCompany: arrow.optics.Lens<optic.valueDSL.domain.Employee, optic.valueDSL.domain.Company?> inline get()= arrow.optics.Lens(
  get = { employee: optic.valueDSL.domain.Employee -> employee.`company` },
  set = { employee: optic.valueDSL.domain.Employee, value: optic.valueDSL.domain.Company? -> employee.copy(`company` = value) }
)


inline val optic.valueDSL.domain.Employee.Companion.company: arrow.optics.Optional<optic.valueDSL.domain.Employee, optic.valueDSL.domain.Company> inline get()= arrow.optics.Optional(
  getOrModify = { employee: optic.valueDSL.domain.Employee -> employee.`company`?.right() ?: employee.left() },
  set = { employee: optic.valueDSL.domain.Employee, value: optic.valueDSL.domain.Company -> employee.copy(`company` = value) }
)

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Optional<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Optional<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Optional<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Optional<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Setter<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Traversal<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Fold<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Employee>.company: arrow.optics.Every<S, optic.valueDSL.domain.Company> inline get() = this + optic.valueDSL.domain.Employee.company

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Getter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Setter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Traversal<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Fold<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Employee>.name: arrow.optics.Every<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Employee.name

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Lens<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Lens<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Optional<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Optional<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Getter<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Setter<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Traversal<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Fold<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Employee>.nullableCompany: arrow.optics.Every<S, optic.valueDSL.domain.Company?> inline get() = this + optic.valueDSL.domain.Employee.nullableCompany
