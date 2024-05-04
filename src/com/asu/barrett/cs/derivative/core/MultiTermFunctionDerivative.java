package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class MultiTermFunctionDerivative extends SimpleDerivative {
    public double derivative(String multiTermFunction, double derivativeAt) {
        double derivative = 0;
        String[] terms = multiTermFunction.split("\\+");
        for (String term : terms) {
            String termTrimmed = term.trim(); // remove leading and trailing whitespaces
            derivative += super.derivative(termTrimmed, derivativeAt);
        }
        return derivative;
    }
}
