package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Controller {
    int i = 0;
    int numbertemp = 1;
    int pointer = 0;
    RisikoListe risklist = new RisikoListe();
    @FXML
    AnchorPane anchorplane;
    @FXML
    TextField textfelt1;
    @FXML
    TextField textfelt2;
    @FXML
    TextField textfelt3;
    @FXML
    TextField textfelt11;
    @FXML
    TextField textfelt21;
    @FXML
    TextField textfelt31;
    @FXML
    VBox vbox;
    @FXML
    Label riskID;

    public void buttoin1(javafx.event.ActionEvent event)throws IOException {
        Parent blah = FXMLLoader.load(getClass().getResource("page2.fxml"));
        Scene scene = new Scene(blah);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    public void addRisk(){
        //Creating new Risk and saving it in the Risklist
            Risk risk = new Risk();
            risklist.gemiliste(risk);

       Button button =  new Button("Risk " + numbertemp);
            button.setId(Integer.toString(i));
            i++;
            numbertemp++;
        button.setOnAction(event -> checkIDsetpointer(button));
            vbox.getChildren().add(button);
        }

        void checkIDsetpointer(Button button){
             pointer = Integer.parseInt(button.getId());
             int labelID = ((Integer.parseInt(button.getId()))+1);
            riskID.setText("Risk " + labelID );
            dostuff();
        }

        @FXML
        void dostuff(){
        // CLearer textfeltet
            textfelt1.clear();
            textfelt2.clear();
            textfelt3.clear();
            // sætter data fra risk ind i tekstfelterne
            textfelt1.appendText(risklist.loadfraliste(pointer).getName());
            textfelt2.appendText(risklist.loadfraliste(pointer).getDiscibtion());
            textfelt3.appendText(Integer.toString(risklist.loadfraliste(pointer).getSeverity()));
        }

        @FXML
        void savestuff(){

        risklist.loadfraliste(pointer).setName(textfelt1.getText());
        risklist.loadfraliste(pointer).setDiscibtion(textfelt2.getText());
        risklist.loadfraliste(pointer).setSeverity(Integer.parseInt(textfelt3.getText()));
        }
        @FXML
        void savetofile() throws IOException {
        RisikoListe risikoListe = new RisikoListe();
            for (int j = 0; j <numbertemp-1 ; j++) {
                risikoListe.savetofile(risklist.loadfraliste(j));
            }
        }
        @FXML
        void loadtofile() throws IOException {
            RisikoListe risikoListe = new RisikoListe();
            int lines = risikoListe.loadfromfile();
            for (int j = 0; j < lines-1; j++) {
                addRisk();
            }
            for (int j = 0; j < lines-1; j++) {
                risikoListe.loadfraliste(j).setName(risikoListe.parameterfromfile());
                risikoListe.loadfraliste(j).setDiscibtion(risikoListe.parameterfromfile());
                risikoListe.loadfraliste(j).setSeverity(risikoListe.parameterfromfileint());
            }




        }
    }

