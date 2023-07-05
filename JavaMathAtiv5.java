import java.util.Scanner;

public class JavaMathAtiv5 {  //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA MATH 5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da hipotenusa:");
        double hipotenusa = input.nextDouble();

        System.out.println("Digite o valor do lado oposto:");
        double ladoOposto = input.nextDouble();

        double ladoAdjacente = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(ladoOposto, 2));

        System.out.println("O valor do lado adjacente é: " + ladoAdjacente);
    }
}

