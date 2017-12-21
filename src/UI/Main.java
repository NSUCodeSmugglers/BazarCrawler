package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent homeXML = FXMLLoader.load(getClass().getResource("HomeScene.fxml"));
        Scene homeScene = new Scene(homeXML, 1080, 720);
        primaryStage.setTitle("BazarCrawler");
        primaryStage.setScene(homeScene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("UI\\icon.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
