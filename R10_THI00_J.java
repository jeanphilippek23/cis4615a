/* Rule 10. Thread APIs (THI)
THI00-J. Do not invoke Thread.run(). Given the non-compliant
code below:*/
public final class Foo implements Runnable {
    @Override public void run() {
      // ...
    }
   
    public static void main(String[] args) {
      Foo foo = new Foo();
      new Thread(foo).run();
    }
  }
/*Correct the code as shown in theCompliant Solution below:*/
  public final class Foo implements Runnable {
    @Override public void run() {
      // ...
    }
   
    public static void main(String[] args) {
      Foo foo = new Foo();
      new Thread(foo).run();
    }
  }