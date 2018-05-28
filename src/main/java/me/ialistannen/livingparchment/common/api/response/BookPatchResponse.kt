package me.ialistannen.livingparchment.common.api.response

data class BookPatchResponse(val isbn: String, val status: BookPatchStatus)

enum class BookPatchStatus {
    PATCHED,
    INTERNAL_ERROR,
    NOT_FOUND
}