fun main() {
    var i = 0;
    while (i < 5) {

        val titular: String = "Gabriel $i"
        val numeroConta: Int = 1000 + i;
        var saldo: Double = i + 10.0;
        println("Titular: $titular");
        println("Conta: $numeroConta");
        println("Saldo: $saldo");
        i++;
    }
//    for(i in 8 downTo 1) {
//    if(i==4){
//        break;
//    }
//    val titular: String = "Gabriel $i"
//    val numeroConta: Int = 1000 + i;
//    var saldo: Double = i + 10.0;
//
//        println("Titular: $titular");
//        println("Conta: $numeroConta");
//        println("Saldo: $saldo");
//    }

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
        saldo > 0.0 -> println("Saldo positivo");
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}