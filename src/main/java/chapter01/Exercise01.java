package chapter01;

import java.util.Arrays;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise01 {

  public static String[] sortedByLength(String[] src) {
    System.out.println("### Outer lambda: " + Thread.currentThread().getName());
    String[] copy = src.clone();
    Arrays.sort(copy, (first, second) -> {
      System.out.println("### Inner lambda: " + Thread.currentThread().getName());
      return Integer.compare(first.length(), second.length());
    });
    return copy;
  }

}
