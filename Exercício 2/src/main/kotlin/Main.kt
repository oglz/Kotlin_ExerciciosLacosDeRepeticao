fun main() {
//2-) Ler 10 números e imprimir quantos são pares e quantos são ímpares.

    var par: Int = 0
    var impar: Int = 0

    for( i in 1..10){
        print("Digite o número: ")
        var num = readLine()!!.toDouble()

        if (num % 2.0 == 0.0){
            par++

        }else if(num % 1 == 1.0){
            impar++
        }
    }
    print("Há um total de $par número pares e $impar números ímpares. ")
}
