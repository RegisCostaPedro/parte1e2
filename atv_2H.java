import java.util.Scanner;

public class atv_2H {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Atividade 8");

        int numint;
        double nDecimal;

        System.out.print("Digite um número inteiro: ");
       numint = ler.nextInt();

        System.out.print("Digite um número decimal: ");
        nDecimal = ler.nextDouble();


        System.out.println("Os números digitados por você foram: " + numint + " e " + nDecimal);
    }
}
