package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class QuotientRuleDerivative extends SimpleDerivative {
    private SimpleFunction simpleFunctionValue = new SimpleFunction();
    public double derivative(String[] functions, double derivativeAt) {
        double derivative = 0;
        String firstFunction = functions[0];
        String secondFunction = functions[1];

        derivative = (super.derivative(firstFunction, derivativeAt) * simpleFunctionValue.functionValue(secondFunction, derivativeAt) -
            simpleFunctionValue.functionValue(firstFunction, derivativeAt) * super.derivative(secondFunction, derivativeAt)) /
            (simpleFunctionValue.functionValue(secondFunction, derivativeAt) * simpleFunctionValue.functionValue(secondFunction, derivativeAt));
        return derivative;
    }
}
