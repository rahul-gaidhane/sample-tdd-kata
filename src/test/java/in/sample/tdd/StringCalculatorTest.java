package in.sample.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testStringCalculatorMethodScenario1() {
		assertEquals(0, StringCalculator.Add(""));
		assertEquals(1, StringCalculator.Add("1"));
		assertEquals(3, StringCalculator.Add("1,2"));
	}
	
	@Test
	public void testStringCalculatorMethodScenario2() {
		assertEquals(15, StringCalculator.Add("1,2,3,4,5"));
	}
}
