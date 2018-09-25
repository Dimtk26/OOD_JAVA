import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort  {
    @Test
    public void PyramidSort() {
        int[] arr0 = {4, 1, 6, 2 , 5,-2, 8};
        int[] res0 = {-2, 1, 2, 4, 5, 6, 8};
        SortFactory.getSortByType("Pyramid").sort(arr0);
        assertArrayEquals(arr0,res0);
    }
    @Test
    public void PocketSort() {
        int[] arr1 = {1 ,3 ,5 ,2 ,6 ,6 ,4 ,1 ,2 ,3 ,4 ,7 ,2 ,4 ,5 ,9 ,5 ,11 ,-1 };
        int[] res1 = {-1 ,1 ,1 ,2 ,2, 2, 3, 3 ,4 ,4 ,4 ,5 ,5 ,5 ,6 ,6 ,7 ,9 ,11};
        SortFactory.getSortByType("Pocket").sort(arr1);
        assertArrayEquals(arr1,res1);
    }

    @Test
    public void ShellSort() {
        int[] arr2 = {1 ,-3 ,5 ,5 ,6 ,6 ,4 ,1 ,2 ,3 ,4 ,7 ,2 ,4 ,5 ,9 ,5 ,11 ,-1 };
        int[] res2 = {-3,-1 ,1 ,1  ,2, 2, 3,4 ,4 ,4 ,5 ,5 ,5 ,5 ,6 ,6 ,7 ,9 ,11};
        SortFactory.getSortByType("Shell").sort(arr2);
        assertArrayEquals(arr2,res2);
    }

}
