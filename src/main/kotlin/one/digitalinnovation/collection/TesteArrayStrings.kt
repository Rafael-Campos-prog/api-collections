package one.digitalinnovation.collection

fun main () {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Joceane"
    nomes[1] = "Isabela"
    nomes[2] = "Rafael"

    for (nome in nomes) {
        println(nome)
    }

    println("---------------------------")
    nomes.sort()
    nomes.forEach { println(it)}

    println("----------------------------")
    val nomes2 = arrayOf(" Joceane ", " Isabela "," Rafael ")
    nomes2.sort()
    nomes2.forEach { print(it)}

}