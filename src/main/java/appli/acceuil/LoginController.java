package appli.acceuil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

        }

        @FXML
        void motDePasseOublie(ActionEvent event) {

        }

    }

