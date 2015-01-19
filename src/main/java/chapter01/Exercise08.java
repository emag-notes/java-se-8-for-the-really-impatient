package chapter01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise08 {

  public static void main(String[] args) {
    String[] names = {"Peter", "Paul", "Mary"};
    List<Runnable> runners1 = new ArrayList<>();
    for (String name : names) {
      runners1.add(() -> {
        System.out.println("foreach: " + name);
      });
    }
    runners1.forEach(runner -> {
      new Thread(runner).start();
    });

    List<Runnable> runners2 = new ArrayList<>();
    for (int i = 0; i < names.length; i++) {
      final int tmpI = i;
      runners2.add(() -> {
        System.out.println("for: " + names[tmpI]);
      });
    }
    runners2.forEach(runner -> {
      new Thread(runner).start();
    });
  }
}
