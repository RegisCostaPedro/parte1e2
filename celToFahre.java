import java.util.Scanner;

public class celToFahre {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite a temperatura em graus Celsius: ");
            double celsius = input.nextDouble();
            double fahren = (celsius * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahren);

        }
    }
