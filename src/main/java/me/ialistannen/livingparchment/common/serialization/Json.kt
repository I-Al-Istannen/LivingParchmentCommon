package me.ialistannen.livingparchment.common.serialization

import com.google.gson.*
import java.util.*

object Json {
    val gson: Gson = GsonBuilder()
            .registerTypeAdapter(
                    Date::class.java,
                    JsonSerializer<Date> { src, _, _ -> JsonPrimitive(src.time) }
            )
            .registerTypeAdapter(
                    Date::class.java,
                    JsonDeserializer<Date> { json, _, _ -> Date(json.asLong) }
            )
            .create()
}

/**
 * Parses the String to an object of the given class.
 *
 * @throws JsonSyntaxException if the JSON is malformed
 */
inline fun <reified T> String.fromJson(): T {
    return Json.gson.fromJson(this, T::class.java)
}

/**
 * Converts the object to json.
 *
 * @return the generated json for the object.
 */
fun <T : Any?> T.toJson(): String? {
    return Json.gson.toJson(this)
}