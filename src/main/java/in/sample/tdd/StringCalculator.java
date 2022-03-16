package in.sample.tdd;

public class StringCalculator {

	public static Integer Add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}
		
		String[] commaSepNumArr = numbers.split(",");
		
		int sum = 0;
		
		for(String commaSepNum : commaSepNumArr) {
			
			if(commaSepNum.contains("\n")) {
				String[] newLineSepArr = commaSepNum.split("\n");
				
				for(String newLineNum : newLineSepArr) {
					Integer nlNum = Integer.parseInt(newLineNum);
					sum += nlNum;
				}
			} else {
				Integer cNum = Integer.parseInt(commaSepNum);
				sum += cNum;
			}
		}
		
		return sum;
	}

}
