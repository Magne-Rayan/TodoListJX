package appli.acceuil;

import appli.StartApplication;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import model.Entity.Liste;
import model.repository.ListeRepository;
import java.net.URL;
import java.util.ResourceBundle;
import appli.liste.EditerController;

public class AcceuilController implements Initializable {

    @FXML
    private TableView<Liste> tableauListe;

    @FXML
    void ajouterListe(ActionEvent event) {

        StartApplication.changeScene("liste/AjoutListeView", "AjoutListe");

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
                {"Id appli.liste","id_liste"},
                {"Nom","nom"}
        };

        ListeRepository listeRepository = new ListeRepository();



        for (int i = 0; i < colonnes.length ; i++) {
            //Création de la colonnes avec le titre
            TableColumn<Liste, String> maColonne = new TableColumn<>(colonnes[i][0]);
            maColonne.setCellValueFactory(new PropertyValueFactory<Liste, String>(colonnes[i][1]));
            tableauListe.getColumns().add(maColonne);

        }
        ListeRepository listes = new ListeRepository();
        ObservableList<Liste> list =listes.recupererListe();

        for (int i = 0 ; i < list.size(); i++) {
            tableauListe.getItems().add(list.get(i));

        }

    }

    @FXML
    void onListeSelection(MouseEvent event) {

        if (event.getButton() == MouseButton.PRIMARY) {
            if (event.getClickCount() == 2) {
                TablePosition cell = tableauListe.getSelectionModel().getSelectedCells().get(0);
                int indexLigne = cell.getRow();
                TableColumn colonne = cell.getTableColumn();
                int id = tableauListe.getItems().get(indexLigne).getId_liste();
                System.out.println(id);

                StartApplication.changeScene2("liste/EditerListeView",new EditerController(id));
            }
        }
    }
}


