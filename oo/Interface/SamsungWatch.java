package oo.Interface;

import java.sql.Time;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class SamsungWatch extends Clock implements SmartWatch {

    @Override
    public String getTime() {
        return new Time(22, 13, 13)
                .toLocalTime().toString();
    }

    @Override
    public void sendEmail(String toEmail) {

        System.out.println("Email sent to" + toEmail);
    }

    @Override
    public ZoneId getZone() {
        return null;
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return null;
    }

    @Override
    public Instant instant() {
        return null;
    }
}