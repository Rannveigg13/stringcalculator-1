package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if((text.contains(",")) && (text.contains("\n"))){
			return sum(splitNewLineAndComma(text));
		}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else if(text.contains("\n")){
			return sum(splitNewLine(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
	
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
	
	private static String[] splitNewLine(String numbers){
		return numbers.split("\n");
	}

	private static String[] splitNewLineAndComma(String numbers){
		return numbers.split("\n|\\,");
	}

}