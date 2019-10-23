import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void insertionSort(List<Integer> input) {
        insertionSortHelper(input, 1);
    }

    private static void insertionSortHelper(List<Integer> input, int i) {
        if (i < input.size()) {
            int key = input.get(i);
            insertionSortHelperInner(input, key, i, i - 1);

            insertionSortHelper(input, i + 1);
        }
    }

    private static void insertionSortHelperInner(
            List<Integer> input, int key, int i, int j) {
        if (j >= 0 && input.get(j) > key) {
            input.set(j + 1, input.get(j));
            input.set(j, key);

            insertionSortHelperInner(input, key, i, j - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 4, 3, 6, 0);
        insertionSort(input);
        System.out.println(input);
    }
}
