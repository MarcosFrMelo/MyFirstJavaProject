package javaOopStudies.studentExercise.program;

import javaOopStudies.studentExercise.entiteis.Student;

import java.util.Scanner;

public class Program {

    static Student[] students = new Student[20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {

            System.out.println("""
                    Enter the option you want
                    1 - Look at student data
                    2 - Modify grade
                    3 - Student Registration
                    4 - Exit""");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    studendData();
                    break;
                case 2:
                    modifyStudentData();
                    break;
                case 3:
                    studentRegistration();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (option != 4);
        scanner.close();
    }

    public static void studentRegistration() {
        Scanner scanner = new Scanner(System.in);
        String name;
        float[] grade = new float[3];
        int opcao;
        boolean constructor;
        for (int i = 0; i < 30; i++) {
            constructor = false;

            scanner.nextLine();
            System.out.println("Enter the student's name");
            name = scanner.nextLine();

            System.out.println("Does the student have a grade?");
            System.out.println("Enter 1 for 'yes' and 2 for 'no'");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Enter the student's grade:");
                for (int j = 0; j < 3; j++) {
                    grade[j] = scanner.nextFloat();
                    constructor = true;
                }
            } else {
                students[i] = new Student(name);
            }

            if (constructor = true) {
                students[i] = new Student(name, grade);
            }

            System.out.println("""
                    Do you want to continue adding students?
                    Enter 1 for 'yes' and 2 for 'no""");
            opcao = scanner.nextInt();
            if (opcao == 2) {
                break;
            }
        }
    }

    public static void studendData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student number");
        int studentNumber = scanner.nextInt();

        System.out.println(students[studentNumber-1]);
    }

    public static void modifyStudentData() {
        Scanner scanner = new Scanner(System.in);
        int option;
        int studentNumber;
        float[] grades = new float[3];
        System.out.println("Enter the number of the student you want to modify:");
        studentNumber = scanner.nextInt();

        System.out.println(students[studentNumber-1]);

        System.out.println("Is this the student you want to change? enter 1 for 'yes' and 2 for 'no'");
        option = scanner.nextInt();

        if (option == 2) {
            return;
        }

        do {
            System.out.println("What do you want to modify:\n" +
                    "1 - Name\n" +
                    "2 - Note\n" +
                    "3 - Everything\n" +
                    "4 - Exit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter the student's new name:");
                    String name = scanner.nextLine();
                    students[studentNumber-1] = new Student(name);
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter the student's new grade");
                        grades[i] = scanner.nextFloat();
                    }
                    students[studentNumber-1].setGrade(grades);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the student's new name:");
                    name = scanner.nextLine();
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter the student's new grade");
                        grades[i] = scanner.nextFloat();
                    }
                    students[studentNumber-1] = new Student(name, grades);
                    break;
                case 4:
                    System.out.println("Returning to the menu");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 4);
    }
}
