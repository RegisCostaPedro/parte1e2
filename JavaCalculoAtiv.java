import java.util.Scanner;

public class JavaCalculoAtiv { //Hemili Barbosa Dias e Regis Costa Pedro 2-52 Atividades JAVA CALCULO
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Atividade 1");
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = input.nextInt();
                System.out.print("Digite o segundo número inteiro: ");
                int num2 = input.nextInt();
                int soma = num1 + num2;
                System.out.println("A soma dos números é: " + soma);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 2");
                System.out.print("Digite o raio do círculo: ");
                double raio = input.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("A área do círculo é: " + areaCirculo);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 3");
                System.out.print("Digite a base do triângulo: ");
                double base = input.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double altura = input.nextDouble();
                double areaTri = (base * altura) / 2;
                System.out.println("A área do triângulo é: " + areaTri);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 4");
                System.out.print("Digite a temperatura em graus Celsius: ");
                double celsius = input.nextDouble();
                double fahren = (celsius * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahren);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 5");
                System.out.print("Digite a quantidade de horas trabalhadas em um dia: ");
                double horasT = input.nextDouble();
                System.out.print("Digite o valor da hora de trabalho: ");
                double valorHora = input.nextDouble();
                double salarioDia = horasT * valorHora;
                System.out.println("O salário diário é: " + salarioDia);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 6");
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
                System.out.println("----------------------------------------");

                System.out.println("Atividade 7");
                System.out.print("Digite o primeiro número inteiro: ");
                int numInt1 = input.nextInt();
                System.out.print("Digite o segundo número inteiro: ");
                int numInt2 = input.nextInt();
                int mult = numInt1 * numInt2;
                System.out.println("O resultado da multiplicação é: " + mult);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 8");
                System.out.print("Digite o valor do produto: ");
                double valorP = input.nextDouble();
                double desc = valorP * 0.10;
                double valorDesc = valorP - desc;
                System.out.println("O valor com desconto é: " + valorDesc);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 9");
                System.out.print("Digite a quantidade de litros abastecidos: ");
                double litros = input.nextDouble();
                System.out.print("Digite o valor do litro: ");
                double valorL = input.nextDouble();
                double total = litros * valorL;
                System.out.println("O valor total a ser pago é de: " + total);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 10");
                System.out.print("Digite a quantidade de dias alugados: ");
                int diasAlug = input.nextInt();
                System.out.print("Digite o valor da diária: ");
                double valorDia = input.nextDouble();
                double valorTotal = diasAlug * valorDia;
                System.out.println("O valor total do aluguel é: " + valorTotal);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 11");
                System.out.print("Digite um número inteiro: ");
                int numInteiro = input.nextInt();
                int quadrado = numInteiro * numInteiro;
                System.out.println("O quadrado do número é: " + quadrado);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 12");
                System.out.print("Digite o valor do produto: ");
                double Produto = input.nextDouble();
                double acresc15 = Produto * 0.15;
                double ComAcresc = Produto + acresc15;
                System.out.println("O valor com acréscimo é: " + ComAcresc);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 13");
                System.out.print("Digite o valor do produto: ");
                double valorProd = input.nextDouble();
                System.out.print("Digite a quantidade comprada: ");
                int quant = input.nextInt();
                double totalCompra = valorProd * quant;
                System.out.println("O valor total da sua compra é: " + totalCompra);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 14");
                System.out.print("Digite um número inteiro: ");
                int num = input.nextInt();
                int cubo = num * num * num;
                System.out.println("O cubo do número é: " + cubo);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 15");
                System.out.print("Digite a sua altura em metros: ");
                double alt = input.nextDouble();
                System.out.print("Digite o seu peso em quilogramas: ");
                double peso = input.nextDouble();
                double imc = peso / (alt * alt);
                System.out.println("O seu IMC é: " + imc);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 16");
                System.out.print("Digite o valor do produto: ");
                double valProd = input.nextDouble();
                System.out.print("Digite a porcentagem de desconto: ");
                double descPorc = input.nextDouble();
                double descValor = valProd * (descPorc/ 100);
                double ComDesc = valProd - descValor;
                System.out.println("O valor com desconto é: " + ComDesc);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 17");
                System.out.print("Digite o valor do produto: ");
                double valorProdut = input.nextDouble();
                System.out.print("Digite a quantidade de parcelas: ");
                int quantP = input.nextInt();
                double valorParcela = valorProdut / quantP;
                System.out.println("O valor de cada parcela é: " + valorParcela);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 18");
                System.out.print("Digite a sua idade: ");
                int idade = input.nextInt();
                System.out.print("Digite o ano atual: ");
                int anoAtual = input.nextInt();
                int anoNasc = anoAtual - idade;
                System.out.println("O ano do seu nascimento é: " + anoNasc);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 19");
                System.out.print("Digite a sua idade: ");
                int idd = input.nextInt();
                System.out.print("Digite a quantidade de meses vividos: ");
                int mesesVividos = input.nextInt();
                int quantDia = idd * 365 + mesesVividos * 30;
                System.out.println("O seu número aproximado de dias vividos é: " + quantDia);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 20");
                System.out.print("Digite o valor do lado do quadrado: ");
                double ladoQuad = input.nextDouble();
                double areaQuad = ladoQuad * ladoQuad;
                System.out.println("A área do quadrado é: " + areaQuad);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 21");
                System.out.print("Digite a sua altura em metros: ");
                double altur = input.nextDouble();
                System.out.print("Digite o seu peso em quilogramas: ");
                double pesoQuilo = input.nextDouble();
                double IMC = pesoQuilo/ (altur * altur);
                System.out.println("O seu IMC é: " + IMC);
                System.out.println("----------------------------------------");

                // A ATIVIDADE 22 ESTÁ SEPARADA NO OUTRO JAVA CLASS "MaiorNumero"...

                System.out.println("Atividade 23");
                System.out.print("Digite um número para calcular a raiz quadrada: ");
                double numRaiz = input.nextDouble();
                double raiz = Math.sqrt(numRaiz);
                System.out.println("A raiz quadrada do número é: " + raiz);
                System.out.print("Digite um número para elevar ao quadrado: ");
                double numPot = input.nextDouble();
                double potencia = Math.pow(numPot, 2);
                System.out.println("O número elevado ao quadrado é: " + potencia);
                System.out.println("----------------------------------------");

                System.out.println("Atividade 24");
                System.out.print("Digite um número para a tabuada: ");
                int numTab = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                        int result = numTab * i;
                        System.out.println(numTab + " * " + i + " = " + result); }
                System.out.println("----------------------------------------");

                System.out.println("Atividade 25");
                System.out.print("Digite o valor em dólar: ");
                double Dolar = input.nextDouble();
                System.out.print("Digite a cotação do dólar: ");
                double cotacao = input.nextDouble();
                double valorReal = Dolar * cotacao;
                System.out.println("O valor em real é de: " + valorReal);
                System.out.println("----------------------------------------");

        }
        }