package collection.Leaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Leaders {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 16, 17, 4, 3, 5, 2);

        List<Integer> leaders = findLeaders(numbers);
        System.out.println("Leaders: " + leaders);
    }

    public static List<Integer> findLeaders(List<Integer> numbers) {
        List<Integer> leaders = new ArrayList<>();
        if (numbers.isEmpty()) {
            return leaders;
        }

        int max = numbers.get(numbers.size() - 1); // Last element is always a leader
        leaders.add(max);

        for (int i = numbers.size() - 2; i >= 0; i--) {
            int current = numbers.get(i);
            if (current > max) {
                leaders.add(current);
                max = current;
            }
        }

        Collections.reverse(leaders); // Reverse the list to get the leaders in the original order
        return leaders;
    }
}
