package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

/*     @SuppressWarnings("exports")
    @Override
    public void start(Stage stage)  {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("vboxscene.fxml"));
        Parent root=null;
        try {
            root = loader.load();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    } */

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        scene = new Scene(loadFXML("vboxscene"), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
 
    public static void main(String[] args)  {
        try {
            Database.getConnection();
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("not connected");
            e.printStackTrace();
        }
        launch();
    }

}