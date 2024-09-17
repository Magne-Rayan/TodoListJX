package appli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {

    private Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("acceuil/LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        this.mainStage.setTitle("Hello!");
        this.mainStage.setScene(scene);
        this.mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public static void changeScene(String LoginViewFxml) throws IOException {



    }
}