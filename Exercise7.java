import java.util.Scanner;

//Palíndromo
//● Descrição: Escreva um programa que verifique se um número inteiro é um palíndromo (lê-se da mesma forma de trás para frente).
//● Exemplo de entrada: 1221
//● Exemplo de saída: true

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");//apresentação da proposta ao usuario
        int num = sc.nextInt();//declaração mais captura do valor
        int numoriginal = num;//declaração mais implementação
        int i = 0;//declaração mais implementação

        //exercicio reaproveitado
        while (num > 0) {
            i *= 10;
            i += (num% 10);
            num /= 10;
        }

        //apenas comparação entre os valores
        if(numoriginal == i){
            System.out.println("É um palíndromo");//caso seja verdade imprime essa mensagem
        }else{
            System.out.println("Não é palíndromo");//caso não impreme essa mensagem
        }
    }
}
