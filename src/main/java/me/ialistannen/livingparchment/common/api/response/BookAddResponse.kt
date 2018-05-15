package me.ialistannen.livingparchment.common.api.response

/**
 * Send by the server to update the client on the status of a request.
 */
data class BookAddResponse(
        val isbn: String,
        val status: BookAddStatus
)

/**
 * The different possible conditions that can be returned by the server in response to a request
 * to add a book.
 */
enum class BookAddStatus {
    ALREADY_CONTAINED,
    NOT_FOUND,
    ADDED,
    INTERNAL_ERROR
}