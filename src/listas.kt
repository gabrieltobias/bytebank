fun main(){

    //Criando um array
    val idades: IntArray = intArrayOf(25,33,44,100)
    var maiorIdade = Int.MIN_VALUE
    //Percorrendo o array e atribuindo o valor a uma variavel
    for (idade in idades){
        if(idade > maiorIdade)
            maiorIdade = idade
    }

    println(maiorIdade)
    var menorIdade = Int.MAX_VALUE
    //Percorrendo o array usando a função forEach
    idades.forEach { idade->
        if(idade<menorIdade){
            menorIdade = idade
        }
    }

    print(menorIdade)
}