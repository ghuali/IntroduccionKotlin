fun main() {
    val numeroEntero: Int = 10
    val numeroDoble: Double = 10.0
    val numeroFlotante: Float = 10.0f
    val mensaje: String = "Hola Kotlin"
    val estado: Boolean = true
    val numeros = mutableListOf(1, 3, 7)

    println("Entero: $numeroEntero, Doble: $numeroDoble, Flotante: $numeroFlotante, String: $mensaje, Boolean: $estado")
    println("\n----- Lista Mutable -----\n")
    modificarLista()
    println("\n----- Mapa -----\n")
    trabajarConMapa()
    println("\n----- Condiciones -----\n")
    verificarCondicion()
    println("\n----- Bucle For -----\n")
    recorrerConFor(numeros)
    println("\n----- Bucle While -----\n")
    recorrerConWhile(numeros)
    println("\n----- When -----\n")
    evaluarWhen()
    println("\n----- Clases -----\n")
    crearClase()
    println("\n----- Null Safety -----\n")
    manejarNullSafety()
}

fun modificarLista() {
    val elementos = mutableListOf("Hola", "Adiós")
    println("Lista original: $elementos")
    elementos.add("Café")
    println("Lista actualizada: $elementos")
}

fun trabajarConMapa() {
    val mapaEdades = mutableMapOf("Ana" to 30, "Luis" to 25)
    println("Mapa inicial: $mapaEdades")
    mapaEdades["Carla"] = 28
    println("Mapa actualizado: $mapaEdades")
    println("Edad de Carla: ${mapaEdades["Carla"]}")
}

fun verificarCondicion() {
    val valor = 5

    if (valor > 3) {
        println("El valor es mayor que 3")
    } else {
        println("El valor es menor o igual a 3")
    }
}

fun recorrerConFor(lista: MutableList<Int>) {
    for (elemento in lista) {
        println("Elemento: $elemento")
    }
}

fun recorrerConWhile(lista: MutableList<Int>) {
    var indice = 0
    while (indice < lista.size) {
        println("Índice $indice: ${lista[indice]}")
        indice++
    }
}

fun evaluarWhen() {
    val mes = 3
    val nombreMes = when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        else -> "Mes desconocido"
    }
    println("Mes seleccionado: $nombreMes")
}

fun crearClase() {
    class Persona(val nombre: String, val edad: Int)

    val persona = Persona("Carlos", 22)
    println("Nombre: ${persona.nombre}")
    println("Edad: ${persona.edad}")
}

fun manejarNullSafety() {
    var apellido: String? = null
    apellido?.let {
        println("Mi apellido es $it")
    } ?: run {
        println("No tengo apellido")
    }
}
