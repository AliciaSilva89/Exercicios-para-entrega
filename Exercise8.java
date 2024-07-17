import java.util.Scanner;

//Múltiplos de um Número
//● Descrição: Escreva um programa que imprima todos os múltiplos de um número n
//até um limite m.
//● Exemplo de entrada: 3 (n), 15 (m)
//● Exemplo de saída: 3, 6, 9, 12, 15


public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        System.out.print("Digite um limite: ");
        int m = sc.nextInt();

        System.out.print("Multiplos de" + n + "ate" + m + ": ");

        for(int i = n; i <= m; i += n){
            System.out.println(i);
        }
    }
}
