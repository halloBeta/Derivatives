package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class SimpleFunction extends BaseFunction {
    public double functionValue(String function, double valueAt) {
        if (function.contains("x^")) {
            return this.powerValue(function, valueAt);
        }
        if (function.contains("e^")) {
            return this.exponentialValue(function, valueAt);
        }
        if (function.contains("ln")) {
            return this.naturalLogarithmicValue(function, valueAt);
        }
        if (function.contains("log")) {
            return this.logarithmicValue(function, valueAt);
        }
        if (function.contains("sin")) {
            return this.trigonometricFunctionValue(function, valueAt);
        }
        if (function.contains("cos")) {
            return this.trigonometricFunctionValue(function, valueAt);
        }
        return 0;
    }
}
