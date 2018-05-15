package me.ialistannen.livingparchment.common.api.response

/**
 * The response to the request to delete a book.
 */
data class BookDeleteResponse(
        val isbn: String,
        val status: BookDeleteStatus
)

/**
 * The different outcomes of deleting a book.
 */
enum class BookDeleteStatus {
    NOT_FOUND,
    DELETED,
    INTERNAL_ERROR
}