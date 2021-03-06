package one.digitalinnovation.collections

fun main() {
    val jonny = funcionario("Jonny", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    println("-------------- LIST ----------------")
    val funcionarios = mutableListOf(jonny, maria)
    funcionarios.forEach { println(it) }

    println("------------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------------------------")
    funcionarios.remove(jonny)
    funcionarios.forEach { println(it) }

    println("-------------- SET ----------------")
    val funcionarioSet = mutableSetOf(jonny)
    funcionarioSet.forEach { println(it) }

    println("------------------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}