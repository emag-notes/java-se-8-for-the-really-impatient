package chapter01;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise05 {

  public static void main(String[] args) {

    // 6 Lines
    new Button().setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        System.out.println(event);
      }
    });

    // 3 Lines
    new Button().setOnAction((event) -> {
      System.out.println(event);
    });

    // 1 Lines
    new Button().setOnAction(System.out::println);
  }
}
