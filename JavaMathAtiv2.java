import java.util.Scanner;

public class JavaMathAtiv2 { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA MATH 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double number = input.nextDouble();

        System.out.println("2a)");
        double roundedUp = Math.ceil(number);
        System.out.println("Arredondado para cima: " + roundedUp);
        System.out.println("---------------------------------------");

        System.out.println("2b)");
        double roundedDown = Math.floor(number);
        System.out.println("Arredondado para baixo: " + roundedDown);
        System.out.println("---------------------------------------");

        System.out.println("2c)");
        double random = Math.random();
        System.out.println("Número aleatório entre 0 e 1: " + random);
        System.out.println("---------------------------------------");

        System.out.println("2d)");
        double absoluteValue = Math.abs(number);
        System.out.println("Valor absoluto: " + absoluteValue);
        System.out.println("---------------------------------------");

        System.out.println("2e)");
        System.out.println("Digite outro número:");
        double number2 = input.nextDouble();
        double maximum = Math.max(number, number2);
        System.out.println("Máximo entre os números: " + maximum);
        System.out.println("---------------------------------------");

        System.out.println("2f)");
        double minimum = Math.min(number, number2);
        System.out.println("Mínimo entre os números: " + minimum);
        System.out.println("---------------------------------------");

        System.out.println("2g)");
        double radians = Math.toRadians(number);
        double sine = Math.sin(radians);
        System.out.println("Seno do ângulo em radianos: " + sine);
        System.out.println("---------------------------------------");

        System.out.println("2h)");
        double cosine = Math.cos(radians);
        System.out.println("Cosseno do ângulo em radianos: " + cosine);
        System.out.println("---------------------------------------");
    }
}