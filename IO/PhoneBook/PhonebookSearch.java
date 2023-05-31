package IO.PhoneBook;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class PhonebookSearch {
    public static void main(String[] args) {
        String phonebookFile = "phonebook.txt";
        Map<String, String> phonebook = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(phonebookFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    phonebook.put(name, phoneNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String abbeyNumber = phonebook.get("Abbey");
        String abdulNumber = phonebook.get("Abdul");

        if (abbeyNumber != null) {
            System.out.println("Abbey's phone number: " + abbeyNumber);
        } else {
            System.out.println("Abbey's phone number not found.");
        }

        if (abdulNumber != null) {
            System.out.println("Abdul's phone number: " + abdulNumber);
        } else {
            System.out.println("Abdul's phone number not found.");
        }
    }
}
