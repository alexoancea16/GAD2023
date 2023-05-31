package collection.PascalTriangle;

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle<T> {
    private List<List<T>> triangle;

    public PascalTriangle(int numRows) {
        triangle = generateTriangle(numRows);
    }

    public List<List<T>> getTriangle() {
        return triangle;
    }

    private List<List<T>> generateTriangle(int numRows) {
        List<List<T>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<T> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add((T) Integer.valueOf(1));
                } else {
                    List<T> prevRow = triangle.get(i - 1);
                    T prev1 = prevRow.get(j - 1);
                    T prev2 = prevRow.get(j);
                    T sum = add(prev1, prev2);
                    row.add(sum);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    private T add(T num1, T num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            Integer result = (Integer) num1 + (Integer) num2;
            return (T) result;
        } else if (num1 instanceof Double && num2 instanceof Double) {
            Double result = (Double) num1 + (Double) num2;
            return (T) result;
        } else {
            throw new UnsupportedOperationException("Unsupported type for addition");
        }
    }

    public static void main(String[] args) {
        PascalTriangle<Integer> triangle = new PascalTriangle<>(5);
        List<List<Integer>> pascalTriangle = triangle.getTriangle();

        for (List<Integer> row : pascalTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
