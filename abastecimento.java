import java.util.Scanner;

public class abastecimento{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite a quantidade de litros abastecidos: ");
                double litros = input.nextDouble();
                System.out.print("Digite o valor do litro: ");
                double valorL = input.nextDouble();
                double total = litros * valorL;
                System.out.println("O valor total a ser pago é de: " + total);
                
        }
    }
