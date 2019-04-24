//**************************************************************************************************************
// CLASS: MultOperator (MultOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * Represents the multiplication operator which is a specific type of binary operator.
 */
public class MultOperator extends BinaryOperator {

    /**
     * Returns the product of the left operand and the right operand
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() * pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    int precedence() {
        return 3;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    int stackPrecedence() {
        return 3;
    }
}