package model.repository;

import appli.StartApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListeRepository {

    public void ajouterListe(String nom){

        try {
            Connection maConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolistjx", "root", "");
            PreparedStatement requetePrepareInsert = maConnection.prepareStatement(" INSERT INTO liste (nom) VALUES (?)");

            requetePrepareInsert.setString(1, nom);


            requetePrepareInsert.executeUpdate();

            StartApplication.changeScene("acceuil/AcceuilView", "Acceuil");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void recupererListe(){



    }

}
