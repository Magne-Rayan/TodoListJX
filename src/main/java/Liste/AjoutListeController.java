package Liste;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.repository.ListeRepository;

public class AjoutListeController {

    @FXML
    private TextField nomField;

    @FXML
    void ajouterListe(ActionEvent event) {

        ListeRepository liste = new ListeRepository();

        liste.ajouterListe(nomField.getText());
    }
    @FXML
    void retour(ActionEvent event) {

        StartApplication.changeScene("acceuil/AcceuilView", "Acceuil");


    }

}
