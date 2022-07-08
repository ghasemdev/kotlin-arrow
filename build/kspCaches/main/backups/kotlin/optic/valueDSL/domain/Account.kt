package optic.valueDSL.domain

import arrow.core.left
import arrow.core.right
import arrow.core.toOption

inline val optic.valueDSL.domain.Account.Companion.iso: arrow.optics.Iso<optic.valueDSL.domain.Account, kotlin.Pair<kotlin.Int, kotlin.Int>> inline get()= arrow.optics.Iso(
  get = { account: optic.valueDSL.domain.Account -> kotlin.Pair(account.`balance`, account.`available`) },
  reverseGet = { pair: kotlin.Pair<kotlin.Int, kotlin.Int> -> optic.valueDSL.domain.Account(pair.first, pair.second) }
)

inline val optic.valueDSL.domain.Account.Companion.balance: arrow.optics.Lens<optic.valueDSL.domain.Account, kotlin.Int> inline get()= arrow.optics.Lens(
  get = { account: optic.valueDSL.domain.Account -> account.`balance` },
  set = { account: optic.valueDSL.domain.Account, value: kotlin.Int -> account.copy(`balance` = value) }
)

inline val optic.valueDSL.domain.Account.Companion.available: arrow.optics.Lens<optic.valueDSL.domain.Account, kotlin.Int> inline get()= arrow.optics.Lens(
  get = { account: optic.valueDSL.domain.Account -> account.`available` },
  set = { account: optic.valueDSL.domain.Account, value: kotlin.Int -> account.copy(`available` = value) }
)




inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Getter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Setter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Fold<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Account>.balance: arrow.optics.Every<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.balance

inline val <S> arrow.optics.Iso<S, optic.valueDSL.domain.Account>.available: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Lens<S, optic.valueDSL.domain.Account>.available: arrow.optics.Lens<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Optional<S, optic.valueDSL.domain.Account>.available: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Prism<S, optic.valueDSL.domain.Account>.available: arrow.optics.Optional<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Getter<S, optic.valueDSL.domain.Account>.available: arrow.optics.Getter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Setter<S, optic.valueDSL.domain.Account>.available: arrow.optics.Setter<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Traversal<S, optic.valueDSL.domain.Account>.available: arrow.optics.Traversal<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Fold<S, optic.valueDSL.domain.Account>.available: arrow.optics.Fold<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
inline val <S> arrow.optics.Every<S, optic.valueDSL.domain.Account>.available: arrow.optics.Every<S, kotlin.Int> inline get() = this + optic.valueDSL.domain.Account.available
