package javaOopStudies.employeeSalary.program;

import javaOopStudies.employeeSalary.entitieis.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employees> employeesList = new ArrayList<>();

        int employeesQuantity = 0;
        int option;
        do {
            System.out.println("""
                    Enter the option you want:
                    1 - Register employee.
                    2 - View employee data.
                    3 - Modify employee data.
                    4 - Exit.
                    """);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    employeeRegistration(employeesList, employeesQuantity);
                    break;
                case 2:
                    employeesData(employeesList);
                    break;
                case 3:
                    modifyEmployees(employeesList);
                    break;
                case 4:
                    System.out.println("Leaving the program");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (true);
    }

    public static void employeeRegistration(List<Employees> employeesList, int employeesQuantity) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n;
        if (employeesQuantity == 0) {
            System.out.println("How many employees will you register?");
        } else {
            System.out.println("How many more employees do you want to register?");
        }
        n = scanner.nextInt();
        int i;
        for (i = employeesQuantity; i < employeesQuantity + n; i++) {
            System.out.print("Enter the employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the employee's name:");
            String name = scanner.nextLine();
            System.out.print("Enter the employee's salary:");
            float salary = scanner.nextFloat();
            Employees employees = new Employees(salary, name, id);
            employeesList.add(employees);
        }
        employeesQuantity = i;
    }

    public static void employeesData(List<Employees> employeesList) {
        for (Employees employees : employeesList) {
            System.out.println(employees);
        }
    }

    public static void modifyEmployees(List<Employees> employeesList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee ID");
        int employeeId = scanner.nextInt();

        for (Employees employee : employeesList) {
            if (employee.getId() == employeeId) {
                System.out.println("Do you want to increase or decrease the employee's salary?\n1 - Increase\n2 - Decrease");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter the percentage:");
                        double percent = scanner.nextDouble();
                        employee.increaseSalary(percent);
                        break;
                    case 2:
                        System.out.println("Enter the percentage:");
                        percent = scanner.nextDouble();
                        employee.decreaseSalary(percent);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }
    }
}
