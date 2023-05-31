package patterns.TemplateMethod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 5, 2, 9, 1, 7 };

        TemplateMethodBubbleSort ascSort = new AscBubbleSort();
        ascSort.sort(arr.clone());
        System.out.println("Ascending Order: " + Arrays.toString(arr));

        TemplateMethodBubbleSort descSort = new DescBubbleSort();
        descSort.sort(arr.clone());
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
