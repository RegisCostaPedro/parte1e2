import java.util.Scanner;

public class multInt{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite o primeiro número inteiro: ");
                int numInt1 = input.nextInt();
                System.out.print("Digite o segundo número inteiro: ");
                int numInt2 = input.nextInt();
                int mult = numInt1 * numInt2;
                System.out.println("O resultado da multiplicação é: " + mult);

        }
    }
