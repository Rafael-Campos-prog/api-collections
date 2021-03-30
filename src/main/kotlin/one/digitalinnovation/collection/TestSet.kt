package one.digitalinnovation.collection

fun main () {
    val joao = Funcionario( "joao",2000.0,"CLT")
    val pedro = Funcionario("pedro", 1500.0,"PJ")
    val rafael = Funcionario( "rafael", 4000.0,"CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf( rafael)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("---------------------------")
    val funcionarios3 = setOf(joao, pedro, rafael)
    val resultSubtract = funcionarios1.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    print("-----------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}