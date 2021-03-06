package one.digitalinnovation.collections

fun main() {
    val jonny = funcionario("Jonny", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(jonny.nome, jonny)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("------------------------------")
    repositorio.findAll().forEach{ println(it)}

    println("------------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it)}
}