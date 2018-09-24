public class SortFactory {
    public static ISorting getSortByType(String sortType) {
        switch (sortType) {
            case "Pyramid": {
                return new PyramidSort();//Пирамидальная
            }
            case "Pocket": {
                return new PocketSort();//Карманная
            }
            case "Shell": {
                return  new ShellSort();//Шелла
            }
            default: {
                throw new IllegalArgumentException("This sorting type could not be found");
            }
        }
    }

    public static void printArr(int[] Arr){
        for(int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 3, 0};

        printArr(arr);
       getSortByType("Pocket").sort(arr);

        printArr(arr);
    }
}
/*5/6/9*/