package com.example.designpattern.factory

// Temel Kahve sınıfı
abstract class Kahve {
    abstract fun hazırla()
}
// Machiato sınıfı
class Machiato : Kahve() {
    override fun hazırla() {
        println("Machiato hazırlanıyor...")
    }
}

// Espresso sınıfı
class Espresso : Kahve() {
    override fun hazırla() {
        println("Espresso hazırlanıyor...")
    }
}

// Latte sınıfı
class Latte : Kahve() {
    override fun hazırla() {
        println("Latte hazırlanıyor...")
    }
}

// Americano sınıfı
class Americano : Kahve() {
    override fun hazırla() {
        println("Americano hazırlanıyor...")
    }
}

// Kahve Dükkanı
class KahveDukkani {
    fun siparişVer(kahveTuru: String): Kahve {
        return when (kahveTuru) {
            "espresso" -> Espresso()
            "latte" -> Latte()
            "americano" -> Americano()
            "machiato" -> Americano()
            else -> throw IllegalArgumentException("Bilinmeyen kahve türü")
        }
    }
}

// Test
fun main() {
    val dukkan = KahveDukkani()

    val espresso = dukkan.siparişVer("espresso")
    espresso.hazırla()

    val latte = dukkan.siparişVer("latte")
    latte.hazırla()

    val americano = dukkan.siparişVer("americano")
    americano.hazırla()
}
