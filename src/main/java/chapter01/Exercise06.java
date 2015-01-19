package chapter01;

import java.util.concurrent.TimeUnit;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise06 {

  public static void main(String[] args) {

    new Thread(uncheck(() -> {
      System.out.println("Zzz...");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("Wake up!");
    })).start();
  }

  public static Runnable uncheck(RunnableEx runner) {
    return () -> {
      try {
        runner.run();
      } catch (Throwable t) {
        t.printStackTrace();
      }
    };
  }

}

@FunctionalInterface
interface RunnableEx {
  void run() throws Throwable;
}
