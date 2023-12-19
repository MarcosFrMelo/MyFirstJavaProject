package javaOopStudies.datatime.program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class program {
    public static void main(String[] args) {



        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2005-04-11");
        LocalDateTime d05 = LocalDateTime.parse("2005-04-11T00:04:25");
        Instant d06 = Instant.parse("2005-04-11T00:04:25Z");
        Instant d07 = Instant.parse("2005-04-11T00:04:25-03:00");

        LocalDate d08 = LocalDate.parse("11-04-2005")


        System.out.println("d1: " + d01);
        System.out.println("d2: " + d02);
        System.out.println("d3: " + d03);
        System.out.println("d4: " + d04);
        System.out.println("d5: " + d05);
        System.out.println("d6: " + d06);
        System.out.println("d7: " + d07);
    }
}
