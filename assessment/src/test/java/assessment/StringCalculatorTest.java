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

    
}