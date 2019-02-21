package asertionandVerify;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {

	@Test
	public void verifyHard() {
		
		Assert.assertEquals(12,13,"value didn't matched");
		
		System.out.println("test completed");
		
	}
	
	@Test
	public void VerifyHard() {
		
		String value="vikash";
		
		Assert.assertTrue(value.contains("v"));
		
		System.out.println("test completed");
	}
}
