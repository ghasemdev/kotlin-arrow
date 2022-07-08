package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.identity

inline val optic.valueDSL.domain.Shape.Companion.circle: arrow.optics.Prism<optic.valueDSL.domain.Shape, optic.valueDSL.domain.Shape.Circle> inline get()= arrow.optics.Prism(
  getOrModify = { shape: optic.valueDSL.domain.Shape ->
    when (shape) {
      is optic.valueDSL.domain.Shape.Circle -> shape.right()
      else -> shape.left()
    }
  },
  reverseGet = ::identity
)


inline val optic.valueDSL.domain.Shape.Companion.rectangle: arrow.optics.Prism<optic.valueDSL.domain.Shape, optic.valueDSL.domain.Shape.Rectangle> inline get()= arrow.optics.Prism(
  getOrModify = { shape: optic.valueDSL.domain.Shape ->
    when (shape) {
      is optic.valueDSL.domain.Shape.Rectangle -> shape.right()
      else -> shape.left()
    }
  },
  reverseGet = ::identity
)

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Prism<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Optional<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Optional<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Prism<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Setter<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Traversal<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Fold<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Shape>.circle: arrow.optics.Every<S, optic.valueDSL.domain.Shape.Circle> inline get() = this + optic.valueDSL.domain.Shape.circle


inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Prism<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Optional<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Optional<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Prism<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Setter<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Traversal<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Fold<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Shape>.rectangle: arrow.optics.Every<S, optic.valueDSL.domain.Shape.Rectangle> inline get() = this + optic.valueDSL.domain.Shape.rectangle
