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

    abstract boolean isBinaryOperator();
    abstract int precedence();
    abstract int stackPrecedence();
}
