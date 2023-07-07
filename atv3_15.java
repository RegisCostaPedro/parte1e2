import java.util.Scanner;

public class atv3_15 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double alt, peso, imc;

        System.out.print("Digite a sua altura em metros: ");
        alt = input.nextDouble();
        System.out.print("Digite o seu peso em quilogramas: ");
        peso = input.nextDouble();
        imc = peso / (alt * alt);
        System.out.println("O seu IMC é: " + imc);
    }


}
