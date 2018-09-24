import java.util.ArrayList;
import java.util.Collections;

public class PocketSort implements ISorting {
    public int[] sort(int[] array) {
        int high = array[0];
        int low = array[0];
        int  bucketCount = 3; //количество карманов

        for (int i = 1; i < array.length; i++) { //найти диапазон входных элементов
            if (array[i] > high) high = array[i];
            if (array[i] < low) low = array[i];
        }
            double interval = ((double)(high - low + 1))/bucketCount; //диапазон одного кармана

        ArrayList<Integer> buckets[] = new ArrayList[bucketCount];

            for (int i = 0; i < bucketCount; i++) { //инициализация кармана
                buckets[i] = new ArrayList();
            }

            for (int i = 0; i < array.length; i++) { //переместить входной массив
                buckets[(int)((array[i] - low)/interval)].add(array[i]);
            }

            int pointer = 0;

            for (int i = 0; i < buckets.length; i++) {
                Collections.sort(buckets[i]); //Сортировка слиянием
                    for (int j = 0; j < buckets[i].size(); j++) { //объединить карманы
                        array[pointer] = buckets[i].get(j);
                        pointer++;
                    }
            }

        return array;
    }
}
