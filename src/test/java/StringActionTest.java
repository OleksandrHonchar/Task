import junit.framework.Assert;
import org.junit.Test;


public class StringActionTest {
    StringAction stringAction = new StringAction();

    @Test
    public void testAdd() throws Exception {
        String result = stringAction.function("12", "ab");
        Assert.assertEquals("12ab", result);
    }

}
