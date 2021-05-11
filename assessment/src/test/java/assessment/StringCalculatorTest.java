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
        assertEquals(0, sc.add(""));

	}

    @Test
	void givenAStringWithOneNumberShouldReturnTheNumber(){
        assertEquals(1, sc.add("1"));
	}

    @Test
	void givenAStringWith2NumbersShouldReturnTheSumOf2Numbers(){
        assertEquals(3, sc.add("1,2"));
	}


    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheString(){
        assertEquals(6, sc.add("1,2,3"));
    }

    @Test
    void givenAStringShouldReturnSumOfAllNumbersInTheStringByHandleNewLinesBetweenNumbers(){
        assertEquals(6, sc.add("1\n2,3"));
        assertEquals(10, sc.add("1\n2,3\n4"));
    }

    @Test
    void given2LinesShouldReturnSumOfAllNumbersInTheStringUsingTheDelimiterInFirstLine(){
        assertEquals(3, sc.add("//;\n1;2"));
        assertEquals(5, sc.add("//$\n1$2$1\n1"));
    }


}

