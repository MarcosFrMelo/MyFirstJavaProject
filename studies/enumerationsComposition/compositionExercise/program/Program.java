package enumerationsComposition.compositionExercise.program;

import enumerationsComposition.compositionExercise.entiteis.Client;
import enumerationsComposition.compositionExercise.entiteis.Order;
import enumerationsComposition.compositionExercise.entiteis.OrderItem;
import enumerationsComposition.compositionExercise.entiteis.Product;
import enumerationsComposition.firstEnum.entiteis.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
                    5 - List of products
                    6 - Exit""");
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
                case 6:
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
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the customer's name");
        String clientName = scanner.nextLine();
        boolean customerFound = false;
        for (Client client : clientList) {

            if (Objects.equals(clientName, client.getName())) {
                System.out.println(client);

                System.out.println("Is this the customer you are looking for? 1 for yes, 2 for no");
                int custumerLokingFor = scanner.nextInt();

                if (custumerLokingFor == 1) {
                    scanner.nextLine();
                    System.out.println("Enter product name:");
                    String productName = scanner.nextLine();

                    System.out.println("Enter the product price:");
                    Double productPrice = scanner.nextDouble();

                    System.out.println("Enter product quantity:");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    boolean customerPurchase;

                    LocalDateTime dateOfCustomerPurchase = null;
                    do {
                        System.out.println("Enter the time the customer made the purchase (Example: day/month/year hour:min");
                        String input = scanner.nextLine();
                        try {
                            dateOfCustomerPurchase = LocalDateTime.parse(input, fmt);
                            customerPurchase = false;
                        } catch (DateTimeParseException e) {
                            System.out.println("Date entered is incorrect");
                            customerPurchase = true;
                        }
                    } while (customerPurchase);

                    System.out.println("""
                            Enter product status
                            1 - Pending Payment
                            2 - Processing
                            3 - Shipped
                            4 - Delivered
                            """);
                    int productStatusOption = scanner.nextInt();

                    switch (productStatusOption) {
                        case 1:
                            client.getOrder().setOrderStatus(OrderStatus.PENDING_PAYMENT);
                            break;
                        case 2:
                            client.getOrder().setOrderStatus(OrderStatus.PROCESSING);
                            break;
                        case 3:
                            client.getOrder().setOrderStatus(OrderStatus.SHIPPED);
                            break;
                        case 4:
                            client.getOrder().setOrderStatus(OrderStatus.DELIVERED);
                            break;
                        default:
                            System.out.println("Option entered is invalid");
                            break;
                    }
                    Product product = new Product(productName, productPrice);
                    OrderItem orderItem = new OrderItem(quantity, product);
                    Order order = new Order(dateOfCustomerPurchase, orderItem);
                    client.setOrder(order);

                    System.out.println("customer request:");
                    System.out.println(client.toStingTwo());

                } else {
                    return;
                }
                customerFound = false;
            } else {
                customerFound = true;
            }
        }
        if (customerFound) {
            System.out.println("customer not found");
        }

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