package me.ialistannen.livingparchment.common.api.request

import me.ialistannen.livingparchment.common.model.BookLocation

data class BookIsbnAddRequest(val isbn: String, val location: BookLocation?)