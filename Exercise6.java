import java.util.Scanner;

//- Potência
//● Descrição: Escreva um programa que calcule a potência de um número base
//elevado a expoente usando um loop for.
//● Exemplo de entrada: 2 (base), 3 (expoente)
//● Exemplo de saída: 8 (2^3)

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero base: ");
        int base = sc.nextInt();
        System.out.println("Digite o numero expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;
        for(int i = 0; i < expoente; i++){
            resultado = resultado * base;
        }
        System.out.println(" "+base+ "^" +expoente+"="+resultado);
    }
}
