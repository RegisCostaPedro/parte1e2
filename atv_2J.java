import java.util.Scanner;

public class atv_2J {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Atividade 10");
        System.out.print("Digite um  número inteiro: ");
        int a = ler.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int b = ler.nextInt();

        int x = a;
        a = b;
        b = x;

        System.out.println("A = " + a + " e B = " + b);

    }
}
