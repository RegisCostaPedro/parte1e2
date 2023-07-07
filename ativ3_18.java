import java.util.Scanner;

public class ativ3_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, anoAtual, anoNasc;

         System.out.println("Atividade 18");
         System.out.print("Digite a sua idade: ");
         idade = input.nextInt();
         System.out.print("Digite o ano atual: ");
         anoAtual = input.nextInt();
         anoNasc = anoAtual - idade;
        System.out.println("O ano do seu nascimento é: " + anoNasc);
    }
}
