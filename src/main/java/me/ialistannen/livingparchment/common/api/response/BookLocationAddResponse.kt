package me.ialistannen.livingparchment.common.api.response

data class BookLocationAddResponse(val bookLocation: String, val status: BookLocationAddStatus)

enum class BookLocationAddStatus {
    ADDED,
    INTERNAL_ERROR
}