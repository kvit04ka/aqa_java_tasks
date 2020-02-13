package test.java;

import main.java.lesson1.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class L1task1 {
    Task1 t1 = new Task1();





    @Test(dataProvider = "SetVariables")
    public void firstTest(int a, int b, int c, int expected){
    t1.min(a,b,c);
    int actual = t1.min(a,b,c);
     assertEquals(expected, actual);

    }

    @DataProvider(name = "SetVariables")
    public Object[][] SetVariables(){
        return new Object[][]{
                {10, 5, 12, 5},
                {10, 25, 100, 10},
        };
    }

  }
