import java.util.Scanner;

//Múltiplos de um Número
//● Descrição: Escreva um programa que imprima todos os múltiplos de um número n até um limite m.
//● Exemplo de entrada: 3 (n), 15 (m)
//● Exemplo de saída: 3, 6, 9, 12, 15


public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");//apresenta a proposta ao usuario
        int n = sc.nextInt();//declaração mais captura do valor

        System.out.print("Digite um limite: ");//apresenta proposta ao usuario
        int m = sc.nextInt();//declaração mais captura do valor

        System.out.print("Multiplos de" + n + "ate" + m + ": ");//apresenta extrutura da conta

        for(int i = n; i <= m; i += n){//laço para repetição da conta ate que tenha o resultado
            System.out.println(i);//apresenta o resultado
        }
    }
}
