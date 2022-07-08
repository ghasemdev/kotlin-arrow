package optic.collectionDSL

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.collectionDSL.Db.Companion.iso: arrow.optics.Iso<optic.collectionDSL.Db, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get()= arrow.optics.Iso(
  get = { db: optic.collectionDSL.Db -> db.content },
  reverseGet = { optic.collectionDSL.Db(it) }
)

inline val optic.collectionDSL.Db.Companion.content: arrow.optics.Lens<optic.collectionDSL.Db, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get()= arrow.optics.Lens(
  get = { db: optic.collectionDSL.Db -> db.`content` },
  set = { db: optic.collectionDSL.Db, value: kotlin.collections.Map<kotlin.Int, kotlin.String> -> db.copy(`content` = value) }
)



inline val <S> arrow.optics.Iso<S, optic.collectionDSL.Db>.content: arrow.optics.Lens<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Lens<S, optic.collectionDSL.Db>.content: arrow.optics.Lens<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Optional<S, optic.collectionDSL.Db>.content: arrow.optics.Optional<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Prism<S, optic.collectionDSL.Db>.content: arrow.optics.Optional<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Getter<S, optic.collectionDSL.Db>.content: arrow.optics.Getter<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Setter<S, optic.collectionDSL.Db>.content: arrow.optics.Setter<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Traversal<S, optic.collectionDSL.Db>.content: arrow.optics.Traversal<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Fold<S, optic.collectionDSL.Db>.content: arrow.optics.Fold<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
inline val <S> arrow.optics.Every<S, optic.collectionDSL.Db>.content: arrow.optics.Every<S, kotlin.collections.Map<kotlin.Int, kotlin.String>> inline get() = this + optic.collectionDSL.Db.content
