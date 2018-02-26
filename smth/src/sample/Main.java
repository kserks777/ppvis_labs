package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.ComboBox;
import java.lang.String;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FlowPane root = new FlowPane();

        TextField fill = new TextField();
        fill.setMinWidth(70);
        root.getChildren().add(fill);

        Scene scene = new Scene(root,300,175);
        primaryStage.setTitle("LAB 1");
        primaryStage.setScene(scene);
        final ComboBox list = new ComboBox();
        root.getChildren().add(list);
        Button check = new Button();

        Button clear = new Button();
        clear.setText("Clear");
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fill.clear();
            }
        });

        check.setText("Click me");
        check.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String text = fill.getText();
                list.getItems().add(text);
            }
        });
        root.getChildren().add(check);
        root.getChildren().add(clear);

        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
