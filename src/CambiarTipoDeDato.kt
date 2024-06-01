fun main(){
    //Cambio de tipo de dato y concatenaciones
    val num1 = 5
    val num2 = "10"
    val res = num1 + num2.toInt()
    println(res)
    val t1 = "Hola"
    val t2 = "Mundo"
    val texto = t1 + " " + t2
    println(texto)
    println("Soy el numero. $t1")
    val resultado = t1.plus(" ").plus(t2)
    val array = arrayOf("Hola", "Mundo")
    val res2 = array.joinToString { " " }
    println(res2)

}