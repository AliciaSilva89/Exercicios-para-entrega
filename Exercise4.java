import java.util.Scanner;

//Números Primos
//● Descrição: Escreva um programa que verifique se um número inteiro é primo.
//● Exemplo de entrada: 29
//● Exemplo de saída: true

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");//Apresentação da proposta para usuario
        //Declaração das variaveis
        int num = sc.nextInt(); //declaração com a captura do valor do usuario
        boolean  isPrime = true;//declaração em boolean para que tenha apenas duas condições

        for(int i = 2; i < num; i++) {//Estrutura for para teste se o numero é primo, iniciando no valor 2 e sendo menor que valor digitado
            if(num % i == 0) {//verificação se o numero e divisivel por ele mesmo
                isPrime = false;//caso seja ele não e primo e assume condição false
                break;//sai do for
            }
        }
        if(isPrime && num > 1){//condição para caso o numero tenha condição true e seja maior que 1 (pq 1 não é primo)
            System.out.println("O numero digitado é primo");//caso a condição seja atendida e apresentado a mensagem

        }else{
            System.out.println("O numero não é primo");//caso não seja atendido apresenta mensagem
        }
    }
}
