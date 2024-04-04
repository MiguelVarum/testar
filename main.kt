import java.io.File

fun main() {
    val arquivoCSV = File("metas.csv")  //Arquivo CSV
    val metas = mutableListOf<List<String>>()    //Lista metas

    menu()

    var opcao: Int = 0

    while (opcao != 3) {    //loop
        print("Escolha uma opção: ")
        opcao = readLine()!!.toInt()    //Utilizador tem que escrever um numero inteiro

        when (opcao) {                  //Selecionar Opcao
            1 -> adicionarMeta(metas)
            2 -> eliminarMeta(metas)
            3 -> println("Sair...")
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

fun menu() {    //Funcao com os menus
    println("Gerenciamento de Metas Financeiras")
    println("1. Adicionar Meta")
    println("2. Eliminar Meta")
    println("3. Sair")
}

fun adicionarMeta(metas: MutableList<List<String>>) {   //Adicionar meta

}

fun eliminarMeta(metas: MutableList<List<String>>) {    //Eliminar meta

}