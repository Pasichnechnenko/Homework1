package UnitTests;

import HW.HW1;
import org.junit.Assert;
import org.junit.Test;

public class TestHW1 {

    @Test
    public void testHW1(){

        double exp = 800.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals (exp, act, 0);
    }

    @Test
    public void testHW2(){

        double exp = 1000.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void testHW3(){

        double exp = 600.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void testHW4(){

        double exp = 200.0;
        double act = HW1.Ticket(5);
        Assert.assertEquals(exp, act, 0);
    }
}
