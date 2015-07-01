public class NumbersAction extends Action<Integer> {

    @Override
    public Integer function(Integer a, Integer b, int action) throws Exception {
       if (action == 0) {
            return a + b;
        } else if (action == 1) {
            return a - b;
        } else if (action == 2) {
            return a * b;
        } else if (action == 3) {
           try {
               return a / b;
           } catch (ArithmeticException e) {
               throw e;
           }
       }

        throw new Exception("Wrong action: " + action + ". Available actions 0-3.");
    }
}
