package Helpers

import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonSerializer
import java.lang.reflect.Type
import java.util.*


class DateSerializer : JsonSerializer<Date> {
    override fun serialize(date:Date, type:Type?, context:JsonSerializationContext?):JsonElement{
        val json = JsonPrimitive(date.time)
        return json
    }
}