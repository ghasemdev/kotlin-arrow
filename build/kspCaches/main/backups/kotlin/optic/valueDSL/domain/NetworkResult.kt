package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.identity

inline val optic.valueDSL.domain.NetworkResult.Companion.networkError: arrow.optics.Prism<optic.valueDSL.domain.NetworkResult, optic.valueDSL.domain.NetworkError> inline get()= arrow.optics.Prism(
  getOrModify = { networkResult: optic.valueDSL.domain.NetworkResult ->
    when (networkResult) {
      is optic.valueDSL.domain.NetworkError -> networkResult.right()
      else -> networkResult.left()
    }
  },
  reverseGet = ::identity
)


inline val optic.valueDSL.domain.NetworkResult.Companion.success: arrow.optics.Prism<optic.valueDSL.domain.NetworkResult, optic.valueDSL.domain.Success> inline get()= arrow.optics.Prism(
  getOrModify = { networkResult: optic.valueDSL.domain.NetworkResult ->
    when (networkResult) {
      is optic.valueDSL.domain.Success -> networkResult.right()
      else -> networkResult.left()
    }
  },
  reverseGet = ::identity
)

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Prism<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Optional<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Optional<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Prism<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Setter<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Traversal<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Fold<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.NetworkResult>.networkError: arrow.optics.Every<S, optic.valueDSL.domain.NetworkError> inline get() = this + optic.valueDSL.domain.NetworkResult.networkError


inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Prism<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Optional<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Optional<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Prism<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Setter<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Traversal<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Fold<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.NetworkResult>.success: arrow.optics.Every<S, optic.valueDSL.domain.Success> inline get() = this + optic.valueDSL.domain.NetworkResult.success
