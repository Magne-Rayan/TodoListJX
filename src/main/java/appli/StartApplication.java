package appli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {

    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {

        this.mainStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("acceuil/LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        this.mainStage.setTitle("Hello!");
        this.mainStage.setScene(scene);
        this.mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public static void changeScene( String fxml, String nomScene) {

        mainStage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource(fxml + ".fxml"));
        Scene scene = null;

        try {

            scene = new Scene(fxmlLoader.load());
            mainStage.setTitle(nomScene);
            mainStage.setScene(scene);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}