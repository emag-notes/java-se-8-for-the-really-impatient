package chapter01;

import java.io.File;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise03 {

  public static String[] files(String dir, String ext) {
    File dirFile = new File(dir);
    if (! dirFile.isDirectory()) {
      throw new IllegalArgumentException("'dir' must be directory");
    }

    return dirFile.list((file, name) -> {
      if (file.isFile() && name.endsWith(ext)) {
        return true;
      } else {
        return false;
      }
    });

  }
}
