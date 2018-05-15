package me.ialistannen.livingparchment.common.api.response

import java.awt.print.Book

/**
 * A response with books from the server.
 */
data class BookResponse(
        val books: List<Book>
)