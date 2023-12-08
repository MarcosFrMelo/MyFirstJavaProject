import java.util.Scanner;

public class condicaoternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor para ser descontado");
        float x;
        x = sc.nextFloat();
        double desconto;

        desconto = (x < 100) ? x * 0.9 : x * 0.7;

        System.out.println("Valor com desconto: R$" + desconto);





    }
}
