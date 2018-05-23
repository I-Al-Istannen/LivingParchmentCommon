package me.ialistannen.livingparchment.common.api.response

import me.ialistannen.livingparchment.common.model.Book


/**
 * A response with books from the server.
 */
data class BookResponse(
        val books: List<Book>
)