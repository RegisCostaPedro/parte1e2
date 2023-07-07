import java.util.Scanner;

public class atv3_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTab, i, result;
        System.out.println("Atividade 24");
        System.out.print("Digite um número para a tabuada: ");
         numTab = input.nextInt();
        for ( i = 1; i <= 10; i++) {
             result = numTab * i;
            System.out.println(numTab + " * " + i + " = " + result); }
    }
}
