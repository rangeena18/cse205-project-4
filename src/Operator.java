//**************************************************************************************************************
// CLASS: Operator (Operator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {

    public Operator() {
    }

    /**
     * Abstract method to be implemented in order to verify if the operator is binary or unary
     */
    abstract boolean isBinaryOperator();

    /**
     * Returns the normal precedence level of this operator.
     */
    abstract int precedence();

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    abstract int stackPrecedence();
}
