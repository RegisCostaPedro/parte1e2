import java.sql.SQLOutput;

import java.util.Scanner;
public class JavaVariavelAtiv { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA VARIÁVEL
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Atividade 1");
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a cidade em que você mora: ");
            String lugar = scanner.nextLine();
            System.out.println("Olá " + nome + ", você mora na cidade de " + lugar + ".");
        System.out.println("-------------------------------------------------");

        System.out.println("Atividade 2");
            System.out.print("Digite seu nome: ");
            String nome2 = scanner.nextLine();
            System.out.println("Seja muito bem-vindo(a), " + nome2 + "!");
        System.out.println("-------------------------------------------------");

        System.out.println("Atividade 3");
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Você tem " + idade + " anos.");

        System.out.println("-------------------------------------------------");

        System.out.println("Atividade 4");
            System.out.print("Digite um número inteiro: ");
            int numInt = scanner.nextInt();
            System.out.println("Número digitado: " + numInt);

        System.out.println("-------------------------------------------------");

        System.out.println("Atividade 5");
            System.out.print("Digite um número decimal: ");
            double numDecimal = scanner.nextDouble();
            System.out.println("Número digitado: " + numDecimal);
            System.out.println("-------------------------------------------------");

        System.out.println("Atividade 6");
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();
            System.out.println("Números digitados: " + num1 + " e " + num2);
            System.out.println("-------------------------------------------------");

        System.out.println("Atividade 7");
            System.out.print("Digite seu nome: ");
            String nomeUsuario = scanner.nextLine();
            nomeUsuario = scanner.nextLine();
            System.out.print("Digite sua idade: ");
            int iddUsuario = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite a cidade onde reside: ");
            String cidade = scanner.nextLine();
            System.out.println("Nome: " + nomeUsuario);
            System.out.println("Idade: " + iddUsuario);
            System.out.println("Cidade: " + cidade);
            System.out.println("-------------------------------------------------");

        System.out.println("Atividade 8");
            System.out.print("Digite um número inteiro: ");
            int nInteiro = scanner.nextInt();
            System.out.print("Digite um número decimal: ");
            double nDecimal = scanner.nextDouble();
            System.out.println("Os números digitados por você foram: " + nInteiro + " e " + nDecimal);
        System.out.println("-------------------------------------------------");

        System.out.println("Atividade 9");
            System.out.print("Digite seu nome: ");
            String name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("Digite o nome da sua rua: ");
            String rua = scanner.nextLine();
            System.out.print("Digite o número de sua residência: ");
            String num = scanner.nextLine();
            System.out.print("Digite o seu CEP: ");
            String cep = scanner.nextLine();
            System.out.print("Digite a cidade: ");
            String city = scanner.nextLine();
            System.out.print("Digite seu estado: ");
            String estado = scanner.nextLine();
            System.out.print("Digite seu CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Digite seu número de telefone: ");
            String telefone = scanner.nextLine();

            System.out.println("Nome .......: " + name);
            System.out.println("Endereço ...: RUA " + rua + ", NUMERO: " + num + ", CEP: " + cep);
            System.out.println("Cidade......: " + city);
            System.out.println("Estado......: " + estado);
            System.out.println("CPF.........: " + cpf);
            System.out.println("Tel. Celular: " + telefone);
        System.out.println("-------------------------------------------------");

        System.out.println("Atividade 10");
            System.out.print("Digite um  número inteiro: ");
            int a = scanner.nextInt();
            System.out.print("Digite outro número inteiro: ");
            int b = scanner.nextInt();

            int x = a;
            a = b;
            b = x;

            System.out.println("A = " + a + " e B = " + b);


        }
    }