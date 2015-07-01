
public class Main {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("result is :" + new NumbersAction().function(3, 1, 3));
            System.out.println("result is :" + new StringAction().function("3", "0", 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}