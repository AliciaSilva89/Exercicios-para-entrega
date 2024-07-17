import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva alguns digitos: ");
        int d = sc.nextInt();
        int contador = 1;
        while (d >= 10){ //Demorei exatos 30 minutos para entender o exercicio, pensei me varias formas de fazer que envolveriam vetores, por fim a unica forma que encontrei seria usando lista, porem foi solicitado que não usa-se!!
            d /= 10;
            contador++;
        }
        System.out.println(contador);
    }
}
