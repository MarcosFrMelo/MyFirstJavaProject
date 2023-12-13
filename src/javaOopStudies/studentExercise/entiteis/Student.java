package javaOopStudies.studentExercise.entiteis;

import java.util.Scanner;

public class Student {
    public String name;
    public float[] grade = new float[3];

    public void studendData() {
        System.out.printf("\nName: %s\n", name);
        float finalGrade = 0;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Grade %d°: %.2f\n", i + 1, grade[i]);
            finalGrade += grade[i];
        }
        if (finalGrade < 60) {
            System.out.println("Final Grade: " + finalGrade);
            System.out.println("Missing points: " + (60 - finalGrade));
        } else {
            System.out.println("Final Grade: " + finalGrade);
        }
    }

    public void modifyGrade() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the student's new grades:");
            grade[i] = scanner.nextFloat();
        }
    }
}

