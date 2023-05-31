package patterns.Strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 5, 2, 9, 1, 7 };
        displaySorted(new BubbleSort(), arr.clone());
        displaySorted(new MergeSort(), arr.clone());
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
