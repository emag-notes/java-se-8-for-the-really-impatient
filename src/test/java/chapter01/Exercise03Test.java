package chapter01;

import org.junit.Test;

import java.util.Arrays;

public class Exercise03Test {

  @Test
  public void test() throws Exception {
    System.out.println(Arrays.asList(Exercise03.files("/tmp", "txt")));
  }

}