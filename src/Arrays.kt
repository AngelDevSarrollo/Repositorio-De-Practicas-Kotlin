fun main() {
    //array, listas, for,
    //creamos un array
    var array = arrayOf("luis", "mario",3,4,5,true)
    //lo imprimimos
    println(array.contentToString())
    //array numerico
    var numeros = intArrayOf(1,2,3,4,5)
    //imprimimos una posicion concreta del array
    println(array[1])
    //modificamos algo del array
    array[1] = "Mario Lopez"
    println(array[1])
    //Imprime la cantidad de objetos que hay en el arrat
    println(numeros.size)
    //añadimos un objeto al array
    array += "Sergio"
    println(array.contentToString())
    var nums = intArrayOf(3,6,2,4,7,89,2,3)
    //ordena el array
    nums.sort()
    println(nums.contentToString())
    //Te da las opciones duplicadas
    val duplicate = nums.groupBy {it}.filter {it.value.size>1}.keys
    println(duplicate)

}