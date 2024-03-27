package java_basico;

import java.util.Locale;

public class AulaFloatDouble {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int a = 5,b = 2;
        float tamanho;
        double divisaoAleatoria;
        tamanho = 1.75f;
        double teste = 154.25;
        divisaoAleatoria = (double) a/b;
        System.out.printf("tamanho: %.2f, e divisao ai: %.2f", tamanho, divisaoAleatoria);
    }
}
