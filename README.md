## Simple Math Solver
This is a simple maths solver that doest follow any operator presidence. This just does the calculations from left to right.
This supports:
* Addition
* Subraction
* Multiplication
* Division

This doesn't support:
* Brackets
* Exponents
* Modulus
* Unary operator
* Or any other operators

This was made for my first android application. A simple calculator. The source code for this calculator can be found [here](https://github.com/fbn776/Simple-Calculator).

This solver also has some issues with negative numbers. This issue come from the fact that, the program assumes a binary operator such as `+, -, *, /` should have two operands before and after the operator. But a negative number has a `-` before that number. In this context, the `-` is a unary operator, but the code doesn't support unary operators. So it's an error, `hasOperatorError` to be exact. 

Should I fix this?<br>
-Probably, yes. But i'm lazy i guess.
