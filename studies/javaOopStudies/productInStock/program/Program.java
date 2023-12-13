package javaOopStudies.productInStock.program;

import javaOopStudies.productInStock.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter the name of product");
        System.out.print("Name:");
        product.name = scanner.nextLine();

        System.out.println("Enter the price of product");
        System.out.print("Price:");
        product.price = scanner.nextDouble();

        System.out.println("Enter the quantity in stock");
        System.out.print("Quantity:");
        product.quantity = scanner.nextInt();

        int opcao;
        do {
            System.out.println("Enter the option you want:\n" +
                    "1 - View product data\n" +
                    "2 - Add products\n" +
                    "3 - Remove products");
            opcao = scanner.nextInt();

            int quantity;
            switch (opcao) {
                case 1:
                    double totalValue = product.totalValueInStock();
                    System.out.println("Name: " + product.name + " Price: " + product.price +
                            " Quantity: " + product.quantity + " Total value in stock: " + totalValue);
                    break;
                case 2:
                    System.out.println("Enter the quantity do you want to add:");
                    System.out.print("Quantity:");
                    quantity = scanner.nextInt();
                    product.addProducts(quantity);
                    System.out.println("Product added successfully");
                    break;
                case 3:
                    System.out.println("Enter the quantity do you want to remove:");
                    System.out.print("Quantity:");
                    quantity = scanner.nextInt();
                    product.removeProducts(quantity);
                    System.out.println("Product removed successfully");
                    break;
                case 4:
                    System.out.println("Ending program, please wait");
                    break;
            }
        } while (opcao != 4);
        scanner.close();
    }
}
