package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import manager.*;
import utils.NameGenerator;

public class TheMainFx extends Application
{
    public static void main(String[] args) {
        // Launch the JavaFX application
        Application.launch(args);
    }

    @Override public void start(Stage stage) {
        NameGenerator ng = new NameGenerator();

        Manager m = new Manager(ng.getRandomName(), ng.getRandomAddress());
        m.setSalary(2500);
        m.setBonus(800);

        Employee e = new Employee(ng.getRandomName(), ng.getRandomAddress());
        e.setSalary(1500);

        Trainee t = new Trainee(ng.getRandomName(), ng.getRandomAddress());
        t.setSalary(1500);
        t.setTermInDays(65);

        System.out.println(m.toString());
        System.out.println(e.toString());
        System.out.println(t.toString());

        Label lbl_main = new Label();
        lbl_main.setWrapText(true);

        VBox box_main = new VBox();
        box_main.getChildren().addAll(lbl_main);

        lbl_main.setText(m.toString() + "\n" + e.toString() + "\n" + t.toString());

        //Creating a Scene
        Scene scene = new Scene(box_main, 300,300, Color.LIGHTGREY);

        //Setting title to the scene
        stage.setTitle("Personnel Administration");
        //Adding the scene to the stage
        stage.setScene(scene);

        stage.setWidth(400);
        stage.setHeight(400);

        //Displaying the contents of a scene
        stage.show();
    }

}
