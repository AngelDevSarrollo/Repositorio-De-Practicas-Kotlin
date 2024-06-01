fun main(){
    // null safety / valores opcionales
    var x : String? = null
    var z : String? = null
    x = "hola"
    println(x)
    x?.let {
        println("tiene valor")
    }
    println()
    println(z)
    z?.let {
        println("tiene valor")
    }
    //a y b
    var id : Int? = 0
    id?.let {
        println("tiene valor")
    }
}