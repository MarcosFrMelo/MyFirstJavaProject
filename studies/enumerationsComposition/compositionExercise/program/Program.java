package enumerationsComposition.compositionExercise.program;

import enumerationsComposition.compositionExercise.entiteis.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Client> clientList = new ArrayList<>();

        do {
            System.out.println("""
                    Enter the option you want
                    1 - Register Customer
                    2 - Register Products
                    3 - Edit a product
                    4 - Delete a product or customer
                    5 - Exit""");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    registerCostumer(clientList);
                    break;
                case 2:
                    registerProducts(clientList);
                    break;
                case 3:
                    editProduct(clientList);
                    break;
                case 4:
                    deleteProductOrCostumer(clientList);
                    break;
                case 5:
                    System.out.println("finishing program");
                    return;
            }


        } while (true);

    }

    private static void deleteProductOrCostumer(List<Client> clientList) {
    }

    private static void editProduct(List<Client> clientList) {
    }

    private static void registerProducts(List<Client> clientList) {
    }

    private static void registerCostumer(List<Client> clientList) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the number of customers you will register");
        int clientQuantity = scanner.nextInt();

        for (int i = clientList.size(); i < clientQuantity + (clientQuantity - 1); i++) {
            scanner.nextLine();
            System.out.println("Enter the customer's name");
            String name = scanner.nextLine();
            System.out.println("Enter the customer's email");
            String email = scanner.nextLine();
            boolean tryCatch;
            do {
                System.out.println("Enter the customer's date of birth (day/month/year)");
                String input = scanner.nextLine();
                try {
                    LocalDate birthDate = LocalDate.parse(input, formatter);
                    Client client = new Client(name, email, birthDate);
                    clientList.add(client);
                    tryCatch = false;
                } catch (DateTimeParseException e) {
                    System.out.println("Date of birth entered is incorrect");
                    tryCatch = true;
                }
            } while (tryCatch);
            System.out.println("customer successfully registered");
        }
    }
}