import java.util.Scanner;

//Conversão de Binário para Decimal
//● Descrição: Escreva um programa que converta um número binário (representado como uma string) para decimal.
//● Exemplo de entrada: 1010
//● Exemplo de saída: 10

public class exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um numero binario: (Usando 0 e 1)");//Apresentação de proposta ao usuario
        int num = sc.nextInt();//declaração mais captura do valor
        int decimal = 0;//declaração mais implementação
        int base = 1;//declaração mais implementação

        while(num > 0){//condição
            int aux = num % 10;//declaração mais implementação do calculo
            //calculo da convensão
            num = num / 10;
            decimal += aux * base;
            base *= 2;
        }
        System.out.println("Valor em decimal: " + decimal);//Apresentação do resultado
    }
}
