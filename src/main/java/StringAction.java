public class StringAction extends Action<String> {

    @Override
    protected String function(String a, String b) throws Exception {
        return a + b;
    }
}
