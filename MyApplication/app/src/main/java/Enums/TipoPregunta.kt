package Enums

enum class TipoPregunta(val tipo:String) {

    ESTRELLA("Calificación (estrellas)"),
    COMBO("Combo"),
    SEGMENTO("Segmento"),
    TEXTO("Texto abierto"),
    FECHA("Fecha"),
    OPCIONMULTIPLE("Opción multiple"),
    COMENTARIOS("Comentarios"),
    EMAIL("Correo electrónico"),
    CELULAR("Celular")
}