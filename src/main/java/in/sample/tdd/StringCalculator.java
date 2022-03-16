package in.sample.tdd;

public class StringCalculator {

	public static Integer Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}
		
		String[] commaSepNumArr = numbers.split(",");
		
		int sum = 0;
		
		for(String commaSepNum : commaSepNumArr) {
			Integer num = Integer.parseInt(commaSepNum);
			sum += num;
		}
		
		return sum;
	}

}
