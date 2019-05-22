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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

public class Controller implements Initializable {

    @FXML
    ObservableList<String> LeaderOptions = FXCollections.observableArrayList();
    ObservableList<String> CardOptions = FXCollections.observableArrayList();
    ObservableList<String> DeckOptions = FXCollections.observableArrayList();
    ObservableList<String> DeckCards = FXCollections.observableArrayList();
    public ComboBox<String> LeaderChoices = new ComboBox<>();
    public ComboBox<String> CardChoices = new ComboBox<>();
    public ComboBox<String> DeckChoices = new ComboBox<>();
    public ComboBox<String> DeckCardsBox = new ComboBox<>();
    public ComboBox<String> DeckCardChoices = new ComboBox<>();

    public ImageView leaderImage = new ImageView();
    public ImageView cardImage = new ImageView();
    public ImageView deckImage1 = new ImageView();
    public ImageView deckImage2 = new ImageView();
    public ImageView deckImage3 = new ImageView();
    public ImageView deckImage4 = new ImageView();

    public TextField textInput = new TextField();
    
    public Stage primaryStage = new Stage();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        try {

            FileInputStream CardBackInput = new FileInputStream("L:/DBS-DeckManager/src/sample/Images/CardBack.png");
            // File CardBackFile = new File("C:\Users\Anthony\IdeaProjects\DBS-DeckManager\src\sample\Images\CardBack.png");
            Image CardBackImage = new Image(CardBackInput);
            leaderImage.setImage(CardBackImage);
            cardImage.setImage(CardBackImage);
            deckImage1.setImage(CardBackImage);
            deckImage2.setImage(CardBackImage);
            deckImage3.setImage(CardBackImage);
            deckImage4.setImage(CardBackImage);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        ;

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type != 'Leader'");

            while (theCards.next()) {
                CardOptions.add( theCards.getString("Code")  + ": " + theCards.getString("Name"));
            }

            ResultSet theLeaders = cards.executeQuery("SELECT * FROM Cards WHERE Type = 'Leader'");

            while (theLeaders.next()) {
                LeaderOptions.add(theCards.getString("Name") + "/" + theCards.getString("AwakenedName"));
            }

            ResultSet theDecks = cards.executeQuery("SELECT * FROM Decks");

            while (theDecks.next()) {
                DeckOptions.add(theCards.getString("Name"));
            }

        } catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

        CardChoices.setItems(CardOptions);
        LeaderChoices.setItems(LeaderOptions);
        DeckChoices.setItems(DeckOptions);
        DeckCardChoices.setItems(CardOptions);

