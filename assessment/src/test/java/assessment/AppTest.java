package assessment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testGreeting() {
		String greeting = App.greeting();
		assertEquals(greeting, "hello world");
	}

}
