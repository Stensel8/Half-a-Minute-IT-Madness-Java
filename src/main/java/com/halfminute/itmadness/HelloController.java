package com.halfminute.itmadness;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    public void initialize() {
        welcomeText.setText("Welcome to JavaFX!");
    }

    @FXML
    private void onHelloButtonClick() {
        welcomeText.setText("Hello Button Clicked!");
    }
}
