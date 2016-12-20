//Author: Iziren Okhamafe

package PasswordGenerator;

//Import JavaFX libraries

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;


public class IzirenPasswordGeneratorGUI extends Application {
        Scene myScene;
        FlowPane pane;
        Button genPassButton;
        Button clear;
        Label lblEnterNumChars = new Label("Number of Characters for Password:");
        TextField numCharsInPassword = new TextField("");
        TextField generatedPasswd = new TextField("");
        String randomCharacters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ~!@#$%^&*()_+/0123456789";
        int numCharsPwd;
        
    @Override
    public void start(Stage primaryStage) {
        
            primaryStage.setTitle("Iziren's Password Generator");

            pane = new FlowPane();
            pane.setHgap(5);
            pane.setVgap(5);
            myScene = new Scene(pane, 350, 100);
            
            clear = new Button("Clear");
            clear.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle (ActionEvent event) {
                    numCharsInPassword.setText("");
                    generatedPasswd.setText("");
                }
            });
            genPassButton = new Button("Generate Password");
            genPassButton.setOnAction(new EventHandler<ActionEvent> () {
                @Override
                public void handle (ActionEvent event) {
                    numCharsPwd = Integer.parseInt(numCharsInPassword.getText());
                    char[] generatedPwd = new char[numCharsPwd];
                    for (int i = 0; i < numCharsPwd; i++) {
                           generatedPwd[i] = randomCharacters.charAt((int)(Math.random() * randomCharacters.length()));
                     }
                    String passString = String.valueOf(generatedPwd);
                    generatedPasswd.setText(passString);
                }
            });
            pane.getChildren().addAll(lblEnterNumChars, numCharsInPassword, new Label("Password Generated:"), generatedPasswd, genPassButton, clear);
            primaryStage.setScene(myScene);
            primaryStage.show();
        
            
        
    }

     /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
 public static void main(String[] args) { 
    launch(args);
 }
 
 
   
}

 
