package chapter01;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise07 {

  public static Runnable andThen(Runnable r1, Runnable r2) {
    new Thread(r1).start();
    return r2;
  }
}
