package com.example.designpattern.abstractFactory

// Temel Telefon sınıfı
abstract class Telefon {
    abstract fun model(): String
    abstract fun isletimSistemi(): String
}

// Apple telefonları için sınıflar
class iPhone : Telefon() {
    override fun model() = "iPhone"
    override fun isletimSistemi() = "iOS"
}

// Samsung telefonları için sınıflar
class Galaxy : Telefon() {
    override fun model() = "Galaxy"
    override fun isletimSistemi() = "Android"
}

// Telefon fabrikası arayüzü
interface TelefonFabrikasi {
    fun telefonUret(): Telefon
}

// Apple fabrikası
class AppleFabrikasi : TelefonFabrikasi {
    override fun telefonUret() = iPhone()
}

// Samsung fabrikası
class SamsungFabrikasi : TelefonFabrikasi {
    override fun telefonUret() = Galaxy()
}

// Fabrikaların kullanımı
fun main() {
    val appleFabrika = AppleFabrikasi()
    val samsungFabrika = SamsungFabrikasi()

    val appleTelefon = appleFabrika.telefonUret()
    println("Üretilen Telefon: ${appleTelefon.model()} - İşletim Sistemi: ${appleTelefon.isletimSistemi()}")

    val samsungTelefon = samsungFabrika.telefonUret()
    println("Üretilen Telefon: ${samsungTelefon.model()} - İşletim Sistemi: ${samsungTelefon.isletimSistemi()}")
}
