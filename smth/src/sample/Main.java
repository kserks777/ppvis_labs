package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.ComboBox;
import java.lang.String;
import javafx.scene.control.Alert;

public class Main extends Application {
public String[] array = new String[30];
public int quan = 0;
private TableView table = new TableView();
    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox space = new HBox(); //основное окно
        Scene scene = new Scene(space,1100,175);

        space.setSpacing(10);
        space.setPadding(new Insets(0,10,10,10));

        primaryStage.setTitle("LAB 1");
        primaryStage.setScene(scene);

        VBox root1 = new VBox();//1 группа
        root1.setSpacing(10);
        root1.setPadding(new Insets(15,20,10,10));

        TextField fill = new TextField();
        fill.setMaxWidth(120);
        root1.getChildren().add(fill);

        final ComboBox list = new ComboBox();
        list.setPrefWidth(120);
        root1.getChildren().add(list);

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
                array[quan]=text;
                for (int i=0; i<quan;i++) {
                    if (text.equals(array[i])) {
                        Alert warn = new Alert(Alert.AlertType.INFORMATION);
                        warn.setTitle("Warning!");
                        warn.setContentText("This word is using.");
                        warn.showAndWait();
                       return;
                    }
                }
                    quan++;
                    list.getItems().add(text);

            }
        });

        HBox dop = new HBox();
        dop.getChildren().add(check);
        dop.getChildren().add(clear);
        root1.getChildren().add(dop);
        space.getChildren().add(root1);



        VBox root2 = new VBox();//2 группа
        root2.setSpacing(10);
        root2.setPadding(new Insets(15,20,10,10));

        TextField text = new TextField();
        text.setMaxWidth(120);
        root2.getChildren().add(text);

        Button clickme = new Button();
        clickme.setText("Edit next Button");

        Button replace = new Button();
        replace.setText("There is some text");

        clickme.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String smth = text.getText();
                replace.setText(smth);
            }
        });

        replace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name1 = clickme.getText();
                String name2 = replace.getText();
                clickme.setText(name2);
                replace.setText(name1);
            }
        });
        root2.getChildren().add(clickme);
        root2.getChildren().add(replace);
        space.getChildren().add(root2);

        VBox root3 = new VBox();//3 группа
        root3.setSpacing(10);
        root3.setPadding(new Insets(15,20,10,10));

        TextField choose = new TextField();
        choose.setMaxWidth(120);
        root3.getChildren().add(choose);

        HBox plus = new HBox();
        HBox minus = new HBox();
        minus.setSpacing(10);
        plus.setSpacing(10);
        RadioButton ex1 = new RadioButton("1");
        RadioButton ex2 = new RadioButton("2");
        RadioButton ex3 = new RadioButton("3");
        ToggleGroup group = new ToggleGroup();
        ex1.setToggleGroup(group);
        ex2.setToggleGroup(group);
        ex3.setToggleGroup(group);
        plus.getChildren().add(ex1);
        plus.getChildren().add(ex2);
        root3.getChildren().add(plus);
        minus.getChildren().add(ex3);
        Button cry = new Button("Simple Button");
        minus.getChildren().add(cry);
        root3.getChildren().add(minus);
        cry.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String smtext = choose.getText();
                boolean help = false;

                if(ex1.getText().equals(smtext)){
                    ex1.setSelected(true);
                    help = true;
                }
                if(ex2.getText().equals(smtext)){
                    ex2.setSelected(true);
                    help = true; }
                if(ex3.getText().equals(smtext)){
                    ex3.setSelected(true);
                   help = true; }
                if (!help) {
                    Alert warn = new Alert(Alert.AlertType.INFORMATION);
                    warn.setTitle("Warning!");
                    warn.setContentText("There is no such word.");
                    warn.showAndWait();
                }
            }
        });
        space.getChildren().add(root3);

        VBox root4 = new VBox();
        root4.setSpacing(10);
        root4.setPadding(new Insets(15,20,10,10));
        TextField field = new TextField();
        field.setMaxWidth(120);
        root4.getChildren().add(field);
        HBox boxes = new HBox();
        boxes.setSpacing(10);
        CheckBox box1 = new CheckBox("1");
        CheckBox box2 = new CheckBox("2");
        boxes.getChildren().add(box1);
        boxes.getChildren().add(box2);
        root4.getChildren().add(boxes);
        CheckBox box3 = new CheckBox("3");
        root4.getChildren().add(box3);
        HBox group4 = new HBox();
        Button bingo = new Button("Point");
        group4.getChildren().add(bingo);
        bingo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String filled = field.getText();
                boolean help = false;

                if(box1.getText().equals(filled)){
                    box1.setSelected(true);
                    help = true;
                }
                if(box2.getText().equals(filled)){
                    box2.setSelected(true);
                    help = true; }
                if(box3.getText().equals(filled)){
                    box3.setSelected(true);
                    help = true; }
                if (!help) {
                    Alert warn = new Alert(Alert.AlertType.INFORMATION);
                    warn.setTitle("Warning!");
                    warn.setContentText("There is no such word.");
                    warn.showAndWait();
                }
            }
        });
        Button clean4 = new Button();
        clean4.setText("Clear");
        clean4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                field.clear();
            }
        });
        group4.getChildren().add(clean4);
        root4.getChildren().add(group4);
        space.getChildren().add(root4);
        VBox root5 = new VBox();
        root5.setSpacing(10);
        root5.setPadding(new Insets(15,20,10,10));
        TextField textfield = new TextField();
        textfield.setMaxWidth(120);
        root5.getChildren().add(textfield);
        HBox buttons = new HBox();
        Button but1 = new Button("in 1");
        Button but2 = new Button("in 2");
        Button but3 = new Button("repeat 1");
        buttons.getChildren().addAll(but1,but2);
        root5.getChildren().addAll(buttons, but3);
        space.getChildren().add(root5);
        table.setEditable(true);
        TableColumn one = new TableColumn("1");
        TableColumn two = new TableColumn("2");

        table.getColumns().addAll(one,two);
        space.getChildren().add(table);
        but1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String text = textfield.getText();
            }
        });
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
