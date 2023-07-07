import java.util.*;
 //Regis costa Pedro Hemili Barbosa 2-52
public class Atv_um
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.println("a) Arredondar um número para cima:");
        System.out.println("----------------------------------");
        System.out.println();

        double n1, arredondar;

        System.out.print("Digite um número:");
        n1 = ler.nextDouble();
        System.out.println();

        arredondar = Math.ceil(n1);

        System.out.println("O valor do arredondamento é: " + arredondar);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("b) Arredondar um número para baixo:");

        double n2, arredondarBaixo;

        System.out.println("Digite um número:");
        n2 = ler.nextDouble();
        System.out.println();


        arredondarBaixo = Math.floor(n2);

        System.out.println("O valor do arredondamento é: " + arredondarBaixo);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("c) Gerar um número aleatório entre 0 e 1:");

        double  aleat;


        aleat = Math.random();

        System.out.println("o número gerado foi: " + aleat);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("d) Calcular o valor absoluto de um número:");

        double n3, absoluto;

        System.out.println("Digite um valor: (positivo/negativo)");
        n3 = ler.nextDouble();

        absoluto = Math.abs(n3);

        System.out.println("O valor absoluto é: " + absoluto);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("e) Calcular o máximo entre dois números:");

        double  n4,n5, max;

        System.out.println("Digite o primeiro valor:");
        n4 = ler.nextDouble();
        System.out.println("Digite o segundo valor:");
        n5 = ler.nextDouble();

        max =Math.max(n4,n5);

        System.out.println("O valor máximo dos números é: " + max);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("f) Calcular o mínimo entre dois números:");

        double n6, n7, min;

        System.out.println("Digite o primeiro valor:");
        n6 = ler.nextDouble();
        System.out.println("Digite o segundo valor:");
        n7 = ler.nextDouble();

        min =Math.min(n4,n5);

        System.out.println("O valor minimo dos números é: " + min);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("g) Calcular o seno de um ângulo em radianos:");

        double seno, angulo, pi, resultadoA;


        System.out.println("digite o ANGULO");
        angulo = ler.nextDouble();

        seno = Math.toDegrees(angulo);
        pi = Math.PI;

        resultadoA = (seno+ pi)/ angulo;

        System.out.println("O resultado em radianos é: " + angulo);
        System.out.println("----------------------------------");
        System.out.println();

        System.out.println("h) Calcular o cosseno de um ângulo em radianos:");

        double valEmRad, angulo1=0;

        System.out.println("Digite o valor do angulo: ");
        angulo1 = ler.nextDouble();

        valEmRad = Math.toRadians(angulo1);

        System.out.println("O resultado é: " + valEmRad);

        System.out.println();
        System.out.println("------------------------FIM DA ATIVIDADE!------------------------------------");

    }
}
