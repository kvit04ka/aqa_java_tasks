package test.java;

import main.java.lesson1.Task2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class L1Task2 {
     private Task2 t2;

    @BeforeMethod
    public void beforeTest() {
       Task2 t2 = new Task2();
    }

    @Test
    public void Test1() {

        String name = "Natalia";
        String x = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
        assertEquals(x, t2.namePrint());
    }

    @Test
    public void Test2() {

        String name = "Natalia";
        String x = "";
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
        assertNotEquals(x, t2.namePrint());
    }


}

