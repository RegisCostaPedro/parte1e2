import java.util.Scanner;

public class totalSeg{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite a quantidade de dias: ");
                int dias = input.nextInt();
                System.out.print("Digite a quantidade de horas: ");
                int horas = input.nextInt();
                System.out.print("Digite a quantidade de minutos: ");
                int min = input.nextInt();
                System.out.print("Digite a quantidade de segundos: ");
                int seg = input.nextInt();
                int totalSeg = seg + (min * 60) + (horas * 3600) + (dias * 86400);
                System.out.println("O total de segundos é: " + totalSeg);
                
        }
    }