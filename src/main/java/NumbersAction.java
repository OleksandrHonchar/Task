public class NumbersAction extends Action<Integer> {

    @Override
    public Integer function(Integer a, Integer b, int action) throws Exception {
        switch (action) {
            case 0:
                return a + b;

            case 1:
                return a - b;

            case 2:
                return a * b;

            case 3:
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    throw e;
                }
        }
        throw new Exception("Wrong action: " + action + ". Available actions 0-3.");
    }
}
