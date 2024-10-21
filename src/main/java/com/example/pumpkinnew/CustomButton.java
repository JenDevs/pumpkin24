package com.example.pumpkinnew;

import javafx.scene.control.Button;

import java.awt.*;

// Här
public class CustomButton extends Button {

    public void fire() {
        super.fire();
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Button fired");
    }
}
