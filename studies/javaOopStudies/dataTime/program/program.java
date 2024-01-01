package javaOopStudies.dataTime.program;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class program {
    public static void main(String[] args) {

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2005-04-11");
        LocalDateTime d05 = LocalDateTime.parse("2005-04-11T00:04:25");
        Instant d06 = Instant.parse("2005-04-11T00:04:25Z");
        Instant d07 = Instant.parse("2005-04-11T00:04:25-03:00");

        LocalDate d08 = LocalDate.parse("11/04/2005", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("11/04/2005 00:04", fmt02);
        LocalDate d10 = LocalDate.parse("2005-04-11");
        //LocalDate d10 = LocalDate.of(2005, 4, 11);
        LocalDateTime d11 = LocalDateTime.of(2005, 4, 11, 1, 4, 6);

        System.out.println("d1: " + d01);
        System.out.println("d2: " + d02);
        System.out.println("d3: " + d03);
        System.out.println("d4: " + d04);
        System.out.println("d5: " + d05);
        System.out.println("d5: " + d05.getYear());
        System.out.println("d5: " + d05.getMonth());
        System.out.println("d5: " + d05.getDayOfMonth());
        System.out.println("d5: " + d05.getDayOfWeek());
        System.out.println("d5: " + d05.getDayOfYear());
        System.out.println("d5: " + d05.getHour());
        System.out.println("d5: " + d05.getMinute());
        System.out.println("d5: " + d05.getSecond());
        LocalDateTime past1WeekLocalData = d05.minusDays(7);
        LocalDateTime next1WeekLocalData = d05.plusDays(7);
        LocalDateTime past2WeekLocalData = d05.minusWeeks(7);
        LocalDateTime next2WeekLocalData = d05.plusWeeks(7);
        System.out.println("past week 1: " + past1WeekLocalData);
        System.out.println("next week 1: " + next1WeekLocalData);
        System.out.println("past week 2: " + past2WeekLocalData);
        System.out.println("next week 2: " + next2WeekLocalData);
        Duration t1 = Duration.between(past1WeekLocalData, past2WeekLocalData);
        Duration t2 = Duration.between(past2WeekLocalData, past1WeekLocalData);
        Duration t3 = Duration.between(d04.atStartOfDay(), d01.atStartOfDay());
        System.out.println("t1: " + t1.toDays());
        System.out.println("t2: " + t2.toDays());
        System.out.println("t3: " + t3.toDays());
        System.out.println("d6: " + d06);
        System.out.println("d6: " + fmt03.format(d06));
        LocalDate rt1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate rt2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime rt3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime rt4 = LocalDateTime.ofInstant(d06, ZoneId.of("Indian/Kerguelen"));
        System.out.println("rt1: " + rt1);
        System.out.println("rt2: " + rt2);
        System.out.println("rt3: " + rt3);
        System.out.println("rt4: " + rt4);
        System.out.println("d7: " + d07);
        System.out.println("d8: " + d08);
        System.out.println("d9: " + d09);
        System.out.println("d10: " + d10.format(fmt01));
        System.out.println("d10: " + fmt01.format(d10));
        System.out.println("d10: " + d10.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d11: " + d11);

        System.out.println("Its just an teste");
        System.out.println("Second git bash teste:"); //git bash

    }
}
