import java.util.Scanner;

public class dezDesc{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite o valor do produto: ");
                double valorP = input.nextDouble();
                double desc = valorP * 0.10;
                double valorDesc = valorP - desc;
                System.out.println("O valor com desconto é: " + valorDesc);
                
        }
    }