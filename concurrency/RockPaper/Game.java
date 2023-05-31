package concurrency.RockPaper;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.start();
        player2.start();

        try {
            player1.join();
            player2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String choice1 = player1.getChoice();
        String choice2 = player2.getChoice();

        System.out.println("Player 1 chooses " + choice1);
        System.out.println("Player 2 chooses " + choice2);

        String winner = determineWinner(choice1, choice2);

        System.out.println("The winner is: " + winner);
    }

    private static String determineWinner(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return "It's a tie!";
        } else if (
                (choice1.equals("rock") && choice2.equals("scissors")) ||
                        (choice1.equals("paper") && choice2.equals("rock")) ||
                        (choice1.equals("scissors") && choice2.equals("paper"))
        ) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }
}