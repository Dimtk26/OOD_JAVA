public class PyramidSort implements ISorting {
    public int[] sort(int[] arr) {
        int n = arr.length;

        // Сборка кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекают элемент из кучи
        for (int i=n-1; i>=0; i--)
        {
            // Переместить текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // вызвать max пирам. на уменьшенной куче
            heapify(arr, i, 0);
        }
        return arr;
    }
  // Чтобы пирамидальное поддерево, корневое с узлом i, которое
  // индекс в arr []. n - размер кучи
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Инициализировать наибольший из них как root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        //Если левый отросток больше, чем корень
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый отросток больше, чем самый большой
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если наибольшее не является корневым
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            //Рекурсивно пирамидальное затронутое поддерево
            heapify(arr, n, largest);
        }
    }
}
