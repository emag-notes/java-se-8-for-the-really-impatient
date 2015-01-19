package chapter01;

import org.junit.Test;

public class Exercise07Test {

  @Test
  public void test() throws Exception {
    new Thread(Exercise07.andThen(() -> {
      System.out.println("###1");
    }, () -> {
      System.out.println("###2");
    })).start();
  }

}