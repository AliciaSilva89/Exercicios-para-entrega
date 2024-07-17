import java.util.Scanner;

//- Fatorial
//● Descrição: Escreva um programa que receba um número inteiro n e calcule o
//fatorial de n usando um loop while.
//● Exemplo de entrada: 5
//● Exemplo de saída: 120 (5 * 4 * 3 * 2 * 1)

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para n:");
        int n = sc.nextInt();
        int fatorial = n;

        while(n > 1 ){
            System.out.print(n + " ");
            fatorial *= (n - 1) ;
            n--;

        }
        System.out.println("\n O fatorial é:" + fatorial );
    }
}
