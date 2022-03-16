package in.sample.tdd;

public class StringCalculator {

	public static Integer Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}
		
		Integer num = Integer.parseInt(numbers);
		
		return num;
	}

}
