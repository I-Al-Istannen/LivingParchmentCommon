package me.ialistannen.livingparchment.common.api.request

/**
 * A request to the server to add a book.
 *
 * @param isbn the isbn of the book to add
 */
data class BookAddRequest(val isbn: String)