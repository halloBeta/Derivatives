package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class SimpleDerivative extends BaseDerivative {
    // find derivative of a given simple function at a given value
    public double derivative(String function, double derivativeAt) {
        if (function.contains("x^")) {
            return powerDerivative(function, derivativeAt);
        } else if (function.contains("e^")) {
            return exponentialDerivative(function, derivativeAt);
        } else if (function.contains("^")) {
            return simpleExponentialDerivative(function, derivativeAt);
        } else if (function.contains("ln(")) {
            return naturalLogarithmicDerivative(function, derivativeAt);
        } else if (function.contains("log")) {
            return logarithmicDerivative(function, derivativeAt);
        } else if (function.contains("sin(") || function.contains("cos(") || function.contains("tan(") ||
            function.contains("cot(") || function.contains("sec(") || function.contains("csc(")) {
            return trigonometricDerivative(function, derivativeAt);
        } else {
            System.out.println("The derivative of the function is undefined.");
            return 0;
        }
    }
}
