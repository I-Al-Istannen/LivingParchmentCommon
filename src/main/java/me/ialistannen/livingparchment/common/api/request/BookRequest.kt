package me.ialistannen.livingparchment.common.api.request

import me.ialistannen.livingparchment.common.api.query.QueryType
import me.ialistannen.livingparchment.common.model.Book

/**
 * A request to the server to fetch books based on some criteria.
 *
 * @param attributeName is the name of the attribute to filter on. It is equal to the name of the
 * field in [Book] or matches the custom ones defined in [Book.extra] there
 */
data class BookRequest(
        val queryType: QueryType,
        val queryString: String,
        val attributeName: String
)