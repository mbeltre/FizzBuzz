public class FizzBuzzer {
	private final int THREE = 3;
	private final int FIVE = 5;

	public String fizzBuzz(Integer number) {
		String returnValue = "";
		try {
			if (number%THREE == 0 && number%FIVE == 0) {
				returnValue = "FizzBuzz";
			} else if (number%THREE == 0) {
				returnValue = "Fizz";
			} else if (number%FIVE == 0) {
				returnValue = "Buzz";
			} else {
				returnValue = number.toString();
			}
		} catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		return returnValue;
	}
}