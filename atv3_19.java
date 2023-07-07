import java.util.Scanner;

public class atv3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idd, mesesVividos, quantDia;

        System.out.println("Atividade 19");

        System.out.print("Digite a sua idade: ");
        idd = input.nextInt();

        System.out.print("Digite a quantidade de meses vividos: ");
        mesesVividos = input.nextInt();

        quantDia = idd * 365 + mesesVividos * 30;
        System.out.println("O seu número aproximado de dias vividos é: " + quantDia);
    }
}
