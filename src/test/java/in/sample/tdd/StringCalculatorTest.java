package in.sample.tdd;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testStringCalculatorMethod() {
		assertEquals(0, StringCalculator.Add(""));
	}
}
