package com.asu.barrett.cs.derivative.core;

// https://en.wikipedia.org/wiki/Derivative
/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
abstract public class BaseDerivative {
    abstract protected double derivative(String function, double derivativeAt);

    protected double powerDerivative(String simplePower, double derivativeAt) {
        String[] parts = simplePower.split("x\\^");
        double coefficient = Double.parseDouble(parts[0]);
        double exponent = Double.parseDouble(parts[1]);
        double derivativeOfPowerFunctionAtValue =  exponent * coefficient * Math.pow(derivativeAt, exponent - 1);
        return derivativeOfPowerFunctionAtValue;
    }

    protected double exponentialDerivative(String simpleExponential, double derivativeAt) {
        String[] parts = simpleExponential.split("e\\^");
        double coefficient = Double.parseDouble(parts[0]);
        double derivativeOfExponentialFunctionAtValue = coefficient * Math.exp(derivativeAt);
        return derivativeOfExponentialFunctionAtValue;
    }

    protected double simpleExponentialDerivative(String simpleExponential, double derivativeAt) {
        String[] parts = simpleExponential.split("\\^");
        double base = Double.parseDouble(parts[0]);
        double derivativeOfExponentialFunctionAtValue = Math.pow(base, derivativeAt);
        return derivativeOfExponentialFunctionAtValue;
    }

    protected double naturalLogarithmicDerivative(String simpleLogarithmic, double derivativeAt) {
        if (derivativeAt <= 0) {
            System.out.println("The derivative of the natural logarithmic function is undefined at value = " + derivativeAt);
            return 0;
        }

        if (simpleLogarithmic.equals("ln(x)")) {
            return 1 / derivativeAt;
        }
        String[] parts = simpleLogarithmic.split("ln\\(");
        double coefficient = Double.parseDouble(parts[0]);
        double derivativeOfLogarithmicFunctionAtValue = coefficient * (1 / derivativeAt);
        return derivativeOfLogarithmicFunctionAtValue;
    }

    protected double logarithmicDerivative(String simpleLogarithmic, double derivativeAt) {
        if (derivativeAt <= 0) {
            System.out.println("The derivative of the logarithmic function is undefined at value = " + derivativeAt);
            return 0;
        }

        if (simpleLogarithmic.equals("log(x)")) {
            return 1 / (derivativeAt * Math.log(10));
        }
        String[] parts = simpleLogarithmic.split("log");
        double coefficient = Double.parseDouble(parts[0]);
        String[] rest = parts[1].split("\\(");
        int base = Integer.parseInt(rest[0]);
        double derivativeOfLogarithmicFunctionAtValue = coefficient * (1 / (derivativeAt * Math.log(base)));
        return derivativeOfLogarithmicFunctionAtValue;
    }

    protected double trigonometricDerivative(String simpleTrigonometric, double derivativeAt) {
        if (simpleTrigonometric.contains("sin(x)")) {
            if (simpleTrigonometric.equals("sin(x)")) {
                return Math.cos(derivativeAt);
            }
            String[] parts = simpleTrigonometric.split("sin\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double derivativeOfTrigonometricFunctionAtValue = coefficient * Math.cos(derivativeAt);
            return derivativeOfTrigonometricFunctionAtValue;
        }
        if (simpleTrigonometric.contains("cos(x)")) {
            if (simpleTrigonometric.equals("cos(x)")) {
                return -Math.sin(derivativeAt);
            }
            String[] parts = simpleTrigonometric.split("cos\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double derivativeOfTrigonometricFunctionAtValue = coefficient * -Math.sin(derivativeAt);
            return derivativeOfTrigonometricFunctionAtValue;
        }
        if (simpleTrigonometric.contains("tan(x)")) {
            if (simpleTrigonometric.equals("tan(x)")) {
                return 1 / Math.pow(Math.cos(derivativeAt), 2);
            }
            String[] parts = simpleTrigonometric.split("tan\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double derivativeOfTrigonometricFunctionAtValue = coefficient * (1 / Math.pow(Math.cos(derivativeAt), 2));
            return derivativeOfTrigonometricFunctionAtValue;
        }
        if (simpleTrigonometric.contains("csc(x)")) {
            if (simpleTrigonometric.equals("csc(x)")) {
                return -1 * Math.cos(derivativeAt) / Math.pow(Math.sin(derivativeAt), 2);
            }
            String[] parts = simpleTrigonometric.split("csc\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double derivativeOfTrigonometricFunctionAtValue = coefficient * (-1 * Math.cos(derivativeAt) / Math.pow(Math.sin(derivativeAt), 2));
            return derivativeOfTrigonometricFunctionAtValue;
        }
        if (simpleTrigonometric.contains("sec(x)")) {
            if (simpleTrigonometric.equals("sec(x)")) {
                return Math.sin(derivativeAt) / Math.pow(Math.cos(derivativeAt), 2);
            }
            String[] parts = simpleTrigonometric.split("sec\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double derivativeOfTrigonometricFunctionAtValue = coefficient * (Math.sin(derivativeAt) / Math.pow(Math.cos(derivativeAt), 2));
            return derivativeOfTrigonometricFunctionAtValue;
        }
        if (simpleTrigonometric.contains("cot(x)")) {
            if (simpleTrigonometric.equals("cot(x)")) {
                return -1 / Math.pow(Math.sin(derivativeAt), 2);
            }
            String[] parts = simpleTrigonometric.split("cot\\(");
            double coefficient = Double.parseDouble(parts[0]);
            double derivativeOfTrigonometricFunctionAtValue = coefficient * (-1 / Math.pow(Math.sin(derivativeAt), 2));
            return derivativeOfTrigonometricFunctionAtValue;
        }
        return 0;
        // TODO - inverse trigonometric functions
    }
}

