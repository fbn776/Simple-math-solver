
fun <T>MutableList<T>.lastElm(): T {
    return this[this.size-1]
}

fun main() {

    val ls: Queue<Char> = Queue<Char>(*("1*2/2".toCharArray().toTypedArray()))

    println("The queue is: $ls")

    val infixNot = InfixNotation().convert(ls)
    val result = infixNot.result
    val solver = SolveInfix().solve(result)

    println("The infix notation is: $result")
    println("The solved is: ${solver}")
}