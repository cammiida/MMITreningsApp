package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RelevantCompetitionController {
    Stage prevStage;

    private boolean activeCompetition;

    @FXML
    private Button homeButton;

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
        Scene homeScene = new Scene(root);

        MainWindowController mainWindowController = myLoader.getController();
        mainWindowController.setPrevStage(stage);

        if (this.activeCompetition == true){
            mainWindowController.setActiveCompetition();
        }

        stage.setScene(homeScene);
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
    public void activateCompetition(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Aktiv konkurranse");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Competition.fxml"));

        Parent root = myLoader.load();
        Scene competitionScene = new Scene(root);

        CompetitionController competitionController = myLoader.getController();
        competitionController.setPrevStage(stage);


        competitionController.setActiveCompetition();

        stage.setScene(competitionScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void back(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Aktive konkurranser");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("ActiveCompetitions.fxml"));

        Parent root = myLoader.load();
        Scene activeCompetitionsScene = new Scene(root);

        ActiveCompetitionsController activeCompetitionsController = myLoader.getController();
        activeCompetitionsController.setPrevStage(stage);

        if (this.activeCompetition == true){
            activeCompetitionsController.setActiveCompetition();
        }

        stage.setScene(activeCompetitionsScene);
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
