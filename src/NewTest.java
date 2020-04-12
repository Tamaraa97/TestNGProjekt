import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NewTest {
	
@AfterClass
public void a() {
	System.out.println("a");	  
  }
@AfterMethod
public void b() {
	System.out.println("b");
}
@AfterClass 
public void c() {
	System.out.println("c");
}
@Test
public void e() {
	System.out.println("e");
}
@Test
public void d() {
	System.out.println("d");
}
@Test 
public void f() {
	System.out.println("f");
}

}
