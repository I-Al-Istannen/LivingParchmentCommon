package me.ialistannen.livingparchment.common.api.response

import me.ialistannen.livingparchment.common.model.BookLocation

data class BookLocationPatchResponse(val newLocation: BookLocation?,
                                     val status: BookLocationPatchStatus)

enum class BookLocationPatchStatus {
    PATCHED,
    NOT_FOUND,
    INTERNAL_ERROR
}