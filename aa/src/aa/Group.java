package aa;

import org.testng.annotations.Test;

public class Group {
  @Test(priority=1, groups="smoke")
  public void f() {
	  System.out.println("f method with smoke");
  }
  @Test(priority=2, groups="smoke")
  public void f1() {
	  System.out.println("f1 method with smoke");

  }
  @Test(priority=3, groups="critical")
  public void f2() {
	  System.out.println("f2 method with crirtical");

  }
}
