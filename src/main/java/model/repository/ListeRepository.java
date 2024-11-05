package model.repository;

import appli.StartApplication;
import appli.database.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Entity.Liste;
import java.sql.*;

public class ListeRepository {

    public void ajouterListe(String nom){

        try {

            Database database = new Database();

            PreparedStatement requetePrepareInsert = database.getConnexion().prepareStatement(" INSERT INTO liste (nom) VALUES (?)");

            requetePrepareInsert.setString(1, nom);


            requetePrepareInsert.executeUpdate();

            StartApplication.changeScene("acceuil/AcceuilView", "Acceuil");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public ObservableList<Liste> recupererListe() {

        Database database = new Database();
        Connection connection = database.getConnexion();
        String sql = "SELECT * FROM liste";

        ObservableList<Liste> liste = FXCollections.observableArrayList();

        try {
            PreparedStatement requetePrepare = connection.prepareStatement(sql);
            ResultSet resultatRequette = requetePrepare.executeQuery();
            while (resultatRequette.next()) {
                liste.add(new Liste(resultatRequette.getInt("id_liste"), resultatRequette.getString("nom")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return liste;
    }

    public void editerListe(String nom, int id) throws SQLException {

        Database database = new Database();

        PreparedStatement requetePrepareUpdate = database.getConnexion().prepareStatement(" UPDATE liste SET nom = ? WHERE id_liste = ?");

        requetePrepareUpdate.setString(1,nom);

        requetePrepareUpdate.setInt(2,id);

        requetePrepareUpdate.executeUpdate();

        StartApplication.changeScene("acceuil/AcceuilView","Acceuil");
    }


}
