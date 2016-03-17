/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author mhcrnl
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        PasswordField pwBox = new PasswordField();
        TextField userTF = new TextField();
        /**
         * Adaugarea unui camp pt afisarea unui mesaj
         */
        final Text actiontarget = new Text();
        
        /**
         * Adaugarea unui buton care are ca actiune afisarea
         * in terminal  a mesajului din btn.setOnAction().
         */
        Button btn = new Button();
        btn.setText("Sign in");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Salut, " + userTF+ " parola ta este: " +
                        pwBox.toString()+" !");
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Butonul a fost apasat!");
            }
        });
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        grid.add(hbBtn, 1, 4);
        grid.add(actiontarget, 1, 6);
        actiontarget.setId("actiontarget");
        /**
         * Adaugarea unui text
         */
        Text scenetitle = new Text("'Aplicatie JavaFX!'");
        //scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);
        /**
         * Adaugarea unei etichete
         */
        Label userName = new Label("Numele utilizatorului: ");
        grid.add(userName, 0,1);
        /**
         * Adaugarea unui camp de introducere a datelor
         */
        //TextField userTF = new TextField();
        grid.add(userTF, 1, 1);
        /**
         * Adaugarea unei noi etichete pw
         */
        Label pw = new Label("Parola: ");
        grid.add(pw, 0, 2);
        /**
         * Adaugarea unui camp de introducere a parolei
         */
        //PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        //StackPane root = new StackPane();
        
        
        Scene scene = new Scene(grid, 400, 350);
        
        primaryStage.setTitle("Prima aplicatie JavaFX!");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(JavaFXApplication1.class.getResource("Login.css").
                toExternalForm());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
