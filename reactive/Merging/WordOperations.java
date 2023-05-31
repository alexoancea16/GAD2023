package Merging;

import java.util.Arrays;
import java.util.List;

public class WordOperations {
    private static List<String> words1 = Arrays.asList(
            "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    private static List<String> words2 = Arrays.asList(
            "the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

    public static void main(String[] args) {
        displayLetters(words1);
        findMissingLetters(words1);
        findingMissingLetter(words1);
        restoringMissingLetter(words1);

        displayLetters(words2);
        findMissingLetters(words2);
        findingMissingLetter(words2);
        restoringMissingLetter(words2);
    }

    static void displayLetters(List<String> words) {
        int count = 1;
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                System.out.println(count + ". " + letter);
                count++;
            }
        }
    }

    static void findMissingLetters(List<String> words) {
        boolean[] letters = new boolean[26];
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                letters[Character.toLowerCase(letter) - 'a'] = true;
            }
        }

        int count = 1;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (!letters[Character.toLowerCase(letter) - 'a']) {
                System.out.println(count + ". " + letter);
                count++;
            }
        }
    }

    static void findingMissingLetter(List<String> words) {
        boolean[] letters = new boolean[26];
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                letters[Character.toLowerCase(letter) - 'a'] = true;
            }
        }

        for (String word : words) {
            for (char letter = 'a'; letter <= 'z'; letter++) {
                if (!letters[Character.toLowerCase(letter) - 'a'] && !word.toLowerCase().contains(String.valueOf(letter))) {
                    System.out.println(word.length() + 1 + ". " + letter);
                }
            }
        }
    }

    static void restoringMissingLetter(List<String> words) {
        boolean[] letters = new boolean[26];
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                letters[Character.toLowerCase(letter) - 'a'] = true;
            }
        }

        for (String word : words) {
            StringBuilder restoredWord = new StringBuilder(word.toLowerCase());
            for (char letter = 'a'; letter <= 'z'; letter++) {
                if (!letters[Character.toLowerCase(letter) - 'a']) {
                    restoredWord.append(letter);
                }
            }
            System.out.println(restoredWord);
        }
    }
}

