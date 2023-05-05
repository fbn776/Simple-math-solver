/*
* A very rough infix notation solver. It doesnt respect the order of precedence. It solves from left to right. (Why?, because solving a infix respecting its operator presidency wasn't the aim.);
 */
class SolveInfix(infixNot: MutableList<String>) {
    //Create a copy of infixNot
    var solved = infixNot.toMutableList()
    init {
        var i = 0
        while(i < solved.size) {
            val s = solved[i]
            //Check if the current item in the list is an operator;
            if(s in "+-÷×") {
                //If its a operator, get the operands present at index before and after of the operator, as its a binary operator
                val oprnd1 = solved[i-1].toFloat()
                val oprnd2 = solved[i+1].toFloat()
                // Calculate the value based on the operator;
                val result: Float = when(s) {
                    "+" -> oprnd1 + oprnd2
                    "-" -> oprnd1 - oprnd2
                    "*" -> oprnd1 * oprnd2
                    "÷" -> oprnd1/oprnd2
                    else -> 0.0F
                }
                //Now remove the 2 operand and operator and replace it with the evaluated answer.
                solved.removeAt(i-1)
                solved.removeAt(i)
                solved.set(i-1, result.toString())
                //Go back 1 position;
                i--
            }
            i++
        }
    }
}