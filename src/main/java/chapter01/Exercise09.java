package chapter01;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Yoshimasa Tanabe
 */
public interface Exercise09<E> extends Collection<E> {

  default void forEachIf(Consumer<E> action, Predicate<E> filter) {
    this.stream()
      .filter(filter)
      .forEach(action);
  }

}
