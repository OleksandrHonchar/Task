public class AddOperation extends Action<Integer> {

    @Override
    protected Integer function(Integer a, Integer b) throws Exception {
        return a + b;
    }
}
