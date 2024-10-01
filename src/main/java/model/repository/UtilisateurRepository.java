package model.repository;

import java.sql.*;

public class UtilisateurRepository {

    public void inscription ( String id_utilisateur  ){

        String nom;
        String prenom;
        String email;
        String mot_de_passe;

        try {
            Connection maConnection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist", "root", "");
            PreparedStatement requetePrepareInsert = maConnection.prepareStatement(" INSERT INTO utilisateur (nom,prenom,email,mot_de_passe) VALUES (?,?,?,?)");

            requetePrepareInsert.setString(1,);
            requetePrepareInsert.setString(2,);
            requetePrepareInsert.setString(3,);
            requetePrepareInsert.setInt(4,);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
