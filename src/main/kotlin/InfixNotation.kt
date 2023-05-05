
class InfixNotation(var ls: Queue<Char>) {
    val result = mutableListOf<String>("")
    //For checking if there's decimal error. That there's two or more decimal point in a number.
    var hasDecimalError = false
    var hasOperatorError = false
    var hasInvalidCharError = false

    init {
        while(!ls.isEmpty()) {
            //Get the first element of the queue
            val i = ls.pop()

            //If the current character is number or decimal point, add it to the last element of `result`;
            if (i in "0123456789" || i == '.') {
                if(i == '.' && result.lastElm().last() == '.') {
                    hasDecimalError = true
                    break
                }

                //Concat the last string element of result with `i`;
                result.set(result.size - 1, result.lastElm() + i.toString())

            }else if(i in "+-÷×") {
                //If its an operator, then add it to the result as a new string item;
                result.add(i.toString())
                //Then add a new empty string for the next queue elements;
                result.add("")
            }else {
                //Invalid character error;
                hasInvalidCharError = true
                break
            }
        }

        //If there's an empty string in the result, then it means operator error;
        if("" in result) {
            hasOperatorError = true
        }
    }
}