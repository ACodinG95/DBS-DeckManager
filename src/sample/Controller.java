package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

public class Controller implements Initializable{

    @FXML
    ObservableList<String> LeaderOptions = FXCollections.observableArrayList();
    ObservableList<String> CardOptions = FXCollections.observableArrayList();
    public ComboBox<String> LeaderChoices = new ComboBox<>();
    public ComboBox<String> CardChoices = new ComboBox<>();
    public ImageView leaderImage = new ImageView();
    public ImageView cardImage = new ImageView();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try{

            FileInputStream CardBackInput = new FileInputStream("C:/Users/Anthony/IdeaProjects/DBS-DeckManager/src/sample/Images/CardBack.png");
           // File CardBackFile = new File("C:\Users\Anthony\IdeaProjects\DBS-DeckManager\src\sample\Images\CardBack.png");
            Image CardBackImage = new Image(CardBackInput);
            leaderImage.setImage(CardBackImage);
            cardImage.setImage(CardBackImage);

        }

        catch (FileNotFoundException e){System.out.println(e);};


        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type != 'Leader'" );

            while (theCards.next()){
                CardOptions.add(theCards.getString("Name"));
            }

            ResultSet theLeaders = cards.executeQuery("SELECT * FROM Cards WHERE Type = 'Leader'" );

            while (theLeaders.next()){
                LeaderOptions.add(theCards.getString("Name") + "/" + theCards.getString("Awakened Name") );
            }

        }
        catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

        CardChoices.setItems(CardOptions);
        LeaderChoices.setItems(LeaderOptions);

        CardChoices.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                System.out.println(t1);
                try{
                    Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
                    Statement cards = conn.createStatement();
                  //  ResultSet selectedCard = cards.executeQuery("SELECT * FROM Cards WHERE Type != 'Leader'");
                    ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Name = " + "'" + t1 + "'");


                    //            while (selectedCard.next()){
       //                 if(selectedCard.getString("Name") == t1){

          //              }
           //                 ;}

                    String cardImageLoc = selectedCard.getString("Image");
                    cardImageLoc = "C:/Users/Anthony/IdeaProjects/DBS-DeckManager/src/sample" + cardImageLoc;
                    System.out.println(cardImageLoc);
                    FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
                    Image theCardImage = new Image(cardImageInput);
                    cardImage.setImage(theCardImage);

                }
                catch(SQLException | FileNotFoundException e){System.out.println(e);}


            }
        });

    }

    @FXML
    private void openLeaderList(ActionEvent event) throws Exception {

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type = 'Leader'" );

            while (theCards.next()){
                System.out.println(theCards.getString("Code") + ": " + theCards.getString("Name") + "/" + theCards.getString("Awakened Name"));
            }
            System.out.println(" ");
        }
        catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("LeaderList.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Dragonball Super Card Game Deck Manager");
        primaryStage.setScene(new Scene(root, 800, 600));
        Image icon = new Image(getClass().getResourceAsStream("Icon.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();
    }

    @FXML
    private void openCardList(ActionEvent event) throws Exception {

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type != 'Leader'" );

            while (theCards.next()){
                System.out.println(theCards.getString("Code") + ": " + theCards.getString("Name"));
            }
            System.out.println(" ");

        }
        catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("CardList.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Dragonball Super Card Game Deck Manager");
        primaryStage.setScene(new Scene(root, 800, 600));
        Image icon = new Image(getClass().getResourceAsStream("Icon.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();

    }

    @FXML
    private void backButtonAction() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Dragonball Super Card Game Deck Manager");
        primaryStage.setScene(new Scene(root, 800, 600));
        Image icon = new Image(getClass().getResourceAsStream("Icon.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();

    }

    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}