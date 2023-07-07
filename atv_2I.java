import java.util.Scanner;

import java.util.Scanner;

public class atv_2I {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Atividade 9");

        String nome, rua, cidade, estado;
        int numResi, cep, cpf, telefone;

        System.out.print("Digite seu nome: ");
        nome = ler.next();

        System.out.print("Digite o nome da sua rua: ");
        rua = ler.next();

        System.out.print("Digite o número de sua residência: ");
        numResi = ler.nextInt();

        System.out.print("Digite o seu CEP: ");
         cep = ler.nextInt();

        System.out.print("Digite a cidade: ");
        cidade = ler.next();

        System.out.print("Digite seu estado: ");
         estado = ler.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = ler.nextInt();

        System.out.print("Digite seu número de telefone: ");
         telefone = ler.nextInt();

        System.out.println("Nome .......: " + nome);
        System.out.println("Endereço ...: RUA " + rua + ", NUMERO: " + numResi + ", CEP: " + cep);
        System.out.println("Cidade......: " + cidade);
        System.out.println("Estado......: " + estado);
        System.out.println("CPF.........: " + cpf);
        System.out.println("Tel. Celular: " + telefone);
    }
}
