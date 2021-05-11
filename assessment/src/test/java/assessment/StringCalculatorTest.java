package assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * StringCalculator
 */
public class StringCalculatorTest {

    private static StringCalculator sc;

    @BeforeAll
    public static void setup(){
        sc = new StringCalculator();
    }

    @Test
	void givenAnEmptyStringShouldReturnZero(){
        String emptyString = "";
        int sum = sc.add(emptyString);
        assertEquals(0, sum);

	}

    @Test
	void givenAStringWithOneNumberShouldReturnTheNumber(){
        String aNumber = "1";
        int sum = sc.add(aNumber);
        assertEquals(1, sum);
	}

    @Test
	void givenAStringWith2NumbersShouldReturnTheSumOf2Numbers(){
        String stringWith2Numbers = "1,2";
        int sum = sc.add(stringWith2Numbers);
        assertEquals(3, sum);
	}


    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheString(){
        String stringWithNumbers = "1,2,3";
        int sum = sc.add(stringWithNumbers);
        assertEquals(6, sum);
    }

    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheStringByHandleNewLinesBetweenNumbers(){
        String stringWithNumbersAndNewline = "1\n2,3";
        String stringWithNumbersAndMultipleNewlines = "1\n2,3\n4";
        int sum = sc.add(stringWithNumbersAndNewline);
        int sum2 = sc.add(stringWithNumbersAndMultipleNewlines);
        assertEquals(6, sum);
        assertEquals(10, sum2);

    }
}

