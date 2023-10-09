/* Rule 12. Thread-Safety Miscellaneous (TSM)
TSM03-J. Do not publish partially initialized objects. Given the non-compliant
code below:*/
class Foo {
  private Helper helper;
 
  public Helper getHelper() {
    return helper;
  }
 
  public void initialize() {
    helper = new Helper(42);
  }
}
 
public class Helper {
  private int n;
 
  public Helper(int n) {
    this.n = n;
  }
  // ...
}
/*Correct the code as shown in theCompliant Solution below:*/
class Foo {
    private final Helper helper;
   
    public Helper getHelper() {
      return helper;
    }
   
    public Foo() {
      // Point 1
      helper = new Helper(42);
      // Point 2
    }
  }