import org.junit.Assert;
import org.junit.Test;


public class NumbersActionTest {

    @Test
    public void testAdd() throws Exception {
        AddOperation addOperation = new AddOperation();
        int result = addOperation.function(5, 2);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testSubtract() throws Exception {
        SubtractOperation subtractOperation = new SubtractOperation();
        int result = subtractOperation.function(5, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiply() throws Exception {
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        int result = multiplyOperation.function(3, 2);
        Assert.assertEquals(6, result);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivideByZero() throws Exception {
        DivideOperation divideOperation = new DivideOperation();
        divideOperation.function(4, 0);
    }

    @Test
    public void testDivide() throws Exception {
        DivideOperation divideOperation = new DivideOperation();
        int result = divideOperation.function(4, 2);
        Assert.assertEquals(2, result);
    }

}
