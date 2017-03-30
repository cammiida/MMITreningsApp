package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CompetitionController implements Initializable{

    Stage prevStage;
    private boolean activeCompetition;

    @FXML
    private ComboBox comboBox;

    @FXML
    private Button homeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBox.getItems().removeAll(comboBox.getItems());
        comboBox.getItems().addAll("Lett", "Medium", "Vanskelig");
        comboBox.getSelectionModel().select("Lett");
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

        mainWindowController.setActiveCompetition(this.activeCompetition);

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
    public void activeCompetitions (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Aktive konkurranser");
        FXMLLoader myloader = new FXMLLoader(getClass().getResource("ActiveCompetitions.fxml"));

        Parent root = myloader.load();
        Scene activeCompetitionsScene = new Scene(root);

        ActiveCompetitionsController activeCompetitionsController = myloader.getController();
        activeCompetitionsController.setPrevStage(stage);

        stage.setScene(activeCompetitionsScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void ranking (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Rangering");
        FXMLLoader myloader = new FXMLLoader(getClass().getResource("Ranking.fxml"));

        Parent root = myloader.load();
        Scene rankingScene = new Scene(root);

        RankingController rankingController = myloader.getController();
        rankingController.setPrevStage(stage);

        stage.setScene(rankingScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void back(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Aktuell konkurranse");
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
