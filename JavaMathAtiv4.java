import java.util.*;

public class Math4_atv { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA MATH 4
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double raio, areaResul;

        System.out.println("--------------------Atividade A----------------------");
        System.out.println("digite o valor do raio: ");
        raio = ler.nextDouble();

        areaResul = Math.PI* Math.pow(raio,2);

        System.out.println("O valor da área é: " + areaResul);
        System.out.println();

        System.out.println("--------------------Atividade B----------------------");

        double raioB, resulB;

        System.out.println("Digite o valor do raio: ");
        raioB = ler.nextDouble();

        resulB = (2*Math.PI)*Math.pow(raioB,2);

        System.out.println("O valor da circunferencia  é: " + resulB);

        System.out.println("--------------------Atividade C----------------------");

        double cateto1, cateto2, resulC;

        System.out.println("Valor do cateto 1: ");
        cateto1 = ler.nextDouble();

        System.out.println("Valor do cateto 2: ");
        cateto2 = ler.nextDouble();

        resulC =Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("O resultado é: " + resulC);

        System.out.println("--------------------Atividade D---------------------");

        double triangulo, i, resulD=0;

        for (i=1; i<=4;i++){

            System.out.println("Digite um lado do retângulo: ");
            triangulo = ler.nextDouble();

            resulD += triangulo;
        }
        System.out.println("O perimetro do retângulo é: " + resulD);

        System.out.println("--------------------Atividade E---------------------");

        double  base, altura, resulE;

        System.out.println("Digite a base do triangulo: ");
        base = ler.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        altura = ler.nextDouble();

        resulE = (base*altura)/2;

        System.out.println("O perimetro da área do triangulo é: " + resulE);
    }
}
