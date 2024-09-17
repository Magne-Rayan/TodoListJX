package appli.acceuil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InscriptionController  {

    @FXML
    private TextField confirmationField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nomField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField prenomField;

    @FXML
    void inscription(ActionEvent event) {

        System.out.println(emailField.getText());
        System.out.println(passwordField.getText());
        System.out.println(passwordField.getText());
        System.out.println(passwordField.getText());

    }

}

