import java.util.Scanner;

public class atv3_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valorProdut, valorParcela;
        int quantP;

        System.out.println("Atividade 17");
        System.out.print("Digite o valor do produto: ");
        valorProdut = input.nextDouble();

        System.out.print("Digite a quantidade de parcelas: ");
        quantP = input.nextInt();

        valorParcela = valorProdut / quantP;
        System.out.println("O valor de cada parcela é: " + valorParcela);

    }

}
