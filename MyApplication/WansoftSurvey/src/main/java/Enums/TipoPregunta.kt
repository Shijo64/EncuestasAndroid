package Enums

enum class TipoPregunta(val tipo:String) {

    ESTRELLA("Calificación (estrellas)"),
    SEGMENTO("Opción múltiple (una opción)"),
    TEXTO("Texto breve"),
    FECHA("Fecha"),
    OPCIONMULTIPLE("Opción múltiple (varias opciones)"),
    COMENTARIOS("Texto extenso"),
    EMAIL("Correo electrónico"),
    CELULAR("Celular")
}