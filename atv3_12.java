import java.util.*;
public class atv3_12 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            double Produto, acresc15, comAcresc;

            System.out.println("Atividade 12");

            System.out.print("Digite o valor do produto: ");
             Produto = input.nextDouble();
             acresc15 = Produto * 0.15;
             comAcresc = Produto + acresc15;
            System.out.println("O valor com acréscimo é: " + comAcresc);


        }
    }

