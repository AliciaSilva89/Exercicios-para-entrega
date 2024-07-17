import java.util.Scanner;

//Números Primos
//● Descrição: Escreva um programa que verifique se um número inteiro é primo.
//● Exemplo de entrada: 29
//● Exemplo de saída: true

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();
        boolean  isPrime = true;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime && num > 1){
            System.out.println("O numero digitado é primo");

        }else{
            System.out.println("O numero não é primo");
        }
    }
}
