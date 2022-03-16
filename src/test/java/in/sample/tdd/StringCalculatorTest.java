package in.sample.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void testStringCalculatorMethodScenario1() throws Exception {
		assertEquals(0, StringCalculator.Add(""));
		assertEquals(1, StringCalculator.Add("1"));
		assertEquals(3, StringCalculator.Add("1,2"));
	}
	
	@Test
	public void testStringCalculatorMethodScenario2() throws Exception {
		assertEquals(15, StringCalculator.Add("1,2,3,4,5"));
		assertEquals(54321, StringCalculator.Add("1,20,300,4000,50000"));
	}
	
	@Test
	public void testStringCalculatorMethodScenario3() throws Exception {
		assertEquals(6, StringCalculator.Add("1\n2,3"));
		assertEquals(54321, StringCalculator.Add("1,20\n300,4000\n50000"));
		assertEquals(15, StringCalculator.Add("1,2\n3,4\n5"));
	}
	
	@Test
	public void testStringCalculatorMethodScenario4() throws Exception {
		assertEquals(3, StringCalculator.Add("//;\n1;2"));
		assertEquals(54321, StringCalculator.Add("//:\n1:20\n300:4000\n50000"));
		assertEquals(15, StringCalculator.Add("//>\n1>2\n3>4\n5"));
	}
	
	@Test
	public void testStringCalculatorMethodScenario5() {
		assertThrows(Exception.class, () -> StringCalculator.Add("//;\n1;-2"));
		assertThrows(Exception.class, () -> StringCalculator.Add("//:\n1:20\n-300:4000\n-50000"));
	}
}
