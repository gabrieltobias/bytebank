fun main() {
    println("Bem vindo ao ByteBank")
    //Criando conta 1
    val contaGabriel = Conta()
    contaGabriel.titular = "Gabriel"
    contaGabriel.numero = 100
    contaGabriel.saldo = 100.0
    //Criando conta 2
    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 200
    contaFran.saldo = 100.0

    //Mostrando o saldo atual
    println("Saldo Gabriel: ${contaGabriel.saldo}")
    println("Saldo Fran: ${contaFran.saldo}")
    //Depositando
//    contaGabriel.deposita(50.0)
//    println("Conta Gabriel: ${contaGabriel.saldo}")
//    contaFran.deposita(100.0)
//    println("Conta Fran: ${contaFran.saldo}")

    //Sacando
//    println("Sacando na conta do Gabriel")
//    contaGabriel.saca(20.0)
//    println(contaGabriel.saldo)
//    println("Sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)

    //Transferindo
    println("Transferencia Fran para Gabriel")
    if(contaFran.transfere(400.0,contaGabriel)){
        println("Trânsferencia feita com sucesso!")
    }else{
        println("Falha na trânsferencia")
    }

    println(contaGabriel.saldo)
    println(contaFran.saldo)
}


//Criando uma classe

class Conta {
    var titular = "";
    var numero = 0;
    var saldo = 0.0;

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.saldo += valor
            return true
        }
        return false
    }
}

fun testaReferenciasCopias() {
    //Referenciando um objeto
    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
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