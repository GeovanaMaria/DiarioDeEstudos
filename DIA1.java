import java.util.Locale;
import java.util.Scanner;
public class DIA1 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

    /*EXPRESSOES ARITMÉTICAS

     (-)subtração
     (+)soma/concatenação
     (*)multiplicação
     (/)divisão
     (%)resto da divisão "mod";

    Assim como na matemática existe uma ordem de precedêndia, que deve ser seguida assim o calculo feito no programa será executado da maneira correta.

    ORDEM DE PRECEDÊNCIA:
    1° *, /, %;
    2° + e -;

    VARIÁVEIS: porção de memória utilizada para armazenar dados durante a execução de um programa;

    TIPOS DE VARIAVÉIS:
    String (conjunto de carateres)
    Char (caracter)
    Int (números inteiros)
    Double (números reais com precisão de 10 casas após à vírgula)
    Float (números reais com precisão de 6 casa após à vírgula)
    Boolean (true ou false)

    MANEIRAS DE ESCREVER O SYSTEM OUT PRINT:

    System.out.print() > imprime uma mensagem
    System.out.println() > imprime uma mensagem com a quebra de linha
    System.out.printf() > usado para imprimir mensagens, mais precisamente utilizada quando há variáveis com
    ponto flutuante(contendo mais de uma variável a ser impressa na mensagem), de uma maneira mais simples.
    É utilizado também para se obter um resultado mais preciso. */

---------------------------------------------------------------------------------------------------------------------------------

             // EXEMPLOS DE COMO IMPRIMIR  O PRINTF:

            //declaração das variáveis, e entrada de dados

            System.out.println("Informe dois numeros: ");
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double SOMA = A + B;

            System.out.printf("A soma é %.2f%n", SOMA);


   /* A expressão deve ser colocada entre aspas, exceto as variáveis;
    As variáveis que forem ser utilizadas naquele printf devem ser colocadas em ordem logo após a vírgula
    A expressao "%n" serve para quebra de linha;
    A expresaao "%.2f" informa a quantidade de casas decimais que será impressa em uma determina variável (double ou float).O programa irá imprimir no final da execusao;

    OBS: para os separadores decimais com ponto, é necessário declarar antes do scanner a seguinte expressão

            	Locale.setDefault(Locale.US);

    Assim, permite que o programa imprima na expressão (double ou float) o ponto, ao invés da vírgula.
    De modo geral para o printl e o println deve usar-se a concatenação (o sinal de +), para conectar a mensagem com as variáveis que serão impressas.
    Lembrando que a línguagen JAVA é "case sensitive" então todas as expressões devem ser escritas de maneira assertiva, respeitando sua pontuação
    e lógica na escrita do programa para que não ocorra erros no código; */

---------------------------------------------------------------------------------------------------------------------
   /* Exercicio 2 (printf):

   No final do programa a mensagem deve aparecer da seguinte forma:

    Products:
    Computer, which price is $ 2100,00
    Office desck, which price is $ 650,50

    Record: 30 years old, code 5290 and gender: F

    Mesuare which eight decimal places: 53,234567000
    Rouded (three decimal places): 53,235
    US decimal point: 53.235 */
----------------------------------------------------------------------------------------------------------------

    //CÓDIGO

    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;

    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("Products:");
    System.out.printf("%s, which price is $ %.2f%n", product1, price1);
    System.out.printf("%s, which price is $ %.2f%n", product2, price2);
    System.out.printf(" %nRecord: %d years old, code %d and gender: %c%n", age, code,gender);
    System.out.printf("%nMesuare with eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);

    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f", measure);

    }

}
