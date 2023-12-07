import java.util.Locale;
import java.util.Scanner;

public class leituraDados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Insira seu nome:");
        nome = sc.nextLine();
        System.out.printf("Seu nome:%s teste %n", nome);
        System.out.println("Insira a sua idade:");
        idade = sc.nextInt();
        System.out.printf("Sua idade: %d %n", idade);
        float altura;
        System.out.println("Insira a sua altura");
        altura = sc.nextFloat();
        System.out.printf("altura: %.2f %n", altura);
        char sexo;
        System.out.println("Qual o seu sexo?");
        sexo = sc.next().charAt(0); //pega o caracter localizado nessa posição
        System.out.printf("seu sexo: %c", sexo);

        sc.close();

    }
}
