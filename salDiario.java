import java.util.Scanner;

public class salDiario{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Digite a quantidade de horas trabalhadas em um dia: ");
                double horasT = input.nextDouble();
                System.out.print("Digite o valor da hora de trabalho: ");
                double valorHora = input.nextDouble();
                double salarioDia = horasT * valorHora;
                System.out.println("O salário diário é: " + salarioDia);

        }
    }
