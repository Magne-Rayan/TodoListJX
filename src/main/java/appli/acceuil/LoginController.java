package appli.acceuil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

        @FXML
        private TextField emailField;

        @FXML
        private PasswordField passwordField;


        @FXML
        void connexion(ActionEvent event) {

            System.out.println(emailField.getText());
            System.out.println(passwordField.getText());

        }

        @FXML
        void inscription(ActionEvent event) {

                StartApplication.changeScene("acceuil/InscriptionView", "Inscription");

        }

        @FXML
        void motDePasseOublie(ActionEvent event) {

        }

    }

