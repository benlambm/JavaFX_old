package edu.vwcc.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * A JavaFX App - VWCC f2024
 */
public class App extends Application {


	@Override 	
    public void start(Stage stage) throws IOException {      
        Parent root =FXMLLoader.load(getClass().getResource("GUI.fxml"));
    	  Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Your JavaFX Application Name");
        stage.show();
    }


    public static void main(String[] args) {
        Application.launch();
    }
}
