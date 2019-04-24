//**************************************************************************************************************
// CLASS: SubOperator (SubOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * Represents the subtraction operator which is a specific type of binary operator.
 */
public class SubOperator extends BinaryOperator {
    /**
     * Returns the difference of the left-hand side operand and the right-hand side operand.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() - pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    int precedence() {
        return 2;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    int stackPrecedence() {
        return 2;
    }
}