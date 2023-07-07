import java.util.Scanner;

public class aluguelCarro{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
                System.out.print("Digite a quantidade de dias alugados: ");
                int diasAlug = input.nextInt();
                System.out.print("Digite o valor da diária: ");
                double valorDia = input.nextDouble();
                double valorTotal = diasAlug * valorDia;
                System.out.println("O valor total do aluguel é: " + valorTotal);
                
        }
    }