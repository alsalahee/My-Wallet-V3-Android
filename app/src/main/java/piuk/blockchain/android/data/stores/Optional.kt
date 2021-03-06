package piuk.blockchain.android.data.stores


@Suppress("unused")
sealed class Optional<out T> {
    class Some<out T>(val element: T): Optional<T>()
    object None: Optional<Nothing>()
}