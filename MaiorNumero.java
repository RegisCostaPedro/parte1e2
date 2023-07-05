public class MaiorNumero { //Hemili Barbosa Dias 2-52 e Regis Costa Pedro Atividade 22 MaiorNumero JAVA CALCULO

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 25;
        int maior = encontrarMaior(numero1, numero2);
        System.out.println("O maior número entre " + numero1 + " e " + numero2 + " é: " + maior);
    }

    // Método para encontrar o maior número entre dois inteiros
    public static int encontrarMaior(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
