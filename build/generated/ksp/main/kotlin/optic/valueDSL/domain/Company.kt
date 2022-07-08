package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Company.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Company, kotlin.Pair<kotlin.String, optic.valueDSL.domain.Address>> inline get()= arrow.optics.Iso(
  get = { company: optic.valueDSL.domain.Company -> kotlin.Pair(company.`name`, company.`address`) },
  reverseGet = { pair: kotlin.Pair<kotlin.String, optic.valueDSL.domain.Address> -> optic.valueDSL.domain.Company(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Company.Companion.name: arrow.optics.Lens<optic.valueDSL.domain.Company, kotlin.String> inline get()= arrow.optics.Lens(
  get = { company: optic.valueDSL.domain.Company -> company.`name` },
  set = { company: optic.valueDSL.domain.Company, value: kotlin.String -> company.copy(`name` = value) }
)

inline val optic.valueDSL.domain.Company.Companion.address: arrow.optics.Lens<optic.valueDSL.domain.Company, optic.valueDSL.domain.Address> inline get()= arrow.optics.Lens(
  get = { company: optic.valueDSL.domain.Company -> company.`address` },
  set = { company: optic.valueDSL.domain.Company, value: optic.valueDSL.domain.Address -> company.copy(`address` = value) }
)




inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Company>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Company>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Company>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Company>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Company>.name: arrow.optics.Getter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Company>.name: arrow.optics.Setter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Company>.name: arrow.optics.Traversal<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Company>.name: arrow.optics.Fold<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Company>.name: arrow.optics.Every<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Company.name

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Company>.address: arrow.optics.Lens<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Company>.address: arrow.optics.Lens<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Company>.address: arrow.optics.Optional<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Company>.address: arrow.optics.Optional<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Company>.address: arrow.optics.Getter<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Company>.address: arrow.optics.Setter<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Company>.address: arrow.optics.Traversal<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Company>.address: arrow.optics.Fold<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Company>.address: arrow.optics.Every<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Company.address
