import java.util.Scanner;

public class atv3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Dolar, cotacao, valorReal;

        System.out.println("Atividade 25");
        System.out.print("Digite o valor em dólar: ");
         Dolar = input.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
         cotacao = input.nextDouble();
         valorReal = Dolar * cotacao;
        System.out.println("O valor em real é de: " + valorReal);
    }
}
