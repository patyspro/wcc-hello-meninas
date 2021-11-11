fun main(args: Array<String>) {
    //integer, strings,character
    //val = variável não constante

    val numero: Int = 1_000_000  // ou val numero = 1_000_000
    val texto: String = "Olá, como vocês estão?"
    val caractere: Char = 'A'
    var boolean = true // boolean

    println("numero: " + numero)
    println("texto: " + texto)
    println("numero: " + caractere)
    println("espaco:  $boolean" )

    println("${numero::class.simpleName}")// Typeof kotlin  Resposta: int
    println("${texto::class.simpleName}") // Typeof kotlin Resposta: String
    println("${caractere::class.simpleName}") // Typeof kotlin Resposta: char

    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

}
