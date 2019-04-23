//**************************************************************************************************************
// CLASS: NegOperator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */

public class NegOperator extends UnaryOperator {
    public NegOperator() {
    }

    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }

    @Override
    int precedence() {
        return 4;
    }

    @Override
    int stackPrecedence() {
        return 4;
    }
}