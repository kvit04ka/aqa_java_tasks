package test.java;

import main.java.lesson1.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class L1Task5 {
    Task5 t5 = new Task5();
    @Test(enabled=true)
    public void thirdTest(){
        String expected = "!!!dlrow olleH";
        String actual = t5.reverse();
         assertEquals(actual, expected);

    }
}
