import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Proba {
	
	
 @Test
  public void f() {
	  int[] n = new int[] { 20, 98, 12, 7, 35 };
	 	int min = Arrays.stream(n).min().getAsInt();
	 	assertEquals(7,min);
	 	
  }
}
