import java.util.Scanner;

//Contagem de Dígitos
//● Descrição: Escreva um programa que receba um número inteiro e conte quantos dígitos ele possui.
//● Exemplo de entrada: 12345
//● Exemplo de saída: 5

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um numero inteiro: ");//Apresenta proposta para usuario
        //Declaração das variaveis
        int d = sc.nextInt();//declaração mais a captura do numero digitado
        int contador = 1;//declaração mais implementação de valor, o contador precisa começar em 1 pois e o minimo de digitos que o usuario ira digitar
        while (d >= 10){ //Demorei exatos 30 minutos para entender o exercicio, pensei me varias formas de fazer que envolveriam vetores, por fim a unica forma que encontrei seria usando lista, porem foi solicitado que não usa-se!!
            d /= 10;//A minha ideia final foi que por vez o d siga a condição de ser menor que 10, pois até 10 os valores possuim 1 digitado, acaso o valor seja acima de 10 ele deve ser somado e dividido por 10 para encontrar a quantidade de digitos
            contador++; //soma mais 1 a contagem
        }
        System.out.println("O numero digitado possui" + " "+ contador + " "+ "digitos");
    }
}
