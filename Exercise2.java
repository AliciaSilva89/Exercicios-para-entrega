import java.util.Scanner;

//- Fatorial
//● Descrição: Escreva um programa que receba um número inteiro n e calcule o fatorial de n usando um loop while.
//● Exemplo de entrada: 5
//● Exemplo de saída: 120 (5 * 4 * 3 * 2 * 1)

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para n:");//Apresentação da proposta ao cliente

        //Declaração da variavel
        int n = sc.nextInt();//Captura do valor digitado ja com a declaração
        int fatorial = n; //Declaração de fatorial com a implementação do valor n

        while(n > 1 ){ //Conndição a ser testada
            System.out.print(n + " ");//apresentação de resultado
            fatorial *= (n - 1) ;//calculo para fatorial
            n--;//subtração do valor n

        }
        System.out.println("\n O fatorial é:" + fatorial ); //Apresentação do resultado final
    }
}
