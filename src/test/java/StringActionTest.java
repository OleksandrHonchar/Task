import junit.framework.Assert;
import org.junit.Test;


public class StringActionTest {
    StringAction stringAction = new StringAction();

    @Test
    public void testAdd() throws Exception {
        String result = stringAction.function("12", "ab", 0);
        Assert.assertEquals("12ab", result);
    }

    @Test(expected = java.lang.Exception.class)
    public void testAvailableAction() throws Exception {
        stringAction.function("12", "ab", 1);
    }
}
