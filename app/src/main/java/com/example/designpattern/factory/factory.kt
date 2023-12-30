package com.example.designpattern.factory

// Temel Pizza sınıfı
abstract class Pizza {
    abstract fun prepare()
    abstract fun bake()
    abstract fun cut()
    abstract fun box()
}

// Pepperoni Pizza sınıfı
class PepperoniPizza : Pizza() {
    override fun prepare() {
        println("Pepperoni Pizza hazırlanıyor...")
    }

    override fun bake() {
        println("Pepperoni Pizza pişiriliyor...")
    }

    override fun cut() {
        println("Pepperoni Pizza kesiliyor...")
    }

    override fun box() {
        println("Pepperoni Pizza kutulanıyor...")
    }
}

// Margherita Pizza sınıfı
class MargheritaPizza : Pizza() {
    override fun prepare() {
        println("Margherita Pizza hazırlanıyor...")
    }

    override fun bake() {
        println("Margherita Pizza pişiriliyor...")
    }

    override fun cut() {
        println("Margherita Pizza kesiliyor...")
    }

    override fun box() {
        println("Margherita Pizza kutulanıyor...")
    }
}

// Pizza Factory
class PizzaFactory {
    fun createPizza(type: String): Pizza {
        return when (type) {
            "pepperoni" -> PepperoniPizza()
            "margherita" -> MargheritaPizza()
            else -> throw IllegalArgumentException("Bilinmeyen pizza türü")
        }
    }
}

// Factory Method Testi
fun main() {
    val factory = PizzaFactory()

    val pepperoni = factory.createPizza("pepperoni")
    pepperoni.prepare()
    pepperoni.bake()
    pepperoni.cut()
    pepperoni.box()

    val margherita = factory.createPizza("margherita")
    margherita.prepare()
    margherita.bake()
    margherita.cut()
    margherita.box()
}
