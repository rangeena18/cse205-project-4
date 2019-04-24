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

    public Operand(double value) {
        setValue(value);
    }

    public double getValue() {
        return mValue;
    }

    public void setValue(double value) {
        mValue = value;
    }
}
