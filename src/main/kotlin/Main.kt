
fun <T>MutableList<T>.lastElm(): T {
    return this[this.size-1]
}

fun main() {

    val ls: Queue<Char> = Queue<Char>(*("1+1÷2-1".toCharArray().toTypedArray()))

    println("The queue is: $ls")

    val infixNot = InfixNotation(ls)
    val result = infixNot.result
    val solver = SolveInfix(result)

    println("The infix notation is: $result")
    println("The solved is: ${solver.solved}")
}