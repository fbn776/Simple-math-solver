
fun <T>MutableList<T>.lastElm(): T {
    return this[this.size-1]
}

fun main() {

    val ls: Queue<Char> = Queue<Char>(*("1*2/-2".toCharArray().toTypedArray()))

    println("The queue is: $ls")

    val infixNot = InfixNotation().convert(ls)

    println(infixNot.result)
    val result = infixNot.result
    var solver = SolveInfix().solve(result)

    println("Has error: ${infixNot.hasDecimalError || infixNot.hasOperatorError || infixNot.hasInvalidCharError}")
    println("The infix notation is: $result")
    println("The solved is: ${solver}")
}