fun main(args: Array<String>) {
    val a = 5
    val b = 8

    val s = sum(a, b)
    println("a + b = $s")

    val s2 = sum2(a, b)
    println("a + b = $s2")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b