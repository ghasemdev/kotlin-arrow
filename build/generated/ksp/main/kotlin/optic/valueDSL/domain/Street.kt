package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Street.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Street, kotlin.Pair<kotlin.Int, kotlin.String>> inline get()= arrow.optics.Iso(
  get = { street: optic.valueDSL.domain.Street -> kotlin.Pair(street.`number`, street.`name`) },
  reverseGet = { pair: kotlin.Pair<kotlin.Int, kotlin.String> -> optic.valueDSL.domain.Street(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Street.Companion.number: arrow.optics.Lens<optic.valueDSL.domain.Street, kotlin.Int> inline get()= arrow.optics.Lens(
  get = { street: optic.valueDSL.domain.Street -> street.`number` },
  set = { street: optic.valueDSL.domain.Street, value: kotlin.Int -> street.copy(`number` = value) }
)

inline val optic.valueDSL.domain.Street.Companion.name: arrow.optics.Lens<optic.valueDSL.domain.Street, kotlin.String> inline get()= arrow.optics.Lens(
  get = { street: optic.valueDSL.domain.Street -> street.`name` },
  set = { street: optic.valueDSL.domain.Street, value: kotlin.String -> street.copy(`name` = value) }
)




inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Street>.number: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Street>.number: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Street>.number: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Street>.number: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Street>.number: arrow.optics.Getter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Street>.number: arrow.optics.Setter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Street>.number: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Street>.number: arrow.optics.Fold<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Street>.number: arrow.optics.Every<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Street.number

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Street>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Street>.name: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Street>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Street>.name: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Street>.name: arrow.optics.Getter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Street>.name: arrow.optics.Setter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Street>.name: arrow.optics.Traversal<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Street>.name: arrow.optics.Fold<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Street>.name: arrow.optics.Every<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Street.name
