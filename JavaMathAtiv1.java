import java.util.Scanner;

public class JavaMathAtiv1 { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA MATH 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as coordenadas do 1º ponto: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Digite as coordenadas do 2º ponto: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("A distância entre os dois pontos é de: " + distance);
    }
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double part1 = Math.pow(x2 - x1, 2);
        double part2 = Math.pow(y2 - y1, 2);
        double result = Math.sqrt(part1 + part2);
        return result;
    }
}

