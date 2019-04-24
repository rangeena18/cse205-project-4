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