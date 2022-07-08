package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.HttpError.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.HttpError, kotlin.String> inline get()= arrow.optics.Iso(
  get = { httpError: optic.valueDSL.domain.HttpError -> httpError.message },
  reverseGet = { optic.valueDSL.domain.HttpError(it) }
)

inline val optic.valueDSL.domain.HttpError.Companion.message: arrow.optics.Lens<optic.valueDSL.domain.HttpError, kotlin.String> inline get()= arrow.optics.Lens(
  get = { httpError: optic.valueDSL.domain.HttpError -> httpError.`message` },
  set = { httpError: optic.valueDSL.domain.HttpError, value: kotlin.String -> httpError.copy(`message` = value) }
)



inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Lens<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Optional<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Getter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Setter<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Traversal<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Fold<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.HttpError>.message: arrow.optics.Every<S, kotlin.String> inline get() = this + optic.valueDSL.domain.HttpError.message
