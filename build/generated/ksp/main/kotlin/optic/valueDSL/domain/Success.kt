package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Success.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Success, kotlin.String> inline get()= arrow.optics.Iso(
  get = { success: optic.valueDSL.domain.Success -> success.content },
  reverseGet = { optic.valueDSL.domain.Success(it) }
)

inline val optic.valueDSL.domain.Success.Companion.content: arrow.optics.Lens<optic.valueDSL.domain.Success, kotlin.String> inline get()= arrow.optics.Lens(
  get = { success: optic.valueDSL.domain.Success -> success.`content` },
  set = { success: optic.valueDSL.domain.Success, value: kotlin.String -> success.copy(`content` = value) }
)



inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Success>.content: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Success>.content: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Success>.content: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Success>.content: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Success>.content: arrow.optics.Getter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Success>.content: arrow.optics.Setter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Success>.content: arrow.optics.Traversal<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Success>.content: arrow.optics.Fold<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Success>.content: arrow.optics.Every<S, kotlin.String> inline get() = this + optic.valueDSL.domain.Success.content
