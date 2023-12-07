import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String nome = "Marcos";
        char sexo = 'm';
        int idade = 18;
        double tamanho = 1.74;
        double salario = 0;
        System.out.println("Ola, mundo! Qual seu nome?");
        System.out.printf("Sua idade e maior que %d porque se for, infelizmente nao podera entrar%n", idade);
        System.out.printf("Seu tamanho: %.2f %n", tamanho);
        System.out.println("Idade: " + idade + " Tamanho: " + tamanho);
        System.out.printf("Nome do abençoado: %s %nIdade dele: %d %nSexo: %c %nTamanho: %.2f%n", nome, idade, sexo, tamanho);
        System.out.printf("Salário kkkkkkkk: %f%n", salario);
    }
}