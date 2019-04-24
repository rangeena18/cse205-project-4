//**************************************************************************************************************
// CLASS: Parenthesis (Parenthesis.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * Parenthesis is the superclass of LeftParen and RightParen. These are treated as a weird sort of Operator
 * because we need to be able to push LeftParens on the operator stack when evaluating the expression.
 */
public abstract class Parenthesis extends Operator {

    public Parenthesis() {
    }
    
    /**
     * Parenthesis are not really operators so return false.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}