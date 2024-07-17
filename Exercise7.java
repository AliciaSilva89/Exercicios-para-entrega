import java.util.Scanner;

//Palíndromo
//● Descrição: Escreva um programa que verifique se um número inteiro é um
//palíndromo (lê-se da mesma forma de trás para frente).
//
//● Exemplo de entrada: 1221
//● Exemplo de saída: true

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        int numoriginal = num;


        int i = 0;
        while (num > 0) {
            i *= 10;
            i += (num% 10);
            num /= 10;
        }

        if(numoriginal == i){
            System.out.println("É um palíndromo");
        }else{
            System.out.println("Não é palíndromo");
        }
    }
}
