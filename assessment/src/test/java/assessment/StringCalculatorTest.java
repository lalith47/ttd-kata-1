package assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	void givenAnEmptyStringShouldReturnZero() throws NegativeNumberNotAllowedException{
        assertEquals(0, sc.add(""));

	}

    @Test
	void givenAStringWithOneNumberShouldReturnTheNumber() throws NegativeNumberNotAllowedException{
        assertEquals(1, sc.add("1"));
	}

    @Test
	void givenAStringWith2NumbersShouldReturnTheSumOf2Numbers() throws NegativeNumberNotAllowedException{
        assertEquals(3, sc.add("1,2"));
	}


    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheString() throws NegativeNumberNotAllowedException{
        assertEquals(6, sc.add("1,2,3"));
    }

    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheStringByHandleNewLinesBetweenNumbers() throws NegativeNumberNotAllowedException{
        assertEquals(6, sc.add("1\n2,3"));
        assertEquals(10, sc.add("1\n2,3\n4"));
    }

    @Test
    void given2LinesShouldReturnSumOfAllNumbersInTheStringUsingTheDelimiterInFirstLine() throws NegativeNumberNotAllowedException{
        assertEquals(3, sc.add("//;\n1;2"));
        assertEquals(5, sc.add("//$\n1$2$1\n1"));
    }

    @Test
    void givenStringWithANegativeNumberThrowException(){
        assertThrows(NegativeNumberNotAllowedException.class, () -> sc.add("-1"));
        assertThrows(NegativeNumberNotAllowedException.class, () -> sc.add("//$\n1$2$1\n-1"));
    }


}

