// Data class tanımı
data class Shape(val type: String, val color: String)

fun main() {
    // Bir şekil nesnesi oluştur
    val originalShape = Shape(type = "Circle", color = "Red")

    // Nesnenin kopyasını oluştur
    val clonedShape = originalShape.copy()

    // Orjinal ve klon şekilleri yazdır
    println("Orjinal Şekil: $originalShape")
    println("Klonlanmış Şekil: $clonedShape")
}
