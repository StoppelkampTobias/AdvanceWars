package org.apps.advancewars;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.ResourceBundle;

public class OutputViewController implements Initializable {

    @FXML
    private Label inputLabel;
    private Model model;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = Model.getInstance();
        String input = model.getInput();
        inputLabel.setText(input);
    }
}
