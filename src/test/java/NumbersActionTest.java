import org.junit.Assert;
import org.junit.Test;


public class NumbersActionTest {
    NumbersAction numbersAction = new NumbersAction();

    @Test
    public void testAdd() throws Exception {
        int result = numbersAction.function(5, 2, 0);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testSubtract() throws Exception {
        int result = numbersAction.function(5, 2, 1);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiply() throws Exception {
        int result = numbersAction.function(3, 2, 2);
        Assert.assertEquals(6, result);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivideByZero() throws Exception {
        numbersAction.function(4, 0, 3);
    }

    @Test
    public void testDivide() throws Exception {
        int result = numbersAction.function(4, 2, 3);
        Assert.assertEquals(2, result);
    }

    @Test(expected = java.lang.Exception.class)
    public void testAvailableAction() throws Exception {
        numbersAction.function(4, 2, 4);
    }
}
