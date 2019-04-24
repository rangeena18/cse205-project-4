//**************************************************************************************************************
// CLASS: UnaryOperator (UnaryOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * UnaryOperator is the superclass of all unary operators.
 */
public abstract class UnaryOperator extends Operator {

    public UnaryOperator() {
    }
    
    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pOperand);

    /**
     * Returns false since all subclasses of UnaryOperator are unary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}
