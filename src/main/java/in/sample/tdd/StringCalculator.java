package in.sample.tdd;

public class StringCalculator {

	public static Integer Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}
		
		String[] numArr = numbers.split(",");
		
		Integer num1 = Integer.parseInt(numArr[0]);
		
		Integer num2 = 0;
		
		if(numArr.length == 2) {
			num2 = Integer.parseInt(numArr[1]);
		}
		
		return num1 + num2;
	}

}
