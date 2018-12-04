public class printSumAll implements Strategy{
    @Override
    public int doOperation(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++ ){
            sum+=arr[i];
        }
        return sum;
    }
}
