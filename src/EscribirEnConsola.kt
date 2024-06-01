fun main() {
    //escribir en consola
    //try catch
    //bucle while
    var n1 : Double
    var n2: Double
    val result : Double
while (true)
    try {
        println("Escribe el primer valor:")
         n1 = readln().toDouble()
        println("Escribe el segundo valor:")
         n2 = readln().toDouble()
        break
    }catch (e:NumberFormatException){
        println("Error: escribe un numero valido $e")
    }
    result = n1 + n2 // + - * /
    print("El resultado de "+ n1 + " + "+n2+ " es igual a: " + result)
}




