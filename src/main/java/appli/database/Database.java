package appli.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    String serveur = "localhost/3306";
    String nomDeLaBase = "TodoListJX";
    String utilisateur = "root";
    String MotDePasse = "";
    private String Url = "jdbc:mysql://localhost:3306/" + nomDeLaBase ;

    private String getUrl() {
        return Url;
    }
    public Connection getConnexion (){

    try {

        Connection cnx = DriverManager.getConnection(this.getUrl(),this.utilisateur,this.MotDePasse);
        System.out.println("Etat de la connexion :");
        System.out.println(cnx.isClosed() ? "femrée" : "ouverte\r\n");
        return cnx;

    }catch (SQLException e ){
            System.out.println("erreur lors de la tentative de connexion à la base de données");
            e.printStackTrace();
            return null;
}
    }
}
