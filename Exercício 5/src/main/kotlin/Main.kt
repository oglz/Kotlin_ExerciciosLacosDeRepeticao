fun main() {
//5-) Crie um programa que leia um número do teclado até que encontre um número igual a zero. no final, mostre a soma dos números digitados.
        var soma = 0

        do {print("Digite um número: ")
            val num = readLine()!!.toInt()

            soma += num

        } while (num != 0)
        println("soma = $soma")
}
