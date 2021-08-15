package Tut4;

import org.junit.Test;

public class TestCalc{

    @Test
    public void testadd(){
        System.out.println(Calc.add(5,7));
    }
    @Test
    public void testsub(){
        System.out.println(Calc.subtract(5,7));
    }
}
