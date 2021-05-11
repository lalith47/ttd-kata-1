package assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * StringCalculator
 */
public class StringCalculatorTest {


    @Test
	void givenAnEmptyStringShouldReturnZero(){
        String emptyString = "";
		StringCalculator sc = new StringCalculator();
        int sum = sc.add(emptyString);
        assertEquals(0, sum);

	}

    @Test
	void givenAStringWithOneNumberShouldReturnTheNumber(){
        String aNumber = "1";
		StringCalculator sc = new StringCalculator();
        int sum = sc.add(aNumber);
        assertEquals(1, sum);
	}

    @Test
	void givenAStringWith2NumbersShouldReturnTheSumOf2Numbers(){
        String stringWith2Numbers = "1,2";
		StringCalculator sc = new StringCalculator();
        int sum = sc.add(stringWith2Numbers);
        assertEquals(3, sum);
	}


    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheString(){
        String stringWithNumbers = "1,2,3";
        StringCalculator sc = new StringCalculator();
        int sum = sc.add(stringWithNumbers);
        assertEquals(6, sum);

    }

    
}