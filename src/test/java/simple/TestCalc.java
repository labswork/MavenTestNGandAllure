package simple;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by rootid on 12.03.2017.
 */
public class TestCalc {
    Calc calc = new Calc();

    @Test(groups = {"fail test"})
    public void testSum11() throws Exception{
        Assert.assertEquals(2, calc.sum(1, 1));
}
    @Test(groups = {"fail test"})
    public void testSum12() throws Exception{
        Assert.assertEquals(3, calc.sum(1, 2));
    }
    @Test(groups = {"passed test"})
    public void testSum22() throws Exception{
        Assert.assertEquals(4, calc.sum(2, 2));
    }
    @Test(groups = {"fail test"})
    public void testSum23() throws Exception{
        Assert.assertEquals(5, calc.sum(2, 3));
    }
    @Test(groups = {"fail test"})
    public void testSum44() throws Exception{
        Assert.assertEquals(8, calc.sum(4, 4));
    }
}
