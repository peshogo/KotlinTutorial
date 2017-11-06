fun main(args: Array<String>) {
    val hello = "Hello World!"
    println(hello)

    // val i: Int = 10
    val i = 20

    val s = "hogehoge"

    // val num = 0
    // num = 1 <- Error

    var num = 0
    num = 1 // <- OK

    val a = 100
    val b = 50

    // 普通にprintln()を使って出力できます
    println(a)
    println(a + b)

    // 文字列の途中に変数を入れることもできます
    println("a + b = ${a + b}")

    // ${}の中が一つの場合$だけに省略できます
    println("a = $a")
}