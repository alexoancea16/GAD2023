package oo.Interface;

import java.time.Clock;

public class Main {
    public static void displayTime(Clock clock){
        System.out.println(clock.getZone());
    }

    public static void sendEmail(SmartWatch sw) {
        sw.sendEmail("test@test.com");
    }
    public static void main(String[] args) {
        SamsungWatch sw = new SamsungWatch();

        displayTime(sw);
        sendEmail(sw);
    }
}