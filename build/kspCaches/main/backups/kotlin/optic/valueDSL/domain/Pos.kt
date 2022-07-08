package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Pos.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Pos, kotlin.Pair<kotlin.Int, kotlin.Int>> inline get()= arrow.optics.Iso(
  get = { pos: optic.valueDSL.domain.Pos -> kotlin.Pair(pos.`x`, pos.`y`) },
  reverseGet = { pair: kotlin.Pair<kotlin.Int, kotlin.Int> -> optic.valueDSL.domain.Pos(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Pos.Companion.x: arrow.optics.Lens<optic.valueDSL.domain.Pos, kotlin.Int> inline get()= arrow.optics.Lens(
  get = { pos: optic.valueDSL.domain.Pos -> pos.`x` },
  set = { pos: optic.valueDSL.domain.Pos, value: kotlin.Int -> pos.copy(`x` = value) }
)

inline val optic.valueDSL.domain.Pos.Companion.y: arrow.optics.Lens<optic.valueDSL.domain.Pos, kotlin.Int> inline get()= arrow.optics.Lens(
  get = { pos: optic.valueDSL.domain.Pos -> pos.`y` },
  set = { pos: optic.valueDSL.domain.Pos, value: kotlin.Int -> pos.copy(`y` = value) }
)




inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Getter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Setter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Fold<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Pos>.x: arrow.optics.Every<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.x

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Getter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Setter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Fold<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Pos>.y: arrow.optics.Every<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Pos.y
