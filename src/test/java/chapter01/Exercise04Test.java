package chapter01;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

public class Exercise04Test {

  @Test
  public void test() throws Exception {
    System.out.println(Arrays.asList(Exercise04.sortWithDirsFirst(new File("/tmp").listFiles())));
  }
}