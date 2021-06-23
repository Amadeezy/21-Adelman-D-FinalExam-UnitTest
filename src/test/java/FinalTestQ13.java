import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FinalTestQ13 {

	
	
	//test if negative numbers throw exception
	@Test
	void testNegative() {
		StringCalculator calc = new StringCalculator();
		Assertions.assertThrows(IllegalArgumentException.class,()-> {calc.add("-1,2");});
	}
	
	//tests if values >= 1000 are ignored
	@Test
	void testOver1000() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1,calc.add("1,1000"));
	}
	

}
