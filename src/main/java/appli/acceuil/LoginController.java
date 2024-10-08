package appli.acceuil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.repository.UtilisateurRepository;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {

        @FXML
        private TextField emailField;

        @FXML
        private PasswordField passwordField;

        @FXML
        private Label compteverif;



        @FXML
        void connexion(ActionEvent event) throws SQLException {

                UtilisateurRepository user = new UtilisateurRepository();

                user.connexion(emailField.getText(),passwordField.getText(), compteverif);


        }

        @FXML
        void inscription(ActionEvent event) {

                StartApplication.changeScene("acceuil/InscriptionView", "Inscription");

        }

        @FXML
        void motDePasseOublie(ActionEvent event) {

        }

    }

