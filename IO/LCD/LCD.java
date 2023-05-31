package IO.LCD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LCD {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String number = reader.readLine();
            String lcdNumber = convertToLCD(number);

            writer.write(lcdNumber);
            System.out.println("LCD style number has been written to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertToLCD(String number) {
        StringBuilder lcdNumber = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            for (char digit : number.toCharArray()) {
                switch (digit) {
                    case '1':
                        lcdNumber.append(getLCDOne(i));
                        break;
                    case '2':
                        lcdNumber.append(getLCDTwo(i));
                        break;
                    case '3':
                        lcdNumber.append(getLCDThree(i));
                        break;
                    default:
                        // Ignore other digits
                        break;
                }
                lcdNumber.append(" ");
            }
            lcdNumber.append("\n");
        }

        return lcdNumber.toString();
    }

    private static String getLCDOne(int line) {
        switch (line) {
            case 0:
                return "   ";
            case 1:
                return "  |";
            case 2:
                return "  |";
            default:
                return "";
        }
    }

    private static String getLCDTwo(int line) {
        switch (line) {
            case 0:
                return " _ ";
            case 1:
                return " _|";
            case 2:
                return "|_ ";
            default:
                return "";
        }
    }

    private static String getLCDThree(int line) {
        switch (line) {
            case 0:
                return " _ ";
            case 1:
                return " _|";
            case 2:
                return " _|";
            default:
                return "";
        }
    }
}
