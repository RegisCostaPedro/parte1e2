import java.util.Scanner;

public class JavaMathAtiv3 { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA MATH 3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double value = input.nextDouble();

        System.out.println("3a");
        double radians = Math.toRadians(value);
        double tangent = Math.tan(radians);
        System.out.println("Tangente do ângulo em radianos: " + tangent);
        System.out.println("---------------------------------------");

        System.out.println("3b");
        double arcsine = Math.asin(value);
        System.out.println("Arco seno do valor: " + arcsine);
        System.out.println("---------------------------------------");

        System.out.println("3c");
        double arccosine = Math.acos(value);
        System.out.println("Arco cosseno do valor: " + arccosine);
        System.out.println("---------------------------------------");

        System.out.println("3d");
        double arctangent = Math.atan(value);
        System.out.println("Arco tangente do valor: " + arctangent);
        System.out.println("---------------------------------------");

        System.out.println("3e");
        double logarithm = Math.log(value);
        System.out.println("Logaritmo natural do valor: " + logarithm);
        System.out.println("---------------------------------------");
    }
}
