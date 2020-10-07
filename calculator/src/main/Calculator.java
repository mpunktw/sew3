package main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;


public class Calculator extends Application {
  Label lbl_main = new Label();
  boolean initial = true;
  int add = 0;
  
  public static void main(String[] args) {
    // Launch the JavaFX application
    Application.launch(args);
  }
  
  @Override
  public void start(Stage stage) {
    VBox box_main = new VBox();
    
    lbl_main.setStyle("-fx-font-size:45;-fx-font-weight: bold");
    lbl_main.setText("0");
    GridPane grid = new GridPane();
    
    EventHandler<MouseEvent> btn_handler = new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
        Object node = e.getSource(); //returns the object that generated the event
        //since the returned object is a MemoryButton we can do a typecast
        Button btn = (Button) node;
        String s = btn.getText();
        
        String display = lbl_main.getText();
  
        if (s.equals("=")) {
          add += Integer.parseInt(display);
          lbl_main.setText(String.valueOf(add));
          add = 0;
          initial = true;
        }
        else {
          if (s.equals("+")) {
            add += Integer.parseInt(display);
            initial = true;
          }
          else {
            if (initial) {
              display = "";
              initial = false;
            }
            int value = Integer.parseInt(s);
            display += String.valueOf(value);
            lbl_main.setText(display);
          }
        }
      }
    };
    
    ArrayList<String> buttons = new ArrayList<String>();
    buttons.add("7");
    buttons.add("8");
    buttons.add("9");
    buttons.add("4");
    buttons.add("5");
    buttons.add("6");
    buttons.add("1");
    buttons.add("2");
    buttons.add("3");
    buttons.add("+");
    buttons.add("0");
    buttons.add("=");
    
    for (String s : buttons) {
      Button btn = new Button();
      int index = buttons.indexOf(s);
      grid.add(btn, index % 3, index / 3);
      btn.setText(s);
      btn.setMinWidth(100);
      btn.setMinHeight(100);
      btn.setStyle("-fx-font-size:45;-fx-font-weight: bold");
      btn.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler);
    }
    
    box_main.getChildren().addAll(lbl_main, grid);
    
    //Creating a Scene
    Scene scene = new Scene(box_main, 300, 300, Color.LIGHTGREY);
    
    //Setting title to the scene
    stage.setTitle("Calculator");
    //Adding the scene to the stage
    stage.setScene(scene);
    
    stage.setWidth(400);
    stage.setHeight(600);
    
    //Displaying the contents of a scene
    stage.show();
  }
}