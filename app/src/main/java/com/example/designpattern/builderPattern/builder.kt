package com.example.designpattern.builderPattern

data class Bilgisayar(val islemci: String, val ram: String, val depolama: String)

class BilgisayarBuilder {
    var islemci: String = "Varsayılan İşlemci"
    var ram: String = "8GB"
    var depolama: String = "1TB"

    fun setIslemci(islemci: String) = apply { this.islemci = islemci }
    fun setRam(ram: String) = apply { this.ram = ram }
    fun setDepolama(depolama: String) = apply { this.depolama = depolama }
    fun build() = Bilgisayar(islemci, ram, depolama)
}


fun main() {
    val bilgisayar = BilgisayarBuilder()
        .setIslemci("Intel i7")
        .setRam("16GB")
        .setDepolama("512GB SSD")
        .build()

    println(bilgisayar)
}

/*
Bu örnekte, BilgisayarBuilder sınıfı ile özel bir bilgisayar nesnesi oluşturuyoruz. İşlemci,
RAM ve depolama gibi özellikleri istediğimiz gibi ayarlayabiliyoruz. build() fonksiyonu çağrıldığında,
bu özelliklerle donatılmış bir Bilgisayar nesnesi oluşturulur.
*/
