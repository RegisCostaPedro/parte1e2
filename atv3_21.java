import java.util.Scanner;

public class atv3_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altur, pesoQuilo, IMC;

        System.out.print("Digite a sua altura em metros: ");
         altur = input.nextDouble();
        System.out.print("Digite o seu peso em quilogramas: ");
         pesoQuilo = input.nextDouble();
         IMC = pesoQuilo/ (altur * altur);
        System.out.println("O seu IMC é: " + IMC);
    }
}
