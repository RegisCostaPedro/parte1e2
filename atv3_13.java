import java.util.Scanner;

public class atv3_13 {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.println("Atividade 13");

            System.out.print("Digite o valor do produto: ");
            double valorProd = input.nextDouble();

            System.out.print("Digite a quantidade comprada: ");
            int quant = input.nextInt();

            double totalCompra = valorProd * quant;
            System.out.println("O valor total da sua compra é: " + totalCompra);


        }
    }


