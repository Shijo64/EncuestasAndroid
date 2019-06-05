package Helpers

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type
import java.util.*

class JsonDateDeserializer:JsonDeserializer<Date> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Date {
        val s = json?.asJsonPrimitive?.asString
        val l = java.lang.Long.parseLong(s?.substring(6, s?.length - 2))
        val d = Date(l)
        return d
    }


}