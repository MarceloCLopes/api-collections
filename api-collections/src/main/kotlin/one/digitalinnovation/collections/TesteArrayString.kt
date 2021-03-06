package one.digitalinnovation.collections

fun main() {
    val names = Array(5){""}
    names[0] = "Marcelo"
    names[1] = "David"
    names[2] = "Maria"
    names[3] = "Rony"
    names[4] = "Ericton"

    for (nome in names){
        println(nome)
    }

    println("--------------------------")
    names.sort()
    names.forEach {  println(it)}

    println("--------------------------")
    val names2 = arrayOf("Marcelo", "David", "Ericton")
    names2.sort()
    names2.forEach { println(it) }
}