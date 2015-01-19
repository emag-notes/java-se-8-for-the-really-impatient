package chapter01;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Exercise01Test extends TestCase {

  @Test
  public void test() throws Exception {
    // Setup
    String[] src = {"efg", "abcd", "hi"};
    String[] expected = {"hi", "efg", "abcd"};

    // Exercise & Verify
    assertThat(Exercise01.sortedByLength(src), is(expected));

  /*
   * Ans. Same thread
   *
   * ### Outer lambda: main
   * ### Inner lambda: main
   * ### Inner lambda: main
   * ### Inner lambda: main
   * ### Inner lambda: main
   */
  }
}