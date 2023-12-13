package java_basico;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        float[][] alunos = new float[3][30];

        for (int i = 0; i < 3; i++) {
            System.out.println("\t\nTurma: " + i + 1);
            for (int j = 0; j < 30; j++) {
                System.out.println("\t\nAluno: " + j + 1);
                System.out.println("Insira a nota do aluno:");
                alunos[i][j] = sc.nextFloat();
            }
            System.out.println("Informações recebidas");
        }
        int opcao;
        do {
            System.out.println("Insira a opção que deseja:\n1 - Nota do Aluno\n2 - Media da Turma\n" +
                    "3 - Alunos acima da Media\n4 - Maior Media\n 5 - (Sem opção por enquanto)\n" +
                    "6 - Finalizar Programa");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    notaAluno(alunos);
                    break;
                case 2:
                    mediaTurma(alunos);
                    break;
                case 3:
                    alunosAcimaMedia(alunos);
                    break;
                case 4:
                    maiorMedia(alunos);
                    break;
                case 5:
                    System.out.println("Sem opção por enquanto :D");
                    break;
                case 6:
                    System.out.print("Finalizando programa, aguarde");
                    for (int l = 0; l < 3; l++){
                        System.out.print(".");
                        Thread.sleep(2000);
                    }
            }

        } while (opcao == 6);
        sc.close();
    }

    private static void maiorMedia(float[][] alunos) {


    
    }

    private static void alunosAcimaMedia(float[][] alunos) {
    }

    public static void notaAluno(float[][] alunoNota){
        Scanner sc = new Scanner(System.in);
        int turma, aluno;
        System.out.println("Insira a turma do aluno:");
        turma = sc.nextInt();

        System.out.println("Insira o numero do aluno:");
        aluno = sc.nextInt();

        System.out.println("Nota do aluno: " + alunoNota[turma-1][aluno-1]);

        sc.close();
    }

    private static void mediaTurma(float[][] nota){
        Scanner sc = new Scanner(System.in);
        int turma;
        double media = 0;

        System.out.println("Insira a turma que deseja ver a media:");
        turma = sc.nextInt();

        for (int i = 0; i < 30; i++){
            media += nota[turma-1][i];
        }
        media /= 30;

        System.out.println("A media da turma é: " + media);

        sc.close();
    }


}
