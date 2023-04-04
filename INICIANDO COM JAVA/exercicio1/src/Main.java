import java.util.Scanner;

/* Faça um programa em Java que solicita um número
        inteiro positivo e calcule a soma dos números naturais
        até esse número. Utilize um loop while para realizar o
        cálculo.

 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma dos números naturais até " + numero + " é " + soma);
    }
}
