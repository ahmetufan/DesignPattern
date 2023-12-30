package com.example.designpattern.prototype

// Prototype sınıfı
abstract class Kurabiye : Cloneable {
    public override fun clone(): Kurabiye {
        return super.clone() as Kurabiye
    }

    // Kurabiyenin özellikleri ve metotları
    abstract fun tanim()
}

// Somut Kurabiye sınıfı
class CikolataliKurabiye : Kurabiye() {
    override fun tanim() {
        println("Çikolatalı kurabiye, çikolata parçacıkları içerir.")
    }
}

// Somut Kurabiye sınıfı
class FindikliKurabiye : Kurabiye() {
    override fun tanim() {
        println("Fındıklı kurabiye, kıyılmış fındık içerir.")
    }
}

fun main() {
    // Prototip kurabiye
    val prototipCikolataliKurabiye = CikolataliKurabiye()

    // Prototip kurabiyenin klonları
    val kurabiye1 = prototipCikolataliKurabiye.clone()
    val kurabiye2 = prototipCikolataliKurabiye.clone()

    // Kurabiyelerin tanımlarını yazdır
    kurabiye1.tanim()
    kurabiye2.tanim()

    // Farklı bir prototip oluştur
    val prototipFindikliKurabiye = FindikliKurabiye()

    // Yeni prototipin klonu
    val kurabiye3 = prototipFindikliKurabiye.clone()

    // Yeni kurabiyenin tanımını yazdır
    kurabiye3.tanim()
}
