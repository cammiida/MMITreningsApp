package sample;

import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EarlierCompetitionsController implements Initializable {

    Stage prevStage;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }
}
