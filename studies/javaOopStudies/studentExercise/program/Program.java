package javaOopStudies.studentExercise.program;

import javaOopStudies.studentExercise.entiteis.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the student's name:");
        student.name = scanner.nextLine();

        for (int i=0; i<student.grade.length; i++){
            System.out.printf("Enter the student's %d° grade:", i+1);
            student.grade[i] = scanner.nextFloat();
        }
        int option;
        do {
            System.out.println("""
                    Enter the option you want
                    1 - Look at student data
                    2 - Modify grade
                    3 - Exit""");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    student.studendData();
                    break;
                case 2:
                    student.modifyGrade();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 3);
        scanner.close();
    }
}
