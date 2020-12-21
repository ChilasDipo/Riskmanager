package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Controller {

    @FXML
    TextArea something;
    @FXML
    Pane TERNING;

    public void date(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = date.format(format);
        something.appendText( formattedDate+ "\n");
    }

    public void hej(){
        something.appendText( "hej med dig min ven"+ "\n");
    }

    }

