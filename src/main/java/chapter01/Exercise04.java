package chapter01;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise04 {

  public static File[] sortWithDirsFirst(File[] files) {
    List<File> dirList = Arrays.stream(files)
      .filter(file -> file.isDirectory())
      .sorted()
      .collect(Collectors.toList());

    List<File> fileList = Arrays.stream(files)
      .filter(file -> file.isFile())
      .sorted()
      .collect(Collectors.toList());

    dirList.addAll(fileList);
    return dirList.toArray(new File[dirList.size()]);
  }

}
