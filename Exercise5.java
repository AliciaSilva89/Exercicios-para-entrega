import java.util.Scanner;

//Inversão de Número
//● Descrição: Escreva um programa que inverta os dígitos de um número inteiro.
//● Exemplo de entrada: 12345
//● Exemplo de saída: 54321

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros inteiros:");
        int n = sc.nextInt();

        int i = 0;
        while (n > 0) {
            i *= 10;
            i += (n% 10);
            n /= 10;
        }
        System.out.println("Numero ao contrario:" + i);
    }
}
