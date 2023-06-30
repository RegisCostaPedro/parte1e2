import java.util.*;
        //Lista de exercicios 2
        //Nome: Regis costa Pedro, Hemili barbosa      turma 2-52
public class atv_Variaveis {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Atividade 1");

        String nome;
        String lugar;

        System.out.println("Digite seu nome:");
        nome = ler.nextLine().toUpperCase();

        System.out.println("Digite a cidade em que você mora:");
        lugar = ler.nextLine().toUpperCase();

        System.out.println("Olá " + nome + " você mora na cidade de " + lugar);


        System.out.println("-------------------------------------------------------");
        System.out.println("Atividade 2");

        String Nome;

        System.out.println("Digite seu nome: ");
        Nome = ler.nextLine().toUpperCase();

        System.out.println("Boas-vindas " + Nome);

        System.out.println("-------------------------------------------------------");
        System.out.println("Atividade 3");

        int idade;

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Sua idade é: " + idade);

        System.out.println("-------------------------------------------------------");
        System.out.println("Atividade 4");

        int numInt;

        System.out.println("Digite um número intero");
        numInt = ler.nextInt();;

        System.out.println("O número inteiro digitado foi: " + numInt);

        System.out.println("-------------------------------------------------------");
        System.out.println("Atividade 5");

        float numDeci;

        System.out.println("Digite um número decimal: ");
        numDeci = ler.nextFloat();

        System.out.println("O número decimal digitado foi: " + numDeci);

        System.out.println("-------------------------------------------------------");
        System.out.println("Atividade 6");


        int int1, int2;

        System.out.println("Digite um número inteiro: ");
        int1 = ler.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int2 = ler.nextInt();

        System.out.println("Os números inteiros digitados foram: " + int1 + "e" + int2);

        System.out.println("-------------------------------------------------------");

        System.out.println("---------------------------AS ATIVIDADES CONTINUAM NO PROXIMO ARQUIVO..----------------------------");



    }
    }

