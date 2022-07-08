package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.identity

inline val optic.valueDSL.domain.NetworkError.Companion.httpError: arrow.optics.Prism<optic.valueDSL.domain.NetworkError, optic.valueDSL.domain.HttpError> inline get()= arrow.optics.Prism(
  getOrModify = { networkError: optic.valueDSL.domain.NetworkError ->
    when (networkError) {
      is optic.valueDSL.domain.HttpError -> networkError.right()
      else -> networkError.left()
    }
  },
  reverseGet = ::identity
)


inline val optic.valueDSL.domain.NetworkError.Companion.timeoutError: arrow.optics.Prism<optic.valueDSL.domain.NetworkError, optic.valueDSL.domain.TimeoutError> inline get()= arrow.optics.Prism(
  getOrModify = { networkError: optic.valueDSL.domain.NetworkError ->
    when (networkError) {
      is optic.valueDSL.domain.TimeoutError -> networkError.right()
      else -> networkError.left()
    }
  },
  reverseGet = ::identity
)

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Prism<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Optional<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Optional<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Prism<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Setter<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Traversal<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Fold<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.NetworkError>.httpError: arrow.optics.Every<S, optic.valueDSL.domain.HttpError> inline get() = this + optic.valueDSL.domain.NetworkError.httpError


inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Prism<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Optional<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Optional<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Prism<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Setter<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Traversal<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Fold<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.NetworkError>.timeoutError: arrow.optics.Every<S, optic.valueDSL.domain.TimeoutError> inline get() = this + optic.valueDSL.domain.NetworkError.timeoutError
