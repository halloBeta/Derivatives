package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class ChainRuleDerivative extends SimpleDerivative {
    private SimpleFunction simpleFunctionValue = new SimpleFunction();
    public double derivative(String[] functions, double derivativeAt) {
        double derivative = 0;
        String firstFunction = functions[0];
        String secondFunction = functions[1];

        derivative = super.derivative(firstFunction, simpleFunctionValue.functionValue(secondFunction, derivativeAt)) *
            super.derivative(secondFunction, derivativeAt);

        return derivative;
    }
}
