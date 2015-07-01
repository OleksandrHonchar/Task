
public class Main {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("result is :" + new AddOperation().function(3,2));
            System.out.println("result is :" + new SubtractOperation().function(3, 2));
            System.out.println("result is :" + new MultiplyOperation().function(3, 2));
            System.out.println("result is :" + new DivideOperation().function(3,2));
            System.out.println("result is :" + new StringAction().function("3", "0"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}