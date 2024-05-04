package com.asu.barrett.cs.derivative.io;

import com.asu.barrett.cs.derivative.core.ChainRuleDerivative;
import com.asu.barrett.cs.derivative.core.MultiTermFunctionDerivative;
import com.asu.barrett.cs.derivative.core.ProductRuleDerivative;
import com.asu.barrett.cs.derivative.core.QuotientRuleDerivative;
import com.asu.barrett.cs.derivative.core.SimpleDerivative;
import com.asu.barrett.cs.derivative.core.SumRuleDerivative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/***
 * StudentName: Divyesh Kotthakota
 * Course: CSE 205
 */
public class UserInterface {
    public void userInteraction() throws IOException {
        int loop = 0;
        while(loop < 10) {
            System.out.println("Welcome to Derivative Calculator");
            System.out.println("Select derivative type");
            System.out.println("1. Simple Derivative");
            System.out.println("2. Multi Term Function Derivative");
            System.out.println("3. Compound Derivative");
            System.out.println("4. Exit");
            int option = Integer.parseInt(readInputFromConsole());
            switch (option) {
                case 1:
                    simpleDerivativeDialog();
                    break;
                case 2:
                    multiTermFunctionDerivativeDialog();
                    break;
                case 3:
                    compoundDerivativeDialog();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
            loop++;
            continue;
        }
    }
    private void simpleDerivativeDialog() throws IOException {
        SimpleDerivative simpleDerivative = new SimpleDerivative();
        System.out.println("Enter the number to select a function");
        System.out.println("1. power");
        System.out.println("2. exponential");
        System.out.println("3. natural logarithmic");
        System.out.println("4. logarithmic with a base value other than e");
        System.out.println("5. trigonometric");
        int option = Integer.parseInt(readInputFromConsole());
        switch (option) {
            case 1:
                powerDerivativeDialog(simpleDerivative);
                break;
            case 2:
                exponentialDerivativeDialog(simpleDerivative);
                break;
            case 3:
                naturalLogarithmicDerivativeDialog(simpleDerivative);
                break;
            case 4:
                logarithmicDerivativeDialog(simpleDerivative);
                break;
            case 5:
                trigonometricDerivativeDialog(simpleDerivative);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
    private void multiTermFunctionDerivativeDialog() throws IOException {
        System.out.println("Enter the multi term function");
        System.out.println("Example(s): 2x^3 + 6e^x + 3ln(x)   or   2x^4 + 3x^3 + 4x^2 + 5x + 6");
        String function = readInputFromConsole();
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());
        MultiTermFunctionDerivative multiTermFunctionDerivative = new MultiTermFunctionDerivative();
        System.out.println(multiTermFunctionDerivative.derivative(function, derivativeAt));
    }
    private void compoundDerivativeDialog() throws IOException {
        System.out.println("Enter the first function");
        System.out.println("Example: 2x^3");
        String firstFunction = readInputFromConsole();
        System.out.println("Enter the second function");
        System.out.println("Example: 6e^x");
        String secondFunction = readInputFromConsole();
        System.out.println("Enter the derivative rule");
        System.out.println("1. SUM");
        System.out.println("2. PRODUCT");
        System.out.println("3. QUOTIENT");
        System.out.println("4. CHAIN");
        int rule = Integer.parseInt(readInputFromConsole());
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());

        SumRuleDerivative sumRuleDerivative = new SumRuleDerivative();
        ProductRuleDerivative productRuleDerivative = new ProductRuleDerivative();
        QuotientRuleDerivative quotientRuleDerivative = new QuotientRuleDerivative();
        ChainRuleDerivative chainRuleDerivative = new ChainRuleDerivative();

        if (rule == 1) {
            System.out.println(sumRuleDerivative.derivative(new String[]{firstFunction, secondFunction}, derivativeAt));
            return;
        } else if (rule == 2) {
            System.out.println(productRuleDerivative.derivative(new String[]{firstFunction, secondFunction}, derivativeAt));
            return;
        } else if (rule == 3) {
            System.out.println(quotientRuleDerivative.derivative(new String[]{firstFunction, secondFunction}, derivativeAt));
            return;
        } else if (rule == 4) {
            System.out.println(chainRuleDerivative.derivative(new String[]{firstFunction, secondFunction}, derivativeAt));
            return;
        }
    }

    private void powerDerivativeDialog(SimpleDerivative simpleDerivative) throws IOException {
        System.out.println("Enter the power function");
        System.out.println("Example: 2x^3");
        String function = readInputFromConsole();
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());
        System.out.println(simpleDerivative.derivative(function, derivativeAt));
    }
    private void exponentialDerivativeDialog(SimpleDerivative simpleDerivative) throws IOException {
        System.out.println("Enter the exponential function");
        System.out.println("Example: 6e^x");
        String function = readInputFromConsole();
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());
        System.out.println(simpleDerivative.derivative(function, derivativeAt));
    }
    private void naturalLogarithmicDerivativeDialog(SimpleDerivative simpleDerivative) throws IOException {
        System.out.println("Enter the natural logarithmic function");
        System.out.println("Example: 3ln(x)");
        String function = readInputFromConsole();
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());
        System.out.println(simpleDerivative.derivative(function, derivativeAt));
    }
    private void logarithmicDerivativeDialog(SimpleDerivative simpleDerivative) throws IOException {
        System.out.println("Enter the logarithmic function");
        System.out.println("Example: 4log2(x)");
        String function = readInputFromConsole();
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());
        System.out.println(simpleDerivative.derivative(function, derivativeAt));
    }
    private void trigonometricDerivativeDialog(SimpleDerivative simpleDerivative) throws IOException {
        System.out.println("Enter the trigonometric function");
        System.out.println("Example: 5sin(x)");
        String function = readInputFromConsole();
        System.out.println("Enter the value at which the derivative to be calculated");
        double derivativeAt = Double.parseDouble(readInputFromConsole());
        System.out.println(simpleDerivative.derivative(function, derivativeAt));
    }
    private String readInputFromConsole() throws IOException {
        // Create an InputStream object to read from the console.
        InputStream input = System.in;
        // Create an InputStreamReader object to convert the InputStream to a character stream.
        InputStreamReader reader = new InputStreamReader(input);
        // Create a BufferedReader object to read lines of text from the character-input stream.
        BufferedReader buffer = new BufferedReader(reader);
        String inputString = buffer.readLine();
        return inputString;
    }
}
