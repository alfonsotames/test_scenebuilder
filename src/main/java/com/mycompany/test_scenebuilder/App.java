package com.mycompany.test_scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        scene = new Scene(fxmlLoader.load(), 640, 480);
        scene.getStylesheets().add(this.getClass().getResource("styles.css").toExternalForm());
        PrimaryController pc = fxmlLoader.getController();
        Market market = new Market(pc);
        System.out.println("Starting Market...");
        market.start();
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        
        System.out.println("Hola FXMLLoader ! "+fxml + ".fxml");
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        System.out.println("Yo vengo antes del Launch");
        

        launch();
        
    }

}