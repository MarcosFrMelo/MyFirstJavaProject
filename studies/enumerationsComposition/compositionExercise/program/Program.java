package enumerationsComposition.compositionExercise.program;

import enumerationsComposition.compositionExercise.entiteis.Client;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Client> clientList = new ArrayList<>();
        Client client = new Client();

        do {
            System.out.println("Enter the option you want\n" +
                    "1 - Register Customer\n" +
                    "2 - Register Products\n" +
                    "3 - Edit a product\n" +
                    "4 - Delete a product or customer\n" +
                    "5 - Exit");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    registerCostumer(client, clientList);
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


        }while(true);

    }

    private static void deleteProductOrCostumer(List<Client> clientList) {
    }

    private static void editProduct(List<Client> clientList) {
    }

    private static void registerProducts(List<Client> clientList) {
    }

    private static void registerCostumer(Client client, List<Client> clientList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of customers you will register");
        int clientQuantity = scanner.nextInt();

        for (int i = clientList.size(); i < clientQuantity + (clientQuantity-1); i++){
            scanner.nextLine();
            System.out.println("");
            String name = scanner.nextLine();
            System.out.println("");
            String email = scanner.nextLine();
            System.out.println("");

        }





    }
}