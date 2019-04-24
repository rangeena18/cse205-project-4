//**************************************************************************************************************
// CLASS: NegOperator (NegOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */

public class NegOperator extends UnaryOperator {

    public NegOperator() {
    }

    /**
     * Negates the sign on the operand
     */
    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    int precedence() {
        return 4;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    int stackPrecedence() {
        return 4;
    }
}