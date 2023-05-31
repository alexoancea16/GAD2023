package generics.GenericBinary;

public class Main {
    public static void main(String[] args) {
        Integer[] ascendingArr = {1, 3, 5, 7, 9};
        Integer[] descendingArr = {9, 7, 5, 3, 1};

        try {
            int indexAsc = binarySearch(ascendingArr, 7);
            System.out.println("Found 7 at index: " + indexAsc);

            int indexDesc = binarySearch(descendingArr, 7);
            System.out.println("Found 7 at index: " + indexDesc);
        } catch (ArrayNotSortedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T value) throws ArrayNotSortedException {
        if (!isSorted(arr)) {
            throw new ArrayNotSortedException("Array is not sorted.");
        }

        int left = 0;
        int right = arr.length - 1;

        boolean ascending = arr[left].compareTo(arr[right]) <= 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = value.compareTo(arr[mid]);

            if (cmp == 0) {
                return mid; // Value found
            } else if ((ascending && cmp < 0) || (!ascending && cmp > 0)) {
                right = mid - 1; // Value is smaller, search left half
            } else {
                left = mid + 1; // Value is larger, search right half
            }
        }

        return -1; // Value not found
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
        if (arr.length <= 1) {
            return true;
        }

        boolean ascending = arr[0].compareTo(arr[1]) <= 0;

        for (int i = 2; i < arr.length; i++) {
            int cmp = arr[i - 1].compareTo(arr[i]);
            if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
                return false;
            }
        }

        return true;
    }
}
