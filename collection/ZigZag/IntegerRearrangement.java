package collection.ZigZag;
import java.util.Arrays;
import java.util.List;
public class IntegerRearrangement {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 3, 7, 8, 6, 2, 1);
        List<Integer> output = rearrangeIntegers(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    private static List<Integer> rearrangeIntegers(List<Integer> input) {
        Integer[] arr = input.toArray(new Integer[0]);

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Rearrange the integers following the rule
        for (int i = 1; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1);
        }

        return Arrays.asList(arr);
    }

    private static void swap(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
