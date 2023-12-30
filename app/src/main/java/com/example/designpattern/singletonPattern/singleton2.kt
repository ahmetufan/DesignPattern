package com.example.designpattern.singletonPattern

class NetworkService(private val apiUrl: String) {
    fun fetchData(endpoint: String): String {
        // API çağrısı yapma taklidi
        return "Veriler $apiUrl/$endpoint adresinden alındı"
    }
}

object AppModule {
    private const val BASE_API_URL = "https://example.com/api"

    val networkService: NetworkService by lazy {
        NetworkService(BASE_API_URL)
    }
}

fun main() {
    // AppModule üzerinden NetworkService'e erişim ve API çağrısı
    val response = AppModule.networkService.fetchData("users")
    println(response)

    // Aynı NetworkService örneği kullanılarak başka bir API çağrısı
    val anotherResponse = AppModule.networkService.fetchData("products")
    println(anotherResponse)
}

/*
Bu kodda NetworkService, API URL'si gibi bir yapılandırma parametresi alarak oluşturulur.
AppModule içindeki networkService, lazy kullanılarak tanımlanmış ve bu sayede sadece ilk
erişildiğinde oluşturulacak ve sonrasında aynı örnek kullanılacaktır.

main fonksiyonunda, AppModule üzerinden networkService'e erişerek API çağrıları yapıyoruz.
Bu yaklaşım, gerçek dünyadaki uygulamalarda sıkça karşılaştığımız bir yapıyı temsil eder
ve Singleton Pattern'in uygulamalarda nasıl kullanılabileceğini gösterir.*/
