public class printSumNotEven implements Strategy{
    @Override
    public int doOperation(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i]%2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
