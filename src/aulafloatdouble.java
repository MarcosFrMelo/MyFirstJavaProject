import java.util.Locale;

public class aulafloatdouble {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int a = 5,b = 2;
        float tamanho;
        double divisaoAleatoria;
        tamanho = 1.75f;
        divisaoAleatoria = (double) a/b;
        System.out.printf("tamanho: %.2f, e divisao ai: %.2f", tamanho, divisaoAleatoria);
    }
}
