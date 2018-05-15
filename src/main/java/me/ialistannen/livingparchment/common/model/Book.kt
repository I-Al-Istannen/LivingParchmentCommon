package me.ialistannen.livingparchment.common.model

import java.util.*

/**
 * A simple POJO for a book.
 *
 * Extra data can be stored in the [extra] field, serialized to strings.
 */
data class Book(
        val title: String,
        val author: List<String>,
        val pageCount: Int,
        val isbn: String,
        val language: String,
        val published: Date = Date(0),
        val genre: List<String> = emptyList(),
        val extra: Map<String, String> = mapOf()
)