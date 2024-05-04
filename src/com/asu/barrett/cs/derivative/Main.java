package com.asu.barrett.cs.derivative;

import com.asu.barrett.cs.derivative.io.UserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        try {
            userInterface.userInteraction();
        } catch (Exception e) {
            System.out.println("Error interacting with user on computing derivatives");
        }
    }
}
