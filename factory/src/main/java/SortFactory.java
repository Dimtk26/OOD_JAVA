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
        int[] arr0 = {2, 5, 7, 8, 3, 0, 2, 1, 7, 3, 5};
        int[] arr1 = {4, 5, 9, 2, 3, 4, 7, 3, 1, 5, 4, 2, 2, 1, 4, 6, 0};
        int[] arr2 = {1, 3, 5, 2, 6, 6, 4, 1, 2, 3, 4, 7, 2, 4, 5, 9, 5, 11, -1};

        System.out.println("==============Пирамидальная сортирока==============");
        printArr(arr0);
       getSortByType("Pyramid").sort(arr0);
        printArr(arr0);
        System.out.println("================Карманная сортирока================");
        printArr(arr1);
        getSortByType("Pocket").sort(arr1);
        printArr(arr1);
        System.out.println("==================Сортирока Шелла==================");
        printArr(arr2);
        getSortByType("Shell").sort(arr2);
        printArr(arr2);
    }
}
/*5/6/9*/