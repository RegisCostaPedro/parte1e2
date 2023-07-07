import java.util.Scanner;
public class atv3_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valProd, descPorc, descValor, ComDesc;

    System.out.println("Atividade 16");

    System.out.print("Digite o valor do produto: ");
    valProd = input.nextDouble();

    System.out.print("Digite a porcentagem de desconto: ");
     descPorc = input.nextDouble();

     descValor = valProd * (descPorc/ 100);
     ComDesc = valProd - descValor;
                System.out.println("O valor com desconto é: " + ComDesc);

}}
