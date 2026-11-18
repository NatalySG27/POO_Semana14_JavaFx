/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author UCA40402
 */
public class EjemploFx extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //StackPane root = new StackPane();//crea contenedor de nodos tipo pila
        GridPane root = new GridPane();
        root.setHgap(10); // Espaciado horizontal entre columnas
        root.setVgap(10); // Espaciado vertical entre filas
        root.setAlignment(Pos.CENTER); // Centrar todo el contenido en el GridPane
        
        Label l1 = new Label();
        l1.setText("Bienvenido a JavaFX");
        //root.getChildren().add(l1);
        root.add(l1, 0, 0);
        
        Label l2 = new Label("JAVA VERSIÓN: " + System.getProperty("java.version"));
        //root.getChildren().add(l1);
        root.add(l2, 0, 0);
        
        Label l3 = new Label("JAVAFX VERSIÓN: " + System.getProperty("javafx.version"));
        //root.getChildren().add(l1);
        root.add(l3, 0, 0);
        
        Button button = new Button();
        button.setText("Saluda");
                
        Scene scene = new Scene(root, 300,250); //crea scene ancho y alto
        stage.setScene(scene); //agrega la scene al stage
        stage.show(); //muestra el stage
    }
    
}
