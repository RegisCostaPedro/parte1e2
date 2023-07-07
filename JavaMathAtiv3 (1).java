import java.util.*;
   //Regis costa Pedro e Hemili Barbosa 2-52
public class atv_3Math
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("a) Calcular a tangente de um ângulo (VALOR) em radianos");
        System.out.println();

        double n1, resultado;

        System.out.println("informe um valor: ");
        n1 = ler.nextDouble();

        resultado = Math.atan(Math.toRadians(n1));

        System.out.println(" o resultado é: " + resultado);

        System.out.println("b) Calcular o arco seno do VALOR");
        System.out.println();

        double n2, resultado2;

        System.out.println("informe um valor: ");
        n2 = ler.nextDouble();

        resultado2 = Math.asin(n2);

        System.out.println(" o resultado é: " + resultado2);

        System.out.println("c) Calcular o arco cosseno do VALOR");
        System.out.println();

        double n3, resultado3;

        System.out.println("informe um valor: ");
        n3 = ler.nextDouble();

        resultado3 = Math.acos(n3);

        System.out.println(" o resultado é: " + resultado3);

        System.out.println("d) Calcular o arco tangente do VALOR");
        System.out.println();

        double n4, resultado4;

        System.out.println("informe um valor: ");
        n4 = ler.nextDouble();

        resultado4 = Math.atan(n4);

        System.out.println(" o resultado é: " + resultado4);


        System.out.println("e)Calcular o logaritmo natural do VALOR");
        System.out.println();

        double n5, resultado5;

        System.out.println("informe um valor: ");
        n5 = ler.nextDouble();

        resultado5 = Math.log(n5);
        System.out.println(" o resultado é: " + resultado5);
    }
}
