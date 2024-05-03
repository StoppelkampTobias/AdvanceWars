package org1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    public void goToOutput(ActionEvent event) {
        //System.out.println(event.getSource() + " has been clicked!");
        String input = textField.getText();
        System.out.println(input);

        Parent root = FXMLLoader.load(getClass().getResource("AdvanceWars2.fxml"));
        Scene scene = new Scene(root);
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}
