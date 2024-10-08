package model.repository;

import appli.database.Database;
import javafx.scene.control.Label;
import model.Entity.Utilisateur;

import java.sql.*;

public class UtilisateurRepository {

    public void inscription(String nom, String prenom, String email, String mot_de_passe, Label label) throws SQLException {

        if (this.verifEmail(email) != null){

            label.setText("L'email est deja existant");
        }else {

            try {
                Connection maConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolistjx", "root", "");
                PreparedStatement requetePrepareInsert = maConnection.prepareStatement(" INSERT INTO utilisateur (nom,prenom,email,mot_de_passe) VALUES (?,?,?,?)");

                requetePrepareInsert.setString(1, nom);
                requetePrepareInsert.setString(2, prenom);
                requetePrepareInsert.setString(3, email);
                requetePrepareInsert.setString(4, mot_de_passe);


                requetePrepareInsert.executeUpdate();


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Utilisateur verifEmail(String email) throws SQLException {

        Database database = new Database();

        Connection maConnexion = database.getConnexion();

        String sql = "SELECT * FROM Utilisateur WHERE email = ? ";

        try {

            PreparedStatement requetePrepare = maConnexion.prepareStatement(sql);

            requetePrepare.setString(1, email);

            ResultSet resultatrequette = requetePrepare.executeQuery();

            if (resultatrequette.next()) {

                int id = resultatrequette.getInt(1);
                String nom = resultatrequette.getString(2);
                String prenom = resultatrequette.getString(3);
                String emailresultat = resultatrequette.getString(4);
                String mot_de_passe = resultatrequette.getString(5);

                return new Utilisateur(id, nom, prenom, emailresultat, mot_de_passe);

            }

            maConnexion.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

        return null;
    }


    }