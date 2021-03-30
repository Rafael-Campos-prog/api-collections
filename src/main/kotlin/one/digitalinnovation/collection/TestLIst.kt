package one.digitalinnovation.collection

fun main () {
   val joao = Funcionario(  "joao",2000.0,"CLT")
   val pedro = Funcionario( "pedro", 1500.0,"PJ")
   val rafael = Funcionario( "rafael", 4000.0,"CLT")

   val funcionarios = listOf(joao, pedro, rafael)

    funcionarios.forEach { println(it) }

    println("-----------------------------")
    println(funcionarios.find { it.nome == "rafael" })

    println("----------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("----------------------------")
    funcionarios
        .groupBy { it.tipoContratacao}
        .forEach { println(it) }

}


