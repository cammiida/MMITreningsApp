package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RankingController implements Initializable{

    Stage prevStage;
    private boolean activeCompetition;

    @FXML
    private Button topRankingButton;

    @FXML
    private Button homeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }

    @FXML
    public void topRanking(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Tabell");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("TopRanking.fxml"));

        Parent root = myLoader.load();
        Scene topRankingScene = new Scene(root);

        TopRankingController topRankingController = myLoader.getController();
        topRankingController.setPrevStage(stage);

        if (this.activeCompetition == true){
            topRankingController.setActiveCompetition();
        }

        stage.setScene(topRankingScene);
        prevStage.close();
        stage.show();
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

        if (this.activeCompetition == true){
            mainWindowController.setActiveCompetition();
        }

        stage.setScene(competitionsScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void competitions(ActionEvent event) throws IOException {
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

        if (this.activeCompetition == true){
            settingsController.setActiveCompetition();
        }

        stage.setScene(settingsScene);
        prevStage.close();
        stage.show();

    }

    @FXML
    public void back(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Aktiv konkurranse");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Competition.fxml"));

        Parent root = myLoader.load();
        Scene competitionScene = new Scene(root);

        CompetitionController competitionController = myLoader.getController();
        competitionController.setPrevStage(stage);

        if (this.activeCompetition == true){
            competitionController.setActiveCompetition();
        }

        stage.setScene(competitionScene);
        prevStage.close();
        stage.show();

    }

    public boolean getActiveCompetition (){
        return this.activeCompetition;
    }

    public void setActiveCompetition(){
        this.activeCompetition = true;
    }

}
