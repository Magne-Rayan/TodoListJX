package appli.acceuil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.repository.UtilisateurRepository;

import java.sql.SQLException;

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
    private Label label;

    @FXML
    void inscription(ActionEvent event) throws SQLException {

        UtilisateurRepository user = new UtilisateurRepository();


            user.inscription(nomField.getText(),prenomField.getText(),emailField.getText(),passwordField.getText(), label);


    }
    @FXML
    void retour(ActionEvent event) {

        StartApplication.changeScene("acceuil/LoginView", "Login");

    }

}

