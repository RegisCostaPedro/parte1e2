import java.util.*;
//Hemili Barbosa Dias 2-52 e Regis Costa Pedro Atividade 22 MaiorNumero JAVA CALCUL
public class atv3_22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2, maior;

        System.out.println("Digite um número: ");
        numero1=ler.nextInt();

        System.out.println("Digite um número: ");
        numero2=ler.nextInt();

        if (numero1 > numero2){
            maior = numero1;
            System.out.println("O maior número é: " + numero1);
        }
        if (numero2 > numero1){
            maior = numero2;

            System.out.println("O maior número é: " + numero2);
        }

    }
}