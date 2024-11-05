package Liste;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.repository.ListeRepository;

import java.sql.SQLException;

public class EditerController {

        public EditerController(int id) {

                EditerController.id = id;
        }

        private static int id;

        @FXML
        private TextField nomField;

        @FXML
        void ajouterListe(ActionEvent event) throws SQLException {

                ListeRepository liste = new ListeRepository();

                liste.editerListe(this.nomField.getText(), EditerController.id);
        }

        @FXML
        void retour(ActionEvent event) {

        }


}
