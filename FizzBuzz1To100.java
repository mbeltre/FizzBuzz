public class FizzBuzz1To100 {
	public static void main(String[] args) {
		FizzBuzzer fizzBuzzer = new FizzBuzzer();
		for (int i = 1; i <=100; i++) {
			System.out.println(fizzBuzzer.fizzBuzz(i));
		}
	}
}