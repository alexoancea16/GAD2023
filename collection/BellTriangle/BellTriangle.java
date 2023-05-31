package collection.BellTriangle;

public class BellTriangle {
    public static void main(String[] args) {
        int n = 5;
        int[][] triangle = generateBellTriangle(n);

        // Print the generated triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] generateBellTriangle(int n) {
        int[][] triangle = new int[n][n];
        triangle[0][0] = 1;

        for (int i = 1; i < n; i++) {
            triangle[i][0] = triangle[i - 1][i - 1];

            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i][j - 1] + triangle[i - 1][j - 1];
            }
        }

        return triangle;
    }
}
