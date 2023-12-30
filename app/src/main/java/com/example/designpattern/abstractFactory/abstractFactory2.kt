package com.example.designpattern.abstractFactory

// Temel Kırtasiye Malzemesi sınıfı
abstract class KirtasiyeMalzemesi {
    abstract fun tanim(): String
}

// Okul seti için malzemeler
class RenkliKalem : KirtasiyeMalzemesi() {
    override fun tanim() = "Renkli Kalem"
}
class Defter : KirtasiyeMalzemesi() {
    override fun tanim() = "Defter"
}

// Ofis seti için malzemeler
class TükenmezKalem : KirtasiyeMalzemesi() {
    override fun tanim() = "Tükenmez Kalem"
}
class Ajanda : KirtasiyeMalzemesi() {
    override fun tanim() = "Ajanda"
}

// Kırtasiye seti fabrikası arayüzü
interface KirtasiyeSetiFabrikasi {
    fun malzemeUret(): KirtasiyeMalzemesi
}

// Okul seti fabrikası
class OkulSetiFabrikasi : KirtasiyeSetiFabrikasi {
    override fun malzemeUret() = RenkliKalem() // veya Defter
}

// Ofis seti fabrikası
class OfisSetiFabrikasi : KirtasiyeSetiFabrikasi {
    override fun malzemeUret() = TükenmezKalem() // veya Ajanda
}

// Fabrikaların kullanımı
fun main() {
    val okulSetiFabrikasi = OkulSetiFabrikasi()
    val ofisSetiFabrikasi = OfisSetiFabrikasi()

    val okulMalzemesi = okulSetiFabrikasi.malzemeUret()
    println("Üretilen Kırtasiye Malzemesi: ${okulMalzemesi.tanim()}")

    val ofisMalzemesi = ofisSetiFabrikasi.malzemeUret()
    println("Üretilen Kırtasiye Malzemesi: ${ofisMalzemesi.tanim()}")
}
