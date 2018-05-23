package me.ialistannen.livingparchment.common.serialization

import me.ialistannen.livingparchment.common.model.Book
import org.junit.Ignore
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class JsonTest {

    @Test
    fun `serialization throws no error`() {
        assertDoesNotThrow { getBook().toJson() }
    }

    @Test
    fun `round-trip works`() {
        val original = getBook()
        val json = original.toJson()!!

        val fromJson = json.fromJson<Book>()
        assertEquals(original, fromJson)
    }

    @Test
    @Ignore
    fun `round-trip fails for integers`() {
        val original = getBook().copy(extra = mapOf("hm" to "2"))
        val json = original.toJson()!!

        val fromJson = json.fromJson<Book>()
        assertNotEquals(original, fromJson)
    }

    private fun getBook(): Book {
        return Book(
                title = "The mockingbird",
                authors = listOf("Cornelia Funke"),
                pageCount = 20,
                isbn = "123456789",
                language = "english",
                published = Date(),
                genre = listOf("Fantasy"),
                extra = mutableMapOf("hey" to "2.0", "yea" to "ya")
        )
    }
}