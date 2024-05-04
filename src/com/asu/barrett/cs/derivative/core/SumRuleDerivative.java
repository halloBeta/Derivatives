package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class SumRuleDerivative extends SimpleDerivative {
    public double derivative(String[] functions, double derivativeAt) {
        double derivative = 0;
        String firstFunction = functions[0];
        String secondFunction = functions[1];
        derivative = super.derivative(firstFunction, derivativeAt) + super.derivative(secondFunction, derivativeAt);

        return derivative;
    }
}
