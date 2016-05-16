import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTests {
	FizzBuzzer fizzBuzzer;

  @Before
  public void setUp() throws Exception {
  	fizzBuzzer = new FizzBuzzer();
  }

  @Test
  @Parameters({"3,Fizz", "6,Fizz", "9,Fizz"})
  public void multipleOfThreeShouldReturnFizz(Integer number, String expectedResult) {
  	assertEquals(fizzBuzzer.fizzBuzz(number), expectedResult);
  }

  @Test
  @Parameters({"5,Buzz", "10,Buzz", "20,Buzz"})
  public void multipleOfFiveShouldReturnFizz(Integer number, String expectedResult) {
  	assertEquals(fizzBuzzer.fizzBuzz(number), expectedResult);
  }

  @Test
  @Parameters({"15,FizzBuzz", "30,FizzBuzz", "45,FizzBuzz"})
  public void multipleOfThreeAndFiveShouldReturnFizzBuzz(Integer number, String expectedResult) {
  	assertEquals(fizzBuzzer.fizzBuzz(number), expectedResult);
  }

  @Test
  @Parameters({"15,FizzBuzz", "30,FizzBuzz", "45,FizzBuzz"})
  public void whenTheNumberIsNotMultipleOfFiveOrThreeShouldReturnTheSameNumber(Integer number, String expectedResult) {
  	assertEquals(fizzBuzzer.fizzBuzz(number), expectedResult);
  }
}