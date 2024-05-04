package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class ProductRuleDerivative extends SimpleDerivative {
    private SimpleFunction simpleFunctionValue = new SimpleFunction();
    public double derivative(String[] functions, double derivativeAt) {
        double derivative = 0;
        String f = functions[0];
        String g = functions[1];

        derivative = super.derivative(f, derivativeAt) * simpleFunctionValue.functionValue(g, derivativeAt) +
            simpleFunctionValue.functionValue(f, derivativeAt) * super.derivative(g, derivativeAt);

        return derivative;
    }
}
