package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/*

For å bytte scene:
    - last inn FXML-side du vil inn på ved hjelp av FXMLLoader.
    Eks for å laste inn AddWalk.fxml: FXMLLoader myLoader = new FXMLLoader(getClass().getResource("AddWalk.fxml"));
    Etterpå bruker man: Parent root = myLoader.load(); for å faktisk laste inn siden.
    En Scene trenger en root (Scene scene = new Scene(root);)
    Og en Stage trenger en Scene: Stage.setScene(scene);

    Når man vil bytte Scene, som er å bytte mellom forskjellige sider i appen, må man lage en ny tom Stage,
    laste inn den nye siden du vil bytte til vha FXMLLoader som beskrevet over (jeg kaller den nesten alltid
    for "root"), lage en ny Scene og sette den med siden du lastet inn (Scene scene = new Scene(root).
    Så setter du Stagen du nettopp lagde med Scenen du nettopp lagde.

    Last inn Controlleren til neste FXML-side, eks:
        AddWalkController addWalkController = myLoader.getController();
        addWalkController.setPrevStage(stage);

    Hver Controller til en side har en metode som heter setPrevStage(Stage stage) som sørger for at man
    kan aksessere den stagen man er i. Dette må man for å kunne lukke den stagen når du skal videre (prevStage.close).
    Derfor må man kalle metoden i den nye kontrolleren med Stagen man er i som argument.

 */



public class MainWindowController implements Initializable {

    Stage prevStage;

    @FXML
    private Button addWalk;
    @FXML
    private Button walkingHistory;
    @FXML
    private Button earlierCompetitions;
    @FXML
    private Button home;
    @FXML
    private Button history;
    @FXML
    private Button settings;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }


    @FXML
    public void addWalk(ActionEvent event) throws IOException {
        //Stage stageTheEventSourceNodeBelongs = (Stage) ((Node)event.getSource()).getScene().getWindow();

        Stage stage = new Stage();
        stage.setTitle("Legg til skritt");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("AddWalk.fxml"));

        Parent root = myLoader.load();
        Scene addWalkScene = new Scene(root);

        AddWalkController addWalkController = myLoader.getController();
        addWalkController.setPrevStage(stage);

        stage.setScene(addWalkScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void walkingHistory(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        prevStage.setTitle("Treningshistorikk");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("WalkingHistory.fxml"));

        Parent root = myLoader.load();
        Scene addWalkScene = new Scene(root);

        WalkingHistoryController walkingHistoryController = myLoader.getController();
        walkingHistoryController.setPrevStage(stage);

        stage.setScene(addWalkScene);
        prevStage.close();
        stage.show();
    }

    @FXML
    public void earlierCompetitions(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Tidligere konkurranser");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("EarlierCompetitions.fxml"));

        Parent root = myLoader.load();
        Scene earlierCompetitionsScene = new Scene(root);

        EarlierCompetitionsController earlierCompetitionsController = myLoader.getController();
        earlierCompetitionsController.setPrevStage(stage);

        stage.setScene(earlierCompetitionsScene);
        prevStage.close();
        stage.show();

    }

    @FXML
    public void home(ActionEvent event) throws IOException {

    }

    @FXML
    public void competitions(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Konkurranser");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Competitions.fxml"));

        Parent root = myLoader.load();
        Scene competitionsScene = new Scene(root);

        CompetitionsController competitionsController = myLoader.getController();
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
}