import java.util.Scanner;

public class JavaMathAtiv4 { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA MATH 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double radius = input.nextDouble();

        System.out.println("4a");
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Área do círculo: " + circleArea);
        System.out.println("---------------------------------------");

        System.out.println("4b");
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circunferência do círculo: " + circumference);
        System.out.println("Digite o valor do cateto 1:");
        double cateto1 = input.nextDouble();
        System.out.println("Digite o valor do cateto 2:");
        double cateto2 = input.nextDouble();
        System.out.println("---------------------------------------");

        System.out.println("4c");
        double hypotenuse = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("Hipotenusa do triângulo retângulo: " + hypotenuse);
        System.out.println("Digite a base do triângulo:");
        double base = input.nextDouble();
        System.out.println("Digite a altura do triângulo:");
        double height = input.nextDouble();
        System.out.println("---------------------------------------");

        System.out.println("4d");
        double triangleArea = (base * height) / 2;
        System.out.println("Área do triângulo: " + triangleArea);
        double side1, side2;
        System.out.println("Digite o valor do lado 1 do retângulo:");
        side1 = input.nextDouble();
        System.out.println("Digite o valor do lado 2 do retângulo:");
        side2 = input.nextDouble();
        System.out.println("---------------------------------------");

        System.out.println("4e");
        double perimeter = 2 * (side1 + side2);
        System.out.println("Perímetro do retângulo: " + perimeter);
    }
}
