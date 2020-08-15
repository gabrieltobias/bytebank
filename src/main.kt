fun main() {
    println("Bem vindo ao ByteBank")
    //Criando conta 1
    val contaGabriel = Conta()
    contaGabriel.titular = "Gabriel"
    contaGabriel.numero = 100
    contaGabriel.saldo = 20.0
    println(contaGabriel.titular)
    println(contaGabriel.numero)
    println(contaGabriel.saldo)
    //Criando conta 2
    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 200
    contaFran.saldo = 30.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

}

//Criando uma classe

class Conta {
    var titular = "";
    var numero = 0;
    var saldo = 0.0;
}

fun testaLacos(){
    var i = 0
    while (i < 5) {

        val titular: String = "Gabriel $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0
        println("Titular: $titular")
        println("Conta: $numeroConta")
        println("Saldo: $saldo")
        i++
    }
    for (i in 8 downTo 1) {
        if (i == 4) {
            break
        }
        val titular: String = "Gabriel $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Conta: $numeroConta")
        println("Saldo: $saldo")

    }
}

fun testaCondicoes(saldo: Double) {
    //if
    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo neutro")
    } else {
        println("Saldo negativo")
    }
    //When
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}