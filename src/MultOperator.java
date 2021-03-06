//**************************************************************************************************************
// CLASS: MultOperator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Represents the multiplication operator which is a specific type of binary operator.
 */
public class MultOperator extends BinaryOperator {
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
    }

    @Override
    int precedence() {
        return 3;
    }

    @Override
    int stackPrecedence() {
        return 3;
    }
}