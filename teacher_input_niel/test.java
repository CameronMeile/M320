package teacher_input_niel;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;



public class test {

    Calculator calculator;

    @BeforeEach                                         
    void setUp() {
        calculator = new Calculator();
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5),     
                "Regular multiplication should work");  
    }    
}

