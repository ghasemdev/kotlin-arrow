package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Address.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Address, kotlin.Pair<kotlin.String, optic.valueDSL.domain.Street>> inline get()= arrow.optics.Iso(
  get = { address: optic.valueDSL.domain.Address -> kotlin.Pair(address.`city`, address.`street`) },
  reverseGet = { pair: kotlin.Pair<kotlin.String, optic.valueDSL.domain.Street> -> optic.valueDSL.domain.Address(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Address.Companion.city: arrow.optics.Lens<optic.valueDSL.domain.Address, kotlin.String> inline get()= arrow.optics.Lens(
  get = { address: optic.valueDSL.domain.Address -> address.`city` },
  set = { address: optic.valueDSL.domain.Address, value: kotlin.String -> address.copy(`city` = value) }
)

inline val optic.valueDSL.domain.Address.Companion.street: arrow.optics.Lens<optic.valueDSL.domain.Address, optic.valueDSL.domain.Street> inline get()= arrow.optics.Lens(
  get = { address: optic.valueDSL.domain.Address -> address.`street` },
  set = { address: optic.valueDSL.domain.Address, value: optic.valueDSL.domain.Street -> address.copy(`street` = value) }
)




inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Address>.city: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Address>.city: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Address>.city: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Address>.city: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Address>.city: arrow.optics.Getter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Address>.city: arrow.optics.Setter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Address>.city: arrow.optics.Traversal<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Address>.city: arrow.optics.Fold<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Address>.city: arrow.optics.Every<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Address.city

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Address>.street: arrow.optics.Lens<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Address>.street: arrow.optics.Lens<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Address>.street: arrow.optics.Optional<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Address>.street: arrow.optics.Optional<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Address>.street: arrow.optics.Getter<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Address>.street: arrow.optics.Setter<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Address>.street: arrow.optics.Traversal<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Address>.street: arrow.optics.Fold<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Address>.street: arrow.optics.Every<S, optic.valueDSL.domain.Street> inline get() = this + optic.valueDSL.domain.Address.street
