package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        primaryStage.setTitle("Dragonball Super Card Game Deck Manager");
        primaryStage.setScene(new Scene(root, 800, 600));
        Image icon = new Image(getClass().getResourceAsStream("Icon.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();

    }


    public static void main(String[] args) {


        System.out.println();

        ChoiceBox<String> LeaderChoices = new ChoiceBox<String>();

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type = 'Leader'" );

            while (theCards.next()){
                LeaderChoices.getItems().add(theCards.getString("Name"));
            }

        }
        catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

    //    ObservableList<String> Leaders = FXCollections.observableArrayList("Leader 1","Leader 2", "Leader 3");


        launch(args);
    }
}
