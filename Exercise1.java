import java.util.Scanner;

//- Soma de Números
//● Descrição: Escreva um programa que receba um número inteiro n e calcule a soma
//dos números de 1 a n usando um loop for.
//● Exemplo de entrada: 5
//● Exemplo de saída: 15 (1 + 2 + 3 + 4 + 5)

public class Exercise1 {
    public static void main(String[] args) {
        int n;
        int soma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        System.out.print("Sequencia de numeros cuja soma resulta em " + n + ": ");

        for (int i = 1; soma + i <= n; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\nA soma dos números é: " + soma);
        sc.close();
    }
}
