package com.example.pumpkinnew.controller;

import com.example.pumpkinnew.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {

    public Button transferButton;
    public TextField textFieldTarget;

    private Model model = new Model();

    public TextField textField;

    public Model getModel() {
        return model;
    }

    public void initialize() {
        textFieldTarget.textProperty().bind(model.userTextProperty());
    }

    @FXML
    protected void transferButtonAction() {
       if(!textFieldTarget.getText().isEmpty()) {
           model.setUserText(textField.getText());
       }

    }

}