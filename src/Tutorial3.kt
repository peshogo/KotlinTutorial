fun main(args: Array<String>) {
    val a = 5
    val b = 8

    // ifの普通の使い方
    if (a < b) {
        println("a < b is True!")
    } else {
        println("a < b is False!")
    }

    println("-------------------------")

    // ifの関数的な使い方
    val c = -10
    println("abs(c) = ${abs(c)}")

    println("-------------------------")

    // for文
    val list = listOf("banana", "apple", "tomato", "potato")
    for (item in list) {
        println(item)
    }

    println("-------------------------")

    // for文(回数で指定)
    for (i in 1..10) {
        println("i = $i")
    }

    println("-------------------------")

    // while文
    var i = 1
    while (i <= 10) {
        println("i = $i")
        i++
    }
}

fun abs(a: Int) = if (a >= 0) a else -a