package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	StringCalculator stringCalculator = new StringCalculator();
    @Test
    void shouldcalc() {
        checkAdd("",0);
        checkAdd("1",1);
        checkAdd("2",2);
        checkAdd("1,2",3);
      
    }
	private void checkAdd(String string, int i) {
		assertEquals(i,stringCalculator.add(string));
		
	}

   
}
