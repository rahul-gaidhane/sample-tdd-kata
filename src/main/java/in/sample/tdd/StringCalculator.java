package in.sample.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {

	public static Integer Add(String numbers) throws Exception {
		
		if(numbers.isBlank()) {
			return 0;
		}
		
		String delim = ",";		//default delimiter
				
		if(numbers.startsWith("//")) {	//if has defined delimiter
			delim = getDelimiter(numbers);
			numbers = getOperativeString(numbers);
		}
		
		String[] commaSepNumArr = numbers.split(delim);
		
		int sum = 0;
		
		List<String> negativeNums = new ArrayList<>();
		
		for(String commaSepNum : commaSepNumArr) {
			
			if(commaSepNum.contains("\n")) {
				String[] newLineSepArr = commaSepNum.split("\n");
				
				for(String newLineNum : newLineSepArr) {
					Integer nlNum = Integer.parseInt(newLineNum);
					
					if(nlNum < 0) {
						negativeNums.add(newLineNum);
					}
					sum += nlNum;
				}
			} else {
				Integer cNum = Integer.parseInt(commaSepNum);
				
				if(cNum < 0) {
					negativeNums.add(commaSepNum);
				}
				sum += cNum;
			}
		}
		
		if(negativeNums.size() > 0) {
			String negativeNumsString = negativeNums.stream().collect(Collectors.joining(","));
			throw new Exception("negatives not allowed " + negativeNumsString);
		}
		return sum;
	}

	private static String getOperativeString(String numbers) {
		String[] newLineSep = numbers.split("\n");
		
		newLineSep = Arrays.copyOfRange(newLineSep, 1, newLineSep.length);
		
		return Arrays.stream(newLineSep).collect(Collectors.joining("\n"));
	}

	private static String getDelimiter(String numbers) {
		String[] newLineSep = numbers.split("\n");
		
		String delim = newLineSep[0].replace("//", "");
		
		return delim;
	}

}
