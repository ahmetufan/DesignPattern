package com.example.designpattern.singletonPattern

// Singleton sınıfı tanımlama
object DatabaseManager {
    init {
        println("DatabaseManager oluşturuldu.")
    }

    fun connect() {
        // Veritabanına bağlanma işlemi
        println("Veritabanına bağlandı.")
    }

    // Diğer veritabanı işlemleri
}

fun main() {
    // DatabaseManager'a erişim ve bağlantı işlemi
    DatabaseManager.connect()

    // Bir başka yerden tekrar erişim
    DatabaseManager.connect()
}


/*
Bu kodda, DatabaseManager adında bir Singleton sınıfımız
var . object anahtar kelimesi sayesinde, Kotlin bu sınıfın yalnızca bir örneğini oluşturur.
main fonksiyonunda DatabaseManager sınıfına iki kez erişiyoruz, ancak her seferinde aynı
örneği kullanıyoruz. Bu yüzden DatabaseManager oluşturuldu. mesajı sadece bir kez yazdırılacak,
çünkü sınıf sadece bir kez oluşturulur.

Singleton Pattern, özellikle kaynakları paylaşmanız gereken durumlarda veya bir sınıfın yalnızca
bir örneğinin olması gerektiğinde çok kullanışlıdır. Bu örnek, bu kavramı basit ve anlaşılır
bir şekilde göstermektedir.*/
