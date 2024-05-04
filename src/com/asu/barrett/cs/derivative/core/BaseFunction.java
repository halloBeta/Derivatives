package com.asu.barrett.cs.derivative.core;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class BaseFunction {
    protected double powerValue(String simplePower, double valueAt) {
        String[] parts = simplePower.split("x\\^");
        double coefficient = Double.parseDouble(parts[0]);
        double exponent = Double.parseDouble(parts[1]);
        double functionValue =  coefficient * Math.pow(valueAt, exponent);
        return functionValue;
    }

    protected double exponentialValue(String simpleExponential, double valueAt) {
        String[] parts = simpleExponential.split("e\\^");
        double coefficient = Double.parseDouble(parts[0]);
        double functionValue = coefficient * Math.exp(valueAt);
        return functionValue;
    }

    protected double naturalLogarithmicValue(String simpleLogarithmic, double valueAt) {
        if (valueAt <= 0) {
            System.out.println("The value of the natural log function is undefined for value " + valueAt);
            return 0;
        }

        if (simpleLogarithmic.equals("ln(x)")) {
            return Math.log(valueAt);
        }
        String[] parts = simpleLogarithmic.split("ln\\(");
        double coefficient = Double.parseDouble(parts[0]);
        double naturalLogarithmicValue = coefficient * Math.log(valueAt);
        return naturalLogarithmicValue;
    }

    protected double logarithmicValue(String simpleLogarithmic, double valueAt) {
        if (valueAt <= 0) {
            System.out.println("The derivative of the logarithmic function is undefined value = " + valueAt);
            return 0;
        }

        String[] parts = simpleLogarithmic.split("log");
        double coefficient = Double.parseDouble(parts[0]);
        int logBase = Integer.parseInt(parts[1]);
        double logarithmicValue = coefficient * Math.log(valueAt) / Math.log(logBase);
        return logarithmicValue;
    }

    protected double trigonometricFunctionValue(String simpleTrigonometric, double valueAt) {
        if (simpleTrigonometric.contains("sin(x)")) {
            if (simpleTrigonometric.equals("sin(x)")) {
                return Math.sin(valueAt);
            }
            String[] parts = simpleTrigonometric.split("sin\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double trigonometricFunctionValue = coefficient * Math.sin(valueAt);
            return trigonometricFunctionValue;
        }
        if (simpleTrigonometric.contains("cos(x)")) {
            if (simpleTrigonometric.equals("cos(x)")) {
                return Math.cos(valueAt);
            }
            String[] parts = simpleTrigonometric.split("cos\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double trigonometricFunctionValue = coefficient * Math.cos(valueAt);
            return trigonometricFunctionValue;
        }
        if (simpleTrigonometric.contains("tan(x)")) {
            if (simpleTrigonometric.equals("tan(x)")) {
                return Math.tan(valueAt);
            }
            String[] parts = simpleTrigonometric.split("tan\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double trigonometricFunctionValue = coefficient * Math.tan(valueAt);
            return trigonometricFunctionValue;
        }
        if (simpleTrigonometric.contains("csc(x)")) {
            if (simpleTrigonometric.equals("csc(x)")) {
                return 1 / Math.sin(valueAt);
            }
            String[] parts = simpleTrigonometric.split("csc\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double trigonometricFunctionValue = coefficient / Math.sin(valueAt);
            return trigonometricFunctionValue;
        }
        if (simpleTrigonometric.contains("sec(x)")) {
            if (simpleTrigonometric.equals("sec(x)")) {
                return 1 / Math.cos(valueAt);
            }
            String[] parts = simpleTrigonometric.split("sec\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double trigonometricFunctionValue = coefficient / Math.cos(valueAt);
            return trigonometricFunctionValue;
        }
        if (simpleTrigonometric.contains("cot(x)")) {
            if (simpleTrigonometric.equals("cot(x)")) {
                return 1 / Math.tan(valueAt);
            }
            String[] parts = simpleTrigonometric.split("cot\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double trigonometricFunctionValue = coefficient / Math.tan(valueAt);
            return trigonometricFunctionValue;
        }
        return 0;
    }
}
