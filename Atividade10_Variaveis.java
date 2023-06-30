import java.util.*;

public class Atividade10_Variaveis {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int A,B,X;

        System.out.println("valor A:");
        A = ler.nextInt();

        System.out.println("valor B:");
        B = ler.nextInt();
        X =A;
        A = B;
        B = X;

        System.out.println("valor A = " +A);

        System.out.println("valor B= " + B);

    }
}
