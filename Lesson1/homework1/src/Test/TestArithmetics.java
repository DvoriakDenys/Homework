package Test;

import Calculation.Arithmetics;
import org.junit.*;

public class TestArithmetics {
    private Arithmetics arithmetics;

    @Before
    public void runT() {
        arithmetics = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = arithmetics.add(10, 5);
        Assert.assertFalse("Something went wrong with method add", res != 15);
    }

    @Test
    public void testDeduct() {
        double res = arithmetics.deduct(10, 5);
        Assert.assertTrue("Something went wrong with method deduct", res == 5);
    }

    @Test
    public void testMult() {
        double res = arithmetics.mult(10, 5);
        Assert.assertNotNull("Odject of Arithmetics can't be null", arithmetics);
    }

    @Test
    @Ignore
    public void testDiv() {
        double res = arithmetics.div(10, 5);
        if (res != 2) Assert.fail();
    }
}
