import java.util.Scanner;

public class Funcao{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosEscolhidos = new int[3];

        System.out.println("Insira 3 numeros");

        for (int i = 0; i<numerosEscolhidos.length; i++){
            numerosEscolhidos[i] = scanner.nextInt();
        }
        for (int valor: numerosEscolhidos) {
            System.out.println("Numeros escolhidos: " + valor);
        }

        int maiorNumero = resultadoNumeros(numerosEscolhidos);

        mostrarResultado(maiorNumero);

        scanner.close();
    }

    private static int resultadoNumeros(int[] numerosInseridos){

        if (numerosInseridos[0] > numerosInseridos[1] && numerosInseridos[0] > numerosInseridos[2]){
            return numerosInseridos[0];
        }
        else if (numerosInseridos[1] > numerosInseridos[2]){
            return numerosInseridos[1];
        }
        else{
            return numerosInseridos[2];
        }
    }

    private static void mostrarResultado(int numeroMaior){

        System.out.printf("O maior numero é: %d %n", numeroMaior);

    }
}
