package me.ialistannen.livingparchment.common.api.response

data class BookLocationDeleteResponse(
        val id: String,
        val status: BookLocationDeleteStatus
)

enum class BookLocationDeleteStatus {
    DELETED, INTERNAL_ERROR
}