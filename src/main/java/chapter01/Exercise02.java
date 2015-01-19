package chapter01;

import java.io.File;
import java.util.Arrays;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise02 {

  public static void listSegments(String dir) {
    File dirFile = new File(dir);
    if (!dirFile.isDirectory()) return;

    Arrays
      .stream(dirFile.listFiles())
      .filter(file -> file.isDirectory())
      .forEach(file -> {
        System.out.println(file.getName());
      });
  }
}
