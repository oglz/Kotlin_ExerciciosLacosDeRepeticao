fun main() {
//3-) Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
  var idade = 0
  var pessoas21 = -1
  var pessoas50 = 0

  while(idade!=-99)
  {
      print("Digite a sua idade ou digite -99 para sair: ")
      idade = readLine()!!.toInt()

      if(idade < 21){
        pessoas21++

      }else if(idade > 50){
        pessoas50++
      }

  }
    println("Total de pessoas com menos de 21 anos: $pessoas21")
    println("Total de pessoas com mais de 50 anos: $pessoas50")
}

