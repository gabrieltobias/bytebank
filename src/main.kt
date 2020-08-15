fun main(){
    val titular: String = "Gabriel"
    val numeroConta: Int = 2300;
    var saldo: Double = 0.0;
        saldo = 100.01 + 200;
        saldo -= 1000;

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    //When
    when {
        saldo > 0.0 -> println("Saldo positivo");
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}