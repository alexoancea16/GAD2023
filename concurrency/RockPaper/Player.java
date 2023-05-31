package concurrency.RockPaper;

import java.util.Random;

class Player extends Thread {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    @Override
    public void run() {
        Random random = new Random();
        int index = random.nextInt(3);

        switch (index) {
            case 0:
                choice = "rock";
                break;
            case 1:
                choice = "paper";
                break;
            case 2:
                choice = "scissors";
                break;
        }

        System.out.println(name + " chooses " + choice);
    }
}
