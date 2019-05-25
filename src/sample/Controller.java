package sample;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
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

    public ImageView deckLeader = new ImageView();
    public ImageView deckLeaderBack = new ImageView();
    public ImageView deckImage1 = new ImageView();
    public ImageView deckImage2 = new ImageView();
    public ImageView deckImage3 = new ImageView();
    public ImageView deckImage4 = new ImageView();
    public ImageView deckImage5 = new ImageView();
    public ImageView deckImage6 = new ImageView();
    public ImageView deckImage7 = new ImageView();
    public ImageView deckImage8 = new ImageView();
    public ImageView deckImage9 = new ImageView();
    public ImageView deckImage10 = new ImageView();
    public ImageView deckImage11 = new ImageView();
    public ImageView deckImage12 = new ImageView();
    public ImageView deckImage13 = new ImageView();
    public ImageView deckImage14 = new ImageView();
    public ImageView deckImage15 = new ImageView();
    public ImageView deckImage16 = new ImageView();
    public ImageView deckImage17 = new ImageView();
    public ImageView deckImage18 = new ImageView();
    public ImageView deckImage19 = new ImageView();
    public ImageView deckImage20 = new ImageView();
    public ImageView deckImage21 = new ImageView();
    public ImageView deckImage22 = new ImageView();
    public ImageView deckImage23 = new ImageView();
    public ImageView deckImage24 = new ImageView();
    public ImageView deckImage25 = new ImageView();
    public ImageView deckImage26 = new ImageView();
    public ImageView deckImage27 = new ImageView();
    public ImageView deckImage28 = new ImageView();
    public ImageView deckImage29 = new ImageView();
    public ImageView deckImage30 = new ImageView();
    public ImageView deckImage31 = new ImageView();
    public ImageView deckImage32 = new ImageView();
    public ImageView deckImage33 = new ImageView();
    public ImageView deckImage34 = new ImageView();
    public ImageView deckImage35 = new ImageView();
    public ImageView deckImage36 = new ImageView();
    public ImageView deckImage37 = new ImageView();
    public ImageView deckImage38 = new ImageView();
    public ImageView deckImage39 = new ImageView();
    public ImageView deckImage40 = new ImageView();
    public ImageView deckImage41 = new ImageView();
    public ImageView deckImage42 = new ImageView();
    public ImageView deckImage43 = new ImageView();
    public ImageView deckImage44 = new ImageView();
    public ImageView deckImage45 = new ImageView();
    public ImageView deckImage46 = new ImageView();
    public ImageView deckImage47 = new ImageView();
    public ImageView deckImage48 = new ImageView();
    public ImageView deckImage49 = new ImageView();
    public ImageView deckImage50 = new ImageView();

    public TextField textInput = new TextField();
    
    public Stage primaryStage = new Stage();
    String IMAGEPATH = "L:/DBS-DeckManager/src/sample";



    @Override
    public void initialize(URL location, ResourceBundle resources) {


        try {

            FileInputStream CardBackInput = new FileInputStream(IMAGEPATH + "/Images/CardBack.png");
            // File CardBackFile = new File("C:\Users\Anthony\IdeaProjects\DBS-DeckManager\src\sample\Images\CardBack.png");
            Image CardBackImage = new Image(CardBackInput);
            leaderImage.setImage(CardBackImage);
            cardImage.setImage(CardBackImage);
            deckImage1.setImage(CardBackImage);
            deckImage2.setImage(CardBackImage);
            deckImage3.setImage(CardBackImage);
            deckImage4.setImage(CardBackImage);
            deckImage5.setImage(CardBackImage);
            deckImage6.setImage(CardBackImage);
            deckImage7.setImage(CardBackImage);
            deckImage8.setImage(CardBackImage);
            deckImage9.setImage(CardBackImage);
            deckImage10.setImage(CardBackImage);
            deckImage11.setImage(CardBackImage);
            deckImage12.setImage(CardBackImage);
            deckImage13.setImage(CardBackImage);
            deckImage14.setImage(CardBackImage);
            deckImage15.setImage(CardBackImage);
            deckImage16.setImage(CardBackImage);
            deckImage17.setImage(CardBackImage);
            deckImage18.setImage(CardBackImage);
            deckImage19.setImage(CardBackImage);
            deckImage20.setImage(CardBackImage);
            deckImage21.setImage(CardBackImage);
            deckImage22.setImage(CardBackImage);
            deckImage23.setImage(CardBackImage);
            deckImage24.setImage(CardBackImage);
            deckImage25.setImage(CardBackImage);
            deckImage26.setImage(CardBackImage);
            deckImage27.setImage(CardBackImage);
            deckImage28.setImage(CardBackImage);
            deckImage29.setImage(CardBackImage);
            deckImage30.setImage(CardBackImage);
            deckImage31.setImage(CardBackImage);
            deckImage32.setImage(CardBackImage);
            deckImage33.setImage(CardBackImage);
            deckImage34.setImage(CardBackImage);
            deckImage35.setImage(CardBackImage);
            deckImage36.setImage(CardBackImage);
            deckImage37.setImage(CardBackImage);
            deckImage38.setImage(CardBackImage);
            deckImage39.setImage(CardBackImage);
            deckImage40.setImage(CardBackImage);
            deckImage41.setImage(CardBackImage);
            deckImage42.setImage(CardBackImage);
            deckImage43.setImage(CardBackImage);
            deckImage44.setImage(CardBackImage);
            deckImage45.setImage(CardBackImage);
            deckImage46.setImage(CardBackImage);
            deckImage47.setImage(CardBackImage);
            deckImage48.setImage(CardBackImage);
            deckImage49.setImage(CardBackImage);
            deckImage50.setImage(CardBackImage);

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

            conn.close();

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
                    cardImageLoc = IMAGEPATH + cardImageLoc;
                    System.out.println(cardImageLoc);
                    FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
                    Image theCardImage = new Image(cardImageInput);
                    cardImage.setImage(theCardImage);

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

                    cardImageLoc = IMAGEPATH + cardImageLoc;
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

                    FileInputStream CardBackInput = new FileInputStream(IMAGEPATH + "/Images/CardBack.png");
                    Image CardBackImage = new Image(CardBackInput);
                    deckImage1.setImage(CardBackImage);
                    deckImage2.setImage(CardBackImage);
                    deckImage3.setImage(CardBackImage);
                    deckImage4.setImage(CardBackImage);
                    deckImage5.setImage(CardBackImage);
                    deckImage6.setImage(CardBackImage);
                    deckImage7.setImage(CardBackImage);
                    deckImage8.setImage(CardBackImage);
                    deckImage9.setImage(CardBackImage);
                    deckImage10.setImage(CardBackImage);
                    deckImage11.setImage(CardBackImage);
                    deckImage12.setImage(CardBackImage);
                    deckImage13.setImage(CardBackImage);
                    deckImage14.setImage(CardBackImage);
                    deckImage15.setImage(CardBackImage);
                    deckImage16.setImage(CardBackImage);
                    deckImage17.setImage(CardBackImage);
                    deckImage18.setImage(CardBackImage);
                    deckImage19.setImage(CardBackImage);
                    deckImage20.setImage(CardBackImage);
                    deckImage21.setImage(CardBackImage);
                    deckImage22.setImage(CardBackImage);
                    deckImage23.setImage(CardBackImage);
                    deckImage24.setImage(CardBackImage);
                    deckImage25.setImage(CardBackImage);
                    deckImage26.setImage(CardBackImage);
                    deckImage27.setImage(CardBackImage);
                    deckImage28.setImage(CardBackImage);
                    deckImage29.setImage(CardBackImage);
                    deckImage30.setImage(CardBackImage);
                    deckImage31.setImage(CardBackImage);
                    deckImage32.setImage(CardBackImage);
                    deckImage33.setImage(CardBackImage);
                    deckImage34.setImage(CardBackImage);
                    deckImage35.setImage(CardBackImage);
                    deckImage36.setImage(CardBackImage);
                    deckImage37.setImage(CardBackImage);
                    deckImage38.setImage(CardBackImage);
                    deckImage39.setImage(CardBackImage);
                    deckImage40.setImage(CardBackImage);
                    deckImage41.setImage(CardBackImage);
                    deckImage42.setImage(CardBackImage);
                    deckImage43.setImage(CardBackImage);
                    deckImage44.setImage(CardBackImage);
                    deckImage45.setImage(CardBackImage);
                    deckImage46.setImage(CardBackImage);
                    deckImage47.setImage(CardBackImage);
                    deckImage48.setImage(CardBackImage);
                    deckImage49.setImage(CardBackImage);
                    deckImage50.setImage(CardBackImage);

                    Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
                    Statement deck = conn.createStatement();

                    ResultSet theDeck = deck.executeQuery("SELECT * FROM Decks WHERE Name = " + "'" + t1 + "'");
                  //  ResultSet theCards = cards.executeQuery("SELECT * FROM Cards");

                  //  DeckCards.clear();

                    ResultSet theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card1") +  "'");
                    String cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
                    Image theCardImage = new Image(cardImageInput);
                    deckImage1.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card2") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage2.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card3") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage3.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card4") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage4.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card5") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage5.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card6") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage6.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card7") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage7.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card8") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage8.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card9") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage9.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card10") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage10.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card11") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage11.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card12") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage12.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card13") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage13.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card14") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage14.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card15") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage15.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card16") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage16.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card17") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage17.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card18") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage18.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card19") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage19.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card20") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage20.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card21") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage21.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card22") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage22.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card23") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage23.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card24") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage24.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card25") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage25.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card26") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage26.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card27") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage27.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card28") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage28.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card29") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage29.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card30") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage30.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card31") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage31.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card32") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage32.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card33") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage33.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card34") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage34.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card35") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage35.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card36") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage36.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card37") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage37.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card38") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage38.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card39") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage39.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card40") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage40.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card41") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage41.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card42") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage42.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card43") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage43.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card44") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage44.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card45") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage45.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card46") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage46.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card47") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage47.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card48") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage48.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card49") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage49.setImage(theCardImage);

                    theCard = conn.createStatement().executeQuery("SELECT * FROM Cards Where Code = " + "'" + theDeck.getString("Card50") +  "'");
                    cardImageLoc = theCard.getString("Image");
                    cardImageLoc = IMAGEPATH  + cardImageLoc;
                    cardImageInput = new FileInputStream(cardImageLoc);
                    theCardImage = new Image(cardImageInput);
                    deckImage50.setImage(theCardImage);

                    conn.close();

                } catch (SQLException|FileNotFoundException e) {
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

           // conn.close();
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

        Parent root = FXMLLoader.load(getClass().getResource("DecksNice.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Dragonball Super Card Game Deck Manager");
        primaryStage.setScene(new Scene(root));
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

        }
            catch (SQLException e) {

                System.out.println(e); }
    }

    @FXML
    private void addDeckAction(){

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement deck = conn.createStatement();

            deck.executeUpdate("INSERT INTO Decks (Name) VALUES ('" + textInput.getText() + "')");

        }

        catch (SQLException e) {
            System.out.println(e); }
    }

    @FXML
    private void fillCard1(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage1.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card1 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard2(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage2.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card2 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard3(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage3.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card3 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard4(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage4.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card4 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard5(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage5.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card5 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard6(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage6.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card6 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard7(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage7.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card7 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard8(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage8.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card8 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard9(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage9.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card9 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard10(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage10.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card10 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard11(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage11.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card11 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard12(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage12.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card12 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard13(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage13.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card13 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard14(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage14.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card14 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard15(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage15.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card15 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard16(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage16.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card16 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard17(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage17.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card17 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard18(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage18.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card18 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard19(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage19.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card19 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard20(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage20.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card20 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard21(MouseEvent event){

        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage21.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card21 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard22(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage22.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card22 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard23(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage23.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card23 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard24(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage24.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card24 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard25(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage25.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card25 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard26(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage26.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card26 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard27(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage27.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card27 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard28(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage28.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card28 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard29(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage29.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card29 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard30(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cards = conn.createStatement();
            ResultSet selectedCard = cards.executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage30.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card30 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard31(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage31.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card31 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard32(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage32.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card32 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard33(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage33.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card33 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard34(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage34.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card34 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard35(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage35.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card35 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard36(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage36.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card36 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard37(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage37.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card37 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard38(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage38.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card38 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard39(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage39.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card39 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard40(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage40.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card40 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard41(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage41.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card41 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard42(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage42.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card42 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard43(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage43.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card43 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard44(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage44.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card44 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard45(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage45.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card45 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard46(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage46.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card46 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard47(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage47.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card47 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard48(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage48.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card48 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard49(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage49.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card49 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

    @FXML
    private void fillCard50(MouseEvent event){


        try {

            String C = DeckCardChoices.getValue();

            while (C.contains(":")) {
                C = C.substring(0, C.length() - 1);
            }
            System.out.println(C);

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            ResultSet selectedCard = conn.createStatement().executeQuery("SELECT Image FROM Cards WHERE Code = " + '"' + C + '"');

            //ResultSet selectedCard = cards.executeQuery(`SELECT Image FROM Cards WHERE Name = "${t1}" `);

            //     conn.close();

            String cardImageLoc = selectedCard.getString("Image");
            cardImageLoc = IMAGEPATH + cardImageLoc;
            System.out.println(cardImageLoc);
            FileInputStream cardImageInput = new FileInputStream(cardImageLoc);
            Image theCardImage = new Image(cardImageInput);
            deckImage50.setImage(theCardImage);

            conn.close();

            Connection connn = DriverManager.getConnection("jdbc:sqlite:Cards.db");
            Statement cardss = connn.createStatement();


            cardss.executeUpdate("UPDATE Decks" +
                    " SET Card50 = "  + "'" + C + "'" +
                    " WHERE Name = " + "'" + DeckChoices.getValue() + "'");

        }
        catch(SQLException |FileNotFoundException|NullPointerException e){System.out.println(e);}
    }

}
