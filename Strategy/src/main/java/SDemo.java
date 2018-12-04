public class SDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};

        Context context = new Context(new printSumAll());
        System.out.println("||==================||\n"+"|| Sum All = " + context.executeStrategy(arr)+"      ||");

        context = new Context(new printSumEven());
        System.out.println("|| Sum Even = " + context.executeStrategy(arr)+"     ||");

        context = new Context(new printSumNotEven());
        System.out.println("|| Sum Not Even = " + context.executeStrategy(arr)+" ||");
        System.out.println("||==================||==");
        System.out.println("||  EEE  N     N  DD   ||");
        System.out.println("||  E    N N   N  D  D ||");
        System.out.println("||  EEE  N  N  N  D  D ||");
        System.out.println("||  E    N   N N  D  D ||");
        System.out.println("||  EEE  N     N  D D  ||");
        System.out.println("||=====================||");

    }
}
