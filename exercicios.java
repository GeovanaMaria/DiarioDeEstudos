import java.util.Locale;
import java.util.Scanner;

public class exercicios {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Exercicios:

//00: imprima na tela a mensagem: Hello World!

                System.out.println("Hello World!");

/*-----------------------------------------------------------------------------------------------------------------*/

/*01: Leia dois valores inteiros, e imprima a soma desses números

            int A, B, X;
            System.out.println("informe dois valores: ");
            A = sc.nextInt();
            B = sc.nextInt();

            X = A+ B;
            System.out.println("x = " + X);

 --------------------------------------------------------------------------------------------------------------*/

/*02: Efetue o calculo da area: (formula > area = n * (raoio * raio)/ pi = 3,14159)
OBS: imprima o resultdo com 4 casas decimais.

        double area, raio, pi = 3.14159;

        System.out.println("informe o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A=%.4f%n", area);

 ----------------------------------------------------------------------------------------------------------------*/

/*03: Leia dois valores inteiros, calcule o produto entre os dois valores e imprima o resultado.

        int a, b, prod;

        System.out.println("informe dois svalores: ");
        a = sc.nextInt();
        b = sc.nextInt();

        prod = a * b;

        System.out.println("PRODUTO = "+ prod);

-----------------------------------------------------------------------------------------------------------------*/

/*04: Leia duas notas do aluno, e imprima a média deles (sabendo que nota 1 tem peso 3.5 e nota2 tem peso 7.5, totalizando peso 11)

            double nota1, nota2, media;
            System.out.println("informe duas notas: ");
             nota1 = sc.nextDouble();
             nota2 = sc.nextDouble();

             media = (nota1 * 3.5 + nota2 * 7.5) / 11.0;

             System.out.printf("MEDIA = %.5f%n", media);

------------------------------------------------------------------------------------------------------------------*/

/*05: Leia 3 valores que serão representados pela nota de três alunos, calcule a média levamdo em consideração que a
        (nota A tem peso 2, B peso 3, C peso 5).


                System.out.println("informe três notas: ");
                     double a = sc.nextDouble();
                     double b = sc.nextDouble();
                     double c = sc.nextDouble();
                     double Media = (a * 2 + b * 3 + c * 5) /10;

                     System.out.printf("MEDIA = %.1f%n", Media);
-----------------------------------------------------------------------------------------------------------------------*/

/*06: Leia 3 valores inteiros, calcule e motsre a diferença do produto A e B, do produto C e D, use a
        seguinte formula DIFERENCA = (A * B - C * D).

                int A,B,C,D, DIFERENCA;
                System.out.println("Informe quatro numeros inteiros: ");
                A = sc.nextInt();
                B = sc.nextInt();
                C = sc.nextInt();
                D = sc.nextInt();

                DIFERENCA = A * B - C * D;

                System.out.println("DIFERENCA = " +DIFERENCA);
-------------------------------------------------------------------------------------------------------------------------*/

/*07: Leia o id de um funcionário, suas horas trabalhadas, valor que recebe por hora, e calcule o valor de
        seu salário.

                int num, horaTrabalho;
                double ganhoPorHora, salario;

                System.out.println("Informe seu id: ");
                num = sc.nextInt();
                System.out.println("Informe suas horas trabalhadas: ");
                horaTrabalho = sc.nextInt();
                System.out.println("Informe quanto vale sua hora: ");
                ganhoPorHora = sc.nextDouble();

                salario = ganhoPorHora * horaTrabalho;

                System.out.println("NUMBER = "+num);
                System.out.printf("SALARY = U$ %.2f%n", salario);
-------------------------------------------------------------------------------------------------------------------------*/

/*08: Leia o nome de um vendedor, seu salário fixo, e o total d evendas efetuadas no mês. Leve em
        consideração que esse vendedor ganha 15% de comissão sobre suas vendas realizadas. Informe o total que ele irá receber
        (com duas casas decimais).

                     System.out.println("Insira o nome, salario, e vendas efetuadas: ");
                     String nome = sc.next();

                     double sal = sc.nextDouble();
                     double vendas = sc.nextDouble();
                     double receber = sal + vendas * 0.15;

                     System.out.printf("TOTAL = R$ %.2f%n", receber);
-------------------------------------------------------------------------------------------------------------------------*/

/*09:  ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça
         2, o número de peças 2 e o valor unitário de cada peça 2, calcule e mostre o valor a ser pago.

                int cod1, cod2, quant1, quant2;
                double valorUni1, valorUni2, total;

                System.out.println("Insira o código, quantidade, e valor da unidade do prod 1: ");
                cod1 = sc.nextInt();
                quant1 = sc.nextInt();
                valorUni1 = sc.nextDouble();
                System.out.println("Insira o código, quantidade, e valor da unidade do prod 2: ");
                cod2 = sc.nextInt();
                quant2 = sc.nextInt();
                valorUni2 = sc.nextDouble();

                total = (quant1 * valorUni1) + (quant2 * valorUni2);

                System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
-------------------------------------------------------------------------------------------------------------------------*/

/*10: Calcule e mostre o volume d euma esfera, sendo fornecido raio (R), para calcular o volume use:  (4/3) * pi * (R * R * R)
        Lembrando que o valor de pi é 3.14159.

        double raio, volume;
        double pi = 3.14159;

        System.out.println("Informe o valor do raio: ");
        raio = sc.nextDouble();
        volume = 4.0/3.0 * pi * Math.pow(raio, 3.0);

        System.out.printf("VOLUME = %.3f\n", volume);
---------------------------------------------------------------------------------------------------------------------------*/

    }
}
