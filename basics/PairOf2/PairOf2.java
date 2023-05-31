package basics.PairOf2;

public class PairOf2 {

    public static void main(String[] args) {
        int[] arr = {3, 2, -3, -2, 3, 0};
        int pairCount = countZeroSumPairs(arr);
        System.out.println("Number of pairs with a sum of 0: " + pairCount);
    }
    public static int countZeroSumPairs(int[] arr) {
        int pairCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    pairCount++;
                    break;
                }
            }
        }
        return pairCount;
    }
}
