package IO.Occurence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        System.out.println("Da");
    }
        /*String filePath = "large_text.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter("[^a-zA-Z]+");

            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        List<Map.Entry<String, Integer>> sortedCounts = new ArrayList<>(wordCounts.entrySet());
        sortedCounts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Top 10 word counts:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedCounts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count == 10) {
                break;
            }
        }
    }*/
}
