import java.util.Scanner;

//Conversão de Binário para Decimal
//● Descrição: Escreva um programa que converta um número binário (representado
//como uma string) para decimal.
//● Exemplo de entrada: 1010
//● Exemplo de saída: 10

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero binario: (Usando 0 e 1)");
        int num = sc.nextInt();
        int decimal = 0;
        int base = 1;

        while(num > 0){
            int aux = num % 10;
            num = num / 10;
            decimal += aux * base;
            base *= 2;
        }
        System.out.println("Valor em decimal: " + decimal);
    }
}
