package dataBaseStudies.program;

import dataBaseStudies.entiteis.Person;
import javaOopStudies.employeeSalary.entitieis.Employees;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        List<Person> list = new ArrayList<>();

        int option = menu();
        do {

            switch (option){
                case 1:
                    adicionarPessoa(person, list);
                case 5:
                    return;
            }

        }while (true);
    }

    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("""
                Insira a opção que deseja:
                1 - Adicionar Pessoas
                2 - Remover Pessoas
                3 - Editar Pessoas
                4 - Deletar Pessoas
                5 - Sair
                6 - Enviar para o banco de dados
                """);
        option = scanner.nextInt();
        return(option);
    }
    public static void adicionarPessoa(Person person, List<Person> list){

    }

}
