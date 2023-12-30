package com.example.designpattern.builderPattern

data class Sandvic(val ekmek: String, val peynir: String, val et: String)

class SandvicBuilder {
    var ekmek: String = "Buğday"
    var peynir: String = "Cheddar"
    var et: String = "Hindi"

    fun setEkmek(ekmek: String) = apply { this.ekmek = ekmek }
    fun setPeynir(peynir: String) = apply { this.peynir = peynir }
    fun setEt(et: String) = apply { this.et = et }
    fun build() = Sandvic(ekmek, peynir, et)
}

fun main() {
    val sandvic = SandvicBuilder()
        .setEkmek("Beyaz Ekmek")
        .setPeynir("Mozzarella")
        .setEt("Tavuk")
        .build()

    println(sandvic)
}


/*
Bu örnekte, SandvicBuilder sınıfı ile özel bir sandviç oluşturuyoruz. Ekmek, peynir ve et gibi
özellikleri istediğimiz gibi ayarlıyoruz. build() fonksiyonu çağrıldığında, bu özelliklerle
donatılmış bir Sandvic nesnesi oluşturulur.
.*/
