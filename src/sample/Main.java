package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class Main extends Application{

    Stage stage;
    Scene mainMenu, scene2;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        //a scene has an fxml root, and the window(or the primarystage) has a scene

        stage = primaryStage;
        //mainMenu
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        Parent root = myLoader.load();
        mainMenu = new Scene(root);
        MainWindowController mainWindowController = myLoader.getController();
        mainWindowController.setPrevStage(primaryStage);


        Label label2 = new Label("Welcome to the second scene");
        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(e -> stage.setScene(mainMenu));
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 200, 200);

        stage.setScene(scene2);
        stage.setTitle("Title here");
        stage.show();

    }

   /* @Override
    public void handle(ActionEvent event) {
        //to check which button is clicked and be able to have
        //different action for each button
        if(event.getSource()==button){
            System.out.println("I love it when you touch me there");
        }
    }*/
}


/*
Lambda syntax
button.setOnAction(e-< System.out.println("hey"));

 */