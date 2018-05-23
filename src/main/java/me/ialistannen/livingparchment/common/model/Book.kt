package me.ialistannen.livingparchment.common.model

import java.util.*

/**
 * A simple POJO for a book.
 *
 * Extra data can be stored in the [extra] field, serialized to strings.
 */
data class Book(
        val title: String,
        val pageCount: Int,
        val isbn: String,
        val language: String,
        val location: BookLocation,
        val published: Date = Date(0),
        val publisher: String = "",
        val extra: Map<String, Any> = mapOf()
) {

    @Suppress("UNCHECKED_CAST")
    val genre: List<String>
        get() = extra["genre"] as List<String>

    @Suppress("UNCHECKED_CAST")
    val authors: List<String>
        get() = extra["authors"] as List<String>

    constructor(
            title: String,
            pageCount: Int,
            isbn: String,
            language: String,
            location: BookLocation,
            published: Date = Date(0),
            authors: List<String>,
            publisher: String = "",
            genre: List<String> = emptyList(),
            extra: Map<String, Any> = mutableMapOf()
    ) : this(
            title, pageCount, isbn, language, location, published, publisher,
            extra.toMutableMap().apply {
                put("authors", authors)
                put("genre", genre)
            }
    )
}