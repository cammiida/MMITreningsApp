package sample;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ActiveCompetitionsController implements Initializable{
    Stage prevStage;

    @FXML
    private Button homeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }

    @FXML
    public void home(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Hjem");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));

        Parent root = myLoader.load();
        Scene competitionsScene = new Scene(root);

        MainWindowController mainWindowController = myLoader.getController();
        mainWindowController.setPrevStage(stage);

        stage.setScene(competitionsScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void competitions(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Konkurranser");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("NoActiveCompetitions.fxml"));

        Parent root = myLoader.load();
        Scene competitionsScene = new Scene(root);

        NoActiveCompetitionsController competitionsController = myLoader.getController();
        competitionsController.setPrevStage(stage);

        stage.setScene(competitionsScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void settings(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Innstillinger");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Settings.fxml"));

        Parent root = myLoader.load();
        Scene settingsScene = new Scene(root);

        SettingsController settingsController = myLoader.getController();
        settingsController.setPrevStage(stage);

        stage.setScene(settingsScene);
        prevStage.close();
        stage.show();

    }

    @FXML
    public void competitionDetails(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Konkurranse");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("RelevantCompetition.fxml"));

        Parent root = myLoader.load();
        Scene relevantCompetitionScene = new Scene(root);

        RelevantCompetitionController relevantCompetitionController = myLoader.getController();
        relevantCompetitionController.setPrevStage(stage);

        stage.setScene(relevantCompetitionScene);
        prevStage.close();
        stage.show();
    }

}
