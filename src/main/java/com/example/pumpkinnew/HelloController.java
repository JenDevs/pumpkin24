package com.example.pumpkinnew;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {

    public Button transferButton;
    public TextField textFieldTarget;
    public Label textLabel;
    Model model = new Model();

    public TextField textField;


    @FXML
    protected void transferButtonAction() {
        model.setUserText(textField.getText());

        textFieldTarget.setText(model.getUserText());
        textLabel.setText(model.getUserText());
    }

    public void textFieldChanged(KeyEvent inputMethodEvent) {
        transferButton.setDisable(textField.getText().isEmpty());
    }
}