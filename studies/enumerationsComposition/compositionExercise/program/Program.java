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
                case 5:
                    listProduct(clientList);
                    break;
                case 6:
                    System.out.println("finishing program");
                    return;
            }
        } while (true);

    }

    private static void listProduct(List<Client> clientList) {
        for (Client client : clientList) {
            System.out.println(client.toStingTwo());
        }
    }

    private static void deleteProductOrCostumer(List<Client> clientList) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Enter the customer's name:\n");
        String clientName = scanner.nextLine();
        for (Client client : clientList) {
            if (Objects.equals(clientName, client.getName())){
                System.out.println("""
                        What do you want to delete?
                        1 - Customer
                        2 - Product
                        3 - Return to menu""");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        clientList.remove(client);
                        System.out.println("Client Removed");
                        break;
                    case 2:
                        client.removeOrder();
                        System.out.println("Product Removed");
                        break;
                    case 3:
                        System.out.println("Returning to Menu");
                        return;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
            }
        }
    }

    private static void editProduct(List<Client> clientList) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        scanner.nextLine();
        System.out.println("Enter the customer's name:");
        String clientName = scanner.nextLine();

        for (Client client : clientList) {
            if (Objects.equals(client.getName(), clientName)) {
                System.out.println(client);
                System.out.println("""
                        Is this the client you want to modify? If yes, what do you want to change?
                        1 - Client
                        2 - Product
                        3 - This is not the client""");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("""
                                What do you want to edit in the client?
                                "1 - Name
                                "2 - Date of birth
                                "3 - Email""");
                        int clientOption = scanner.nextInt();
                        switch (clientOption) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("--------------------------\n"
                                        + "Name before: " + client.getName()
                                        + "\n--------------------------");

                                System.out.println("Enter the new customer name:");
                                String newName = scanner.nextLine();
                                client.setName(newName);

                                System.out.println("--------------------------\n"
                                        + "New name: " + client.getName()
                                        + "\n--------------------------");
                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.println("--------------------------\n"
                                        + "Date of birth before: " + client.getBirthDate()
                                        + "\n--------------------------");
                                boolean customerNewBirthDate = false;
                                LocalDate newBirthDate = null;
                                do {
                                    System.out.println("Enter the new customer birth of date (day/month/year):");
                                    String input = scanner.nextLine();
                                    try {
                                        newBirthDate = LocalDate.parse(input, formatter2);
                                        customerNewBirthDate = false;
                                    } catch (DateTimeParseException e) {
                                        System.out.println("Date entered is incorrect");
                                        customerNewBirthDate = true;
                                    }
                                } while (customerNewBirthDate);
                                client.setBirthDate(newBirthDate);
                                System.out.println("--------------------------\n" + "New date of birth: " + client.getBirthDate() + "\n--------------------------");
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.println("--------------------------\n" + "Email before: " + client.getEmail() + "\n--------------------------");

                                System.out.println("Enter the new customer email:");
                                String newEmail = scanner.nextLine();

                                System.out.println("--------------------------\n"
                                        + "New Email: " + client.getEmail()
                                        + "\n--------------------------");
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("""
                                What do you want to edit in the product?
                                1 - Name
                                2 - Quantity
                                3 - Price
                                4 - Time of purchase
                                5 - Order Status""");
                        int productOption = scanner.nextInt();
                        switch (productOption) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("--------------------------\n"
                                        + "Old product name: " + client.getOrder().getOrderItem().product().getProductName()
                                        + "\n--------------------------");

                                System.out.println("Enter the new product name:");
                                String newProductName = scanner.nextLine();
                                client.getOrder().getOrderItem().product().setProductName(newProductName);

                                System.out.println("--------------------------\n"
                                        + "New product name: " + client.getOrder().getOrderItem().product().getProductName()
                                        + "\n--------------------------");
                                break;
                            case 2:
                                System.out.println("--------------------------\n"
                                        + "Old product quantity: " + client.getOrder().getOrderItem().quantity()
                                        + "\n--------------------------");

                                System.out.println("Enter the new product quantity");
                                int newQuantity = scanner.nextInt();
                                client.getOrder().getOrderItem().setQuantity(newQuantity);

                                System.out.println("--------------------------\n"
                                        + "New product quantity: " + client.getOrder().getOrderItem().quantity()
                                        + "\n--------------------------");
                                System.out.println("Enter the new product quantity");
                                break;
                            case 3:
                                System.out.println("--------------------------\n"
                                        + "Old Price: " + client.getOrder().getOrderItem().product().getPrice()
                                        + "\n--------------------------");

                                System.out.println("Enter new price:");
                                Double newPrice = scanner.nextDouble();
                                client.getOrder().getOrderItem().product().setPrice(newPrice);

                                System.out.println("--------------------------\n"
                                        + "New Price: " + client.getOrder().getOrderItem().product().getPrice()
                                        + "--------------------------\n");
                                break;
                            case 4:
                                scanner.nextLine();
                                System.out.println("--------------------------\n"
                                        + "Old puchase moment: " + client.getOrder().getMoment()
                                        + "\n--------------------------");
                                boolean purchase = false;
                                LocalDateTime newPurchaseMoment = null;
                                do {
                                    System.out.println("Enter the new customer purchase moment (day/month/year hour:min):");
                                    String input = scanner.nextLine();
                                    try {
                                        newPurchaseMoment = LocalDateTime.parse(input, formatter);
                                        purchase = false;
                                    } catch (DateTimeParseException e) {
                                        System.out.println("Date entered is incorrect");
                                        purchase = true;
                                    }
                                } while (purchase);
                                client.getOrder().setMoment(newPurchaseMoment);
                                System.out.println("--------------------------\n"
                                        + "New Purchase Moment: " + client.getOrder().getMoment()
                                        + "\n--------------------------");
                                break;
                            case 5:
                                System.out.println("-------------------------\n"
                                        + "Old Order Status: " + client.getOrder().getOrderStatus()
                                        + "\n-------------------------");
                                System.out.println("""
                                        Enter product status
                                        1 - Pending Payment
                                        2 - Processing
                                        3 - Shipped
                                        4 - Delivered
                                        """);
                                int productStatusOption = scanner.nextInt();
                                OrderStatus orderStatus = null;
                                switch (productStatusOption) {
                                    case 1:
                                        orderStatus = OrderStatus.PENDING_PAYMENT;
                                        break;
                                    case 2:
                                        orderStatus = OrderStatus.PROCESSING;
                                        break;
                                    case 3:
                                        orderStatus = OrderStatus.SHIPPED;
                                        break;
                                    case 4:
                                        orderStatus = OrderStatus.DELIVERED;
                                        break;
                                    default:
                                        System.out.println("Option entered is invalid");
                                        break;
                                }
                                client.getOrder().setOrderStatus(orderStatus);
                                System.out.println("-------------------------\n"
                                        + "New Order Status: " + client.getOrder().getOrderStatus()
                                        + "\n-------------------------");
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("returning to the menu");
                        return;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }
    }

    private static void registerProducts(List<Client> clientList) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the customer's name:");
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
                    OrderStatus orderStatus = null;
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
                            orderStatus = OrderStatus.PENDING_PAYMENT;
                            break;
                        case 2:
                            orderStatus = OrderStatus.PROCESSING;
                            break;
                        case 3:
                            orderStatus = OrderStatus.SHIPPED;
                            break;
                        case 4:
                            orderStatus = OrderStatus.DELIVERED;
                            break;
                        default:
                            System.out.println("Option entered is invalid");
                            break;
                    }

                    Product product = new Product(productName, productPrice);
                    OrderItem orderItem = new OrderItem(quantity, product);
                    Order order = new Order(dateOfCustomerPurchase, orderItem, orderStatus);
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