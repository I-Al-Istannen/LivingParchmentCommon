package me.ialistannen.livingparchment.common.api.query

/**
 * The type of the query.
 */
enum class QueryType {
    /**
     * Returns all books whose title matches the query exactly.
     */
    EXACT_MATCH,
    /**
     * Returns all books whose title matches the query interpreted as a regular expression.
     */
    REGEX_MATCH,
    /**
     * Returns all books that contain the query string in the title.
     */
    PART,
    /**
     * The query string will be ignored, any book is considered matching.
     */
    RETURN_ALL
}