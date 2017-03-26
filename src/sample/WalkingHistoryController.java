package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WalkingHistoryController implements Initializable{
    Stage prevStage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }

}
