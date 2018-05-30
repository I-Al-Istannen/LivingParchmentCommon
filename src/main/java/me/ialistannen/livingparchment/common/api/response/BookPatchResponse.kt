package me.ialistannen.livingparchment.common.api.response

import me.ialistannen.livingparchment.common.model.Book

data class BookPatchResponse(val isbn: String, val status: BookPatchStatus, val book: Book?)

enum class BookPatchStatus {
    PATCHED,
    INTERNAL_ERROR,
    NOT_FOUND
}