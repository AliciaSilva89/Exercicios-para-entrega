import java.util.Scanner;

//- Soma de Números
//● Descrição: Escreva um programa que receba um número inteiro n e calcule a soma dos números de 1 a n usando um loop for.
//● Exemplo de entrada: 5
//● Exemplo de saída: 15 (1 + 2 + 3 + 4 + 5)

public class Exercise1 {
    public static void main(String[] args) {

        //Declaração de variaveis
        int n;
        int soma = 0; //Soma precisa começar em zero para que não pegue valor de resto

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");//Para que o usuario saiba o que ser feito
        n = sc.nextInt(); //recebe o valor digitado pelo usuario

        System.out.print("Sequencia de numeros cuja soma resulta em " + n + ": "); //Apresenta ao usuario o resultado a estrutura da soma dos valores

        for (int i = 1; soma + i <= n; i++){ //Declarei que a contagem deve se iniciar no 1, parar no meu valor n e andar e somar i+ 1 a cada rodada
            System.out.print(i + " ");//Coloquei esse print apenas para que aparece-se  os valores somados
            soma += i; //soma dos valores
        }

        System.out.println("\nA soma dos números é: " + soma); //apresentação do valor final
        sc.close();
    }
}
