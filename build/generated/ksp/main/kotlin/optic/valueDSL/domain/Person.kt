package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Person.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Person, kotlin.Pair<kotlin.Int?, optic.valueDSL.domain.Address?>> inline get()= arrow.optics.Iso(
  get = { person: optic.valueDSL.domain.Person -> kotlin.Pair(person.`age`, person.`address`) },
  reverseGet = { pair: kotlin.Pair<kotlin.Int?, optic.valueDSL.domain.Address?> -> optic.valueDSL.domain.Person(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Person.Companion.nullableAge: arrow.optics.Lens<optic.valueDSL.domain.Person, kotlin.Int?> inline get()= arrow.optics.Lens(
  get = { person: optic.valueDSL.domain.Person -> person.`age` },
  set = { person: optic.valueDSL.domain.Person, value: kotlin.Int? -> person.copy(`age` = value) }
)

inline val optic.valueDSL.domain.Person.Companion.nullableAddress: arrow.optics.Lens<optic.valueDSL.domain.Person, optic.valueDSL.domain.Address?> inline get()= arrow.optics.Lens(
  get = { person: optic.valueDSL.domain.Person -> person.`address` },
  set = { person: optic.valueDSL.domain.Person, value: optic.valueDSL.domain.Address? -> person.copy(`address` = value) }
)

inline val optic.valueDSL.domain.Person.Companion.age: arrow.optics.Optional<optic.valueDSL.domain.Person, kotlin.Int> inline get()= arrow.optics.Optional(
  getOrModify = { person: optic.valueDSL.domain.Person -> person.`age`?.right() ?: person.left() },
  set = { person: optic.valueDSL.domain.Person, value: kotlin.Int -> person.copy(`age` = value) }
)

inline val optic.valueDSL.domain.Person.Companion.address: arrow.optics.Optional<optic.valueDSL.domain.Person, optic.valueDSL.domain.Address> inline get()= arrow.optics.Optional(
  getOrModify = { person: optic.valueDSL.domain.Person -> person.`address`?.right() ?: person.left() },
  set = { person: optic.valueDSL.domain.Person, value: optic.valueDSL.domain.Address -> person.copy(`address` = value) }
)

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Person>.age: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Person>.age: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Person>.age: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Person>.age: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Person>.age: arrow.optics.Setter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Person>.age: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Person>.age: arrow.optics.Fold<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Person>.age: arrow.optics.Every<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Person.age

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Person>.address: arrow.optics.Optional<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Person>.address: arrow.optics.Optional<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Person>.address: arrow.optics.Optional<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Person>.address: arrow.optics.Optional<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Person>.address: arrow.optics.Setter<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Person>.address: arrow.optics.Traversal<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Person>.address: arrow.optics.Fold<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Person>.address: arrow.optics.Every<S, optic.valueDSL.domain.Address> inline get() = this + optic.valueDSL.domain.Person.address

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Lens<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Lens<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Optional<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Optional<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Getter<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Setter<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Traversal<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Fold<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Person>.nullableAge: arrow.optics.Every<S, kotlin.Int?> inline get() = this + optic.valueDSL.domain.Person.nullableAge

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Lens<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Lens<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Optional<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Optional<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Getter<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Setter<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Traversal<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Fold<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Person>.nullableAddress: arrow.optics.Every<S, optic.valueDSL.domain.Address?> inline get() = this + optic.valueDSL.domain.Person.nullableAddress
