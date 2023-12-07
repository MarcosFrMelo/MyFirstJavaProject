

import java.util.Locale;
import java.util.Scanner;

public class Mathaula {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        double a;
        System.out.println("Insira o numero que vc quer elevalo e qual o numero de elevação");
        x = sc.nextInt();
        y = sc.nextInt();
        a = Math.pow(x, y);
        System.out.printf("Numero %.2f %n", a);
        a = Math.sqrt(x);
        System.out.printf("Raiz: %.2f %n", a);
    }
}
