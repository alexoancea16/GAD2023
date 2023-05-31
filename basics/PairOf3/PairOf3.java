package basics.PairOf3;

public class PairOf3 {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, 2};
        int tripletCount = countZeroSumTriplets(arr);
        System.out.println("Number of triplets with a sum of 0: " + tripletCount);
    }

    public static int countZeroSumTriplets(int[] arr) {
        int tripletCount = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        tripletCount++;
                    }
                }
            }
        }

        return tripletCount;
    }
}
