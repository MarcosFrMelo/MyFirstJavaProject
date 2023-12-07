import java.util.Locale;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double x;
        int horas, dia;

        System.out.println("Insira o seu salario por hora:");
        x = scanner.nextInt();

        System.out.println("Insira a hora trabalhada por dia:");
        horas = scanner.nextInt();

        System.out.println("Insira a quantidade de dia trabalhado:");
        dia = scanner.nextInt();

        x = x * horas * dia;

        if (x > 3000){
            x = x * 0.9;
            System.out.printf("O seu salario teve desconto de 10%%, logo o valor é: %.2f %n", x);
        }else if (x < 1300) {
            System.out.println("O seu salario nao teve desconto, continua os "  + x);
        }else {
            x = x * 0.95;
            System.out.println("O seu salario teve desconto de 5%, logo o valor é: " + x);
        }
        scanner.close();
    }
}
