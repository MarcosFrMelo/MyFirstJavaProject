package java_basico;

import java.util.Scanner;

public class AtividadeIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos;
        float valor;

        System.out.println("Insira a quantidade de tempo que o cliente usou:");
        minutos = sc.nextInt();

        if (minutos < 100){
            System.out.println("Valor a ser pago: R$50,00");
        }
        else {
            valor = (minutos - 100) * 2 + 50;
            System.out.printf("Valor a ser pago: R$%.2f %n", valor);
        }
    }
}
