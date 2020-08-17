import kotlin.math.roundToLong

fun main(){
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 10000.0)

    val aumento = 1.1

    //iterando
    for (i in  salarios.indices){
        salarios[i] = (salarios[i] * aumento)
    }
    //Ou
    salarios.forEachIndexed{i,salario ->
        salarios[i] = salario * aumento
    }

    print(salarios.contentToString())
}