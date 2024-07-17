import java.util.Scanner;

//Série de Fibonacci
//● Descrição: Escreva um programa que imprima os primeiros n números da série de Fibonacci.
//● Exemplo de entrada: 5
//● Exemplo de saída: 0, 1, 1, 2, 3

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");//apresentação de proposta ao usuario
        int num = sc.nextInt();//declaração mais captura de valor
        int x=0;//declaração mais implementação
        int y=1;//declaração mais implementação
        int aux;//declaração de auxiliar

        System.out.println("Sequencia fibonaci:");//Apresenta a mensagem
        for(int i = 0; i < num; i++){//laço for
            if(i  == 0){//condição
                System.out.println(x);//apresentação resultado
            } else if (i == 1) {//teste de condição caso a anterior n seja verdade
                System.out.println(y);//apresenta resultado
            } else {//caso não seja nenhuma das outras
                //reliza esse calculo
                aux = x + y;
                x = y;
                y = aux;

                System.out.println(aux);//apresta resultado
            }
        }
    }
}
