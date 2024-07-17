import java.util.Scanner;

//- Potência
//● Descrição: Escreva um programa que calcule a potência de um número base elevado a expoente usando um loop for.
//● Exemplo de entrada: 2 (base), 3 (expoente)
//● Exemplo de saída: 8 (2^3)

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero base: ");//Apresentação da proposta ao usuario
        int base = sc.nextInt();//declaração mais a captura do valor
        System.out.println("Digite o numero expoente: ");//apresentação da proposta ao usuario
        int expoente = sc.nextInt();//declaração mais captura do valor

        int resultado = 1;//declaração do resultado mais implementação
        for(int i = 0; i < expoente; i++){//laço for aonde o o i declaro se inicia na primeira posição, roda ate o valor digitado pelo usuario e anda uma posicão por vez
            resultado = resultado * base;//caso entre no laço realiza a multiplicação do resultado mais a base declarada
        }
        System.out.println(" "+base+ "^" +expoente+"="+resultado);//apresentação do resultado
    }
}
