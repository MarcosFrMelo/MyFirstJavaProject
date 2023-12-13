package javaOopStudies.triangleArea.Program;

import javaOopStudies.triangleArea.Entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X: %.4f %n", areaX);
        System.out.printf("Triangle Y: %.4f %n", areaY);

        if (areaX > areaY) {
            System.out.println("The triangle X is the largest");
        } else {
            System.out.println("The triangle Y is the largest");
        }
    }
}