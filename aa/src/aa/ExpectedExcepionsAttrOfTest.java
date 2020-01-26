package aa;

import org.testng.annotations.Test;

public class ExpectedExcepionsAttrOfTest {
  @Test(expectedExceptions=ArithmeticException.class) //if the exception dont occur afetr executing, then the test case will be marked as failed
  public void f() {															//means expectedExceptions must occur if we defined as attibute of @Test.
	  System.out.println("hello");
	  int i=10/0;
  }
}
