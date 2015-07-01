
public class StringAction extends Action<String> {
    @Override
    public String function(String a, String b, int action) throws Exception {
        if (action == 0) {
            return a + b;
        }
        throw new Exception("Wrong action: " + action + ". Available action 0.");
    }
}
