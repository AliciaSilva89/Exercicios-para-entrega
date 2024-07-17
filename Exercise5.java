import java.util.Scanner;

//Inversão de Número
//● Descrição: Escreva um programa que inverta os dígitos de um número inteiro.
//● Exemplo de entrada: 12345
//● Exemplo de saída: 54321

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros inteiros:");//Apresentação de proposta para usuario

        //Declaração de variaveis
        int n = sc.nextInt();//declaração com captura de valor digitado
        int i = 0; //declaração com implementação

        while (n > 0) {//Condição a ser testada
            //casos seja verdade realiza a inversão
            //lembrando que a inversão e apenas a multiplicação e divisão
            i *= 10; i =
            i += (n% 10);
            n /= 10;
        }
        System.out.println("Numero ao contrario:" + i);//Apresentação do valor ao contrario
    }
}
