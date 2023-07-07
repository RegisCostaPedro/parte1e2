import java.util.Scanner;

public class atv3_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numRaiz, raiz, numPot, potencia;

        System.out.println("Atividade 23");
        System.out.print("Digite um número para calcular a raiz quadrada: ");
         numRaiz = input.nextDouble();
         raiz = Math.sqrt(numRaiz);
        System.out.println("A raiz quadrada do número é: " + raiz);
        System.out.print("Digite um número para elevar ao quadrado: ");
         numPot = input.nextDouble();
         potencia = Math.pow(numPot, 2);
        System.out.println("O número elevado ao quadrado é: " + potencia);
    }
}
