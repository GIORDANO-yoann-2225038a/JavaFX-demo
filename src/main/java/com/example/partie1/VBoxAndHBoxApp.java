package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.security.cert.PolicyNode;


public class VBoxAndHBoxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        VBox vbox = new VBox();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        HBox topControls = new HBox();
        topControls.setAlignment( Pos.BOTTOM_LEFT );
        Button btnRefresh = new Button("Refresh");

        HBox topRightControls = new HBox();
        HBox.setHgrow(topRightControls, Priority.ALWAYS );
        topRightControls.setAlignment( Pos.BOTTOM_RIGHT );
        Hyperlink signOutLink = new Hyperlink("Sign Out");
        topRightControls.getChildren().add( signOutLink );

        topControls.getChildren().addAll( btnRefresh, topRightControls );


        // Création du tableau avec les deux colonnes
        TableView<Object> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        TableColumn<Object, String> lastNameCol = new TableColumn<>("Last Name");
        TableColumn<Object, String> firstNameCol = new TableColumn<>("First Name");
        tblCustomers.getColumns().addAll( lastNameCol, firstNameCol );
        VBox.setVgrow( tblCustomers, Priority.ALWAYS );




        GridPane gridpane = new GridPane();

        // Set one constraint at a time...
        // Places the button at the first row and second column
        Button button = new Button();
        GridPane.setRowIndex(button, 0);
        GridPane.setColumnIndex(button, 1);

        // or convenience methods set more than one constraint at once...
        Label label = new Label();
        GridPane.setConstraints(label, 2, 0); // column=2 row=0

        // don't forget to add children to gridpane
        gridpane.getChildren().addAll(button, label);










        Separator sepMid = new Separator(Orientation.VERTICAL);


        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du bandeau en bas de la fenêtre
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_RIGHT );
        Button btnClose = new Button("Close");
        bottomControls.getChildren().add( btnClose );

        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                topControls,
                tblCustomers,
                sep,
                bottomControls
        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");



         // Affichage de la fenêtre
        primaryStage.show();

        VBox.setMargin( topControls, new Insets(10.0d) );
        VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setMargin( bottomControls, new Insets(10.0d) );
    }

    public static void main(String[] args) {
        launch(args);
    }
}