package de.fh_zwickau.oose.zuul05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 555, 471);
        stage.setTitle("Keep Breathing!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static FXMLLoader getLoader(String name) {
        return new FXMLLoader(MainApplication.class.getResource(name));
    }
}