package chapter01;

/**
 * @author Yoshimasa Tanabe
 */
public class Exercise11 implements I, J {
  @Override
  public void f() {
    System.out.println("f:Exercise11");
  }
  @Override
  public void g() {
    // I が default でも J が抽象なので実装する必要あり
    System.out.println("g:Exercise11");
  }
  @Override
  public void h() {
    // I が static でも J が抽象なので実装する必要あり
    System.out.println("h:Exercise11");
  }
  @Override
  public void i() {
    // I か J かオーバーライドするか選ぶ
    System.out.println("i:Exercise11");
  }
}

interface I {
  void f();
  default void g() {
    System.out.println("g:I");
  }
  static void h() {
    System.out.println("h:I");
  };

  default void i() {
    System.out.println("i:I");
  }
}

interface J {
  void f();
  void g();
  void h();
  default void i() {
    System.out.println("i:J");
  };
}
