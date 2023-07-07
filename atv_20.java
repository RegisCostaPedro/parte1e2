import java.util.Scanner;

public class atv_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ladoQuad, areaQuad;

        System.out.println("Atividade 20");

        System.out.print("Digite o valor de um lado do quadrado em centimetros: ");
         ladoQuad = input.nextDouble();

         areaQuad = ladoQuad * ladoQuad;
        System.out.println("A área do quadrado é: " + areaQuad);
    }
}