        CardChoices.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                System.out.println(t1);
                try {

                    String C = t1;

                    while(C.contains(":")){
                        C = C.substring(0,C.length()-1);
                    }

                    System.out.println(C);

                    Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
                    Statement cards = conn.createStatement();
                    ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

                    //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

                    String cardImageLoc = selectedCard.getString("Image");
                    cardImageLoc = "L:/DBS-DeckManager/src/sample" + cardImageLoc;
                    System.out.println(cardImageLoc);
                    FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
                    Image theCardImage = new Image(cardImageInput);
                    cardImage.setImage(theCardImage);

                    conn.close();

                } catch (SQLException | FileNotFoundException e) {
                    System.out.println(e);
                }


            }
        });
        LeaderChoices.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                System.out.println(t1);
                try {

                    String an = t1;

                    while (an.contains("/")) {
                        an = an.substring(1);
                    }

                    System.out.println(an);
                    Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
                    Statement cards = conn.createStatement();
                    ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE AwakenedName = " + '"' + an + '"');

                    String cardImageLoc = selectedCard.getString("Image");
                   // cardImageLoc = "." + cardImageLoc;

                    cardImageLoc = "L:/DBS-DeckManager/src/sample" + cardImageLoc;
                    System.out.println(cardImageLoc);
                    FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
                    Image theCardImage = new Image(cardImageInput);
                    leaderImage.setImage(theCardImage);

                } catch (SQLException | FileNotFoundException e) {
                    System.out.println(e);
                }


            }
        });
        DeckChoices.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {

                try {

                    Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
                    Statement deck = conn.createStatement();
                    Statement cards = conn.createStatement();

                    ResultSet theDeck = deck.executeQuery("SELECT * FROM Decks WHERE Name = " + "'" + t1 + "'");
                    ResultSet theCards = cards.executeQuery("SELECT * FROM Cards");

                    DeckCards.clear();

                    for(int i=1; i <=10 ; i++){
                        System.out.println("Card" + i);

                        cards.executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card" + i) + "'");
                        DeckCards.add(theDeck.getString("Card" + i) + ": " + theCards.getString("Name"));
                    }

                    try{
                    FileInputStream cardImageinput = new FileInputStream("E:/DBS-DeckManager/src/sample/Images/" + theCards.getString(theDeck.getString("Card1")));
                    Image cardImage = new Image(cardImageinput);
                    deckImage1.setImage(cardImage);}
                    catch(SQLException|FileNotFoundException e){System.out.println(e);}
                    /*
                    String cardImageLoc = selectedCard.getString("Image");
                    cardImageLoc = "E:/DBS-DeckManager/src/sample" + cardImageLoc;
                    System.out.println(cardImageLoc);
                    FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
                    Image theCardImage = new Image(cardImageInput);
                    cardImage.setImage(theCardImage);
*/


                    DeckCardsBox.setItems(DeckCards);
                    conn.close();

                } catch (SQLException e) {
                    System.out.println(e);
                }


            }
        });
    }

    @FXML
    private void openLeaderList(ActionEvent event) throws Exception {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type = 'Leader'");

            while (theCards.next()) {
                System.out.println(theCards.getString("Code") + ": " + theCards.getString("Name") + "/" + theCards.getString("AwakenedName"));
            }
            System.out.println(" ");

            conn.close();
        } catch (SQLException e) {
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

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();

            ResultSet theCards = cards.executeQuery("SELECT * FROM Cards WHERE Type != 'Leader'");

            while (theCards.next()) {
                System.out.println(theCards.getString("Code") + ": " + theCards.getString("Name"));
            }
            System.out.println(" ");
            conn.close();

        } catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("CardList.fxml"));
       // Stage primaryStage = new Stage();
        primaryStage.setTitle("Dragonball Super Card Game Deck Manager");
        primaryStage.setScene(new Scene(root, 800, 600));
        Image icon = new Image(getClass().getResourceAsStream("Icon.jpg"));
        primaryStage.getIcons().add(icon);
        primaryStage.show();

    }

    @FXML
    private void openDecks(ActionEvent event) throws Exception {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement decks = conn.createStatement();

            ResultSet theDecks = decks.executeQuery("SELECT * FROM Decks");

            while (theDecks.next()) {
                System.out.println(theDecks.getString("Name"));
            }
            System.out.println(" ");
            conn.close();

        } catch (SQLException e) {
            System.out.println("Mistakes were made: " + e.getMessage());
        }

        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("Decks.fxml"));
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

    @FXML
    private void deleteDeckAction() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement deck = conn.createStatement();

            String deckName = DeckChoices.getValue();
            deck.executeQuery("DELETE FROM Decks WHERE Name = " + "'" + deckName + "'");

            ResultSet theDecks = deck.executeQuery("SELECT * FROM Decks");

            DeckOptions.clear();

            while (theDecks.next()){
                          DeckOptions.add(theDecks.getString("Name") );
                 }
                  DeckChoices.setItems(DeckOptions);

        }
            catch (SQLException e) {

                System.out.println(e); }

    }

    @FXML
    private void addDeckAction(){

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement deck = conn.createStatement();
            
            deck.executeUpdate("INSERT INTO Decks (Name) VALUES ('" + textInput.getText() + "')");}


        catch (SQLException e) {

            System.out.println(e); }



    }

}
