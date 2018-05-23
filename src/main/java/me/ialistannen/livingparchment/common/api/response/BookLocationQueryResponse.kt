package me.ialistannen.livingparchment.common.api.response

import me.ialistannen.livingparchment.common.model.BookLocation

data class BookLocationQueryResponse(val locations: List<BookLocation>)