package IO.Secretmessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecretMessajeDecoder {
    public static void main(String[] args) {
        String fileName = "message.txt";

        String inputText = readInputTextFromFile(fileName);

        String capitalLetters = extractCapitalLetters(inputText);

        String decodedMessage = decodeSecretMessage(capitalLetters);

        System.out.println(decodedMessage);
    }

    private static String readInputTextFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    private static String extractCapitalLetters(String text) {
        StringBuilder capitalLetters = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalLetters.append(c);
            }
        }
        return capitalLetters.toString();
    }
    private static String decodeSecretMessage(String capitalLetters) {
        return capitalLetters.replace('X', ' ');
    }
}