package appli.acceuil;

import appli.StartApplication;
import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Entity.Liste;

import java.net.URL;
import java.util.ResourceBundle;

public class AcceuilController implements Initializable {

    @FXML
    private TableView<Liste> tableauListe;

    @FXML
    void ajouterListe(ActionEvent event) {

        StartApplication.changeScene("acceuil/AjoutListeView", "AjoutListe");


    }

    @FXML
    void deconnexion(ActionEvent event) {

    }

    @FXML
    void lesTypes(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String[][] colonnes = {
                {"Id liste","id_liste"},
                {"Nom","nom"}
        };

        for (int i = 0; i < colonnes.length ; i++) {
            //Création de la colonnes avec le titre
            TableColumn<Liste,String> maColonne = new TableColumn<>(colonnes[i][0]);
            //Ligne permettant la liaison automatique de la cellule avec la propiété donné
            maColonne.setCellValueFactory(new PropertyValueFactory<Liste,String>(colonnes[i][1]));
            //Ajout de la colonnes dans notre tableau
            tableauListe.getColumns().add(maColonne);

        }

    }
}
