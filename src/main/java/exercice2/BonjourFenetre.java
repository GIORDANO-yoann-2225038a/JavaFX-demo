package exercice2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class BonjourFenetre extends Application {

    // Label affichant le message de bienvenue
    private Label helloLabel;

    // Champ de saisi du nom de l'utilisateur
    private TextField nameField;

    // Bouton déclenchant la mise à jour du texte
    private Button button;

    // Gestionnaire d'évènements appelé lors du clic sur le bouton
    EventHandler<MouseEvent> buttonClickHandler = actionEvent -> {
        helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
    };


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création d'un conteneur VBox avec ses éléments centrés
        VBox vbox = new VBox();
        vbox.setAlignment( Pos.CENTER );

        // Création et ajout du label au conteneur
        this.helloLabel = new Label("Bonjour à tous !");
        vbox.getChildren().add( helloLabel );



        // Changement du texte après un clic sur le bouton
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
        });


    }
}