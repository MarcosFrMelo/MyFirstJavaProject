package java_basico;

import java.util.Locale;
import java.util.Scanner;

public class WithNoOOP {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X:");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p*(p - xA)*(p - xB)*(p - xC));
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p*(p - yA)*(p - yB)*(p - yC));

        System.out.printf("Triangle X: %.4f %n", areaX);
        System.out.printf("Triangle Y: %.4f %n", areaY);

        if (areaX > areaY){
            System.out.println("The triangle X is the largest");
        }
        else {
            System.out.println("The triangle Y is the largest");
        }
    }
}
