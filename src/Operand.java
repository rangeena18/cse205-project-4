//**************************************************************************************************************
// CLASS: Operand (Operand.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring B 2019
// PROJECT NUMBER: 4
//
// Author: Vincent Hoang, vnhoang, vnhoang@asu.edu
//**************************************************************************************************************

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
    private double mValue;

    /**
     * Operand(double)
     *
     * Constructor for operand objects. Passes through a number as a double to be stored by the operand
     *
     * @param value the numerical value of the operand
     */
    public Operand(double value) {
        setValue(value);
    }

    /**
     *  Accessor method for mValue
     */
    public double getValue() {
        return mValue;
    }

    /**
     *  Mutator method to set the value of mValue
     */
    public void setValue(double value) {
        mValue = value;
    }
}
