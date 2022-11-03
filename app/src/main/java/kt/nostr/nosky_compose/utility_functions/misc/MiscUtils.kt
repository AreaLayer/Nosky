package kt.nostr.nosky_compose.utility_functions.misc

fun isPrime(number: Int): Boolean {
    for (potentialFactor in 2..number/2){
        if (potentialFactor.isFactorOf(number)) return false
    }
    return true
}

fun Int.isFactorOf(number: Int): Boolean {
    return number % this == 0
}

enum class LinkInfo(val description: String, val link:String){
    SourceCode(description = "Source Code", link =  "https://github.com/AnonymousGeekDev/Nosky"),
    Telegram(description = "Telegram", link = "https://t.me/nostr_protocol"),
    Matrix(description = "Matrix(unofficial)", link = "https://matrix.to/#/#nostr-lobby:matrix.org")
}
