package me.ialistannen.livingparchment.common.serialization

import me.ialistannen.livingparchment.common.model.Book
import me.ialistannen.livingparchment.common.model.BookLocation
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import java.util.*
import kotlin.test.assertEquals

internal class JsonTest {

    @Test
    fun `serializing book throws no error`() {
        assertDoesNotThrow { getBook().toJson() }
    }

    @Test
    fun `book round-trip works`() {
        val original = getBook()
        val json = original.toJson()!!

        val fromJson = json.fromJson<Book>()
        assertEquals(original, fromJson)
    }

    private fun getBook(): Book {
        return Book(
                title = "The mockingbird",
                authors = listOf("Cornelia Funke"),
                pageCount = 20,
                isbn = "123456789",
                language = "english",
                location = BookLocation("Test shelf", "N/A"),
                published = Date(),
                genre = listOf("Fantasy"),
                extra = mutableMapOf("hey" to "2.0", "yea" to "ya")
        )
    }

    @Test
    fun `serializing book location throws no error`() {
        assertDoesNotThrow { getBookLocation().toJson() }
    }

    @Test
    fun `book location round-trip works`() {
        val original = getBookLocation()
        val json = original.toJson()!!

        val fromJson = json.fromJson<BookLocation>()
        assertEquals(original, fromJson)
    }

    private fun getBookLocation(): BookLocation {
        return BookLocation("Name", "A location")
    }
}