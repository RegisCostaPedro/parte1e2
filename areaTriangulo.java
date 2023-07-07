import java.util.Scanner;

public class areaTriangulo {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite a base do triângulo: ");
                double base = input.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double altura = input.nextDouble();
                double areaTri = (base * altura) / 2;
                System.out.println("A área do triângulo é: " + areaTri);
        }
    }