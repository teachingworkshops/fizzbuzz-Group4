package fizzbuzz.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
		
	final FizzBuzz test = new FizzBuzz();
	
    @Test
    public void negativeNumberTest() {
        assertEquals(-1, String.format(""));
    }

}
