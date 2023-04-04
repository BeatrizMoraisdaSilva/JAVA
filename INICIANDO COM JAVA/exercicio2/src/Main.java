/*
Escreva um programa em Java que recebe um número
inteiro positivo e imprime se ele é um número primo ou
não. Utilize um loop for para testar se o número é primo.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
         int numero = input.nextInt();


         boolean primo = true;

         for (int i = 2; i < numero; i++){
             if (numero % i == 0){
                 primo = false;
                 break;
             }
         }

         if (primo){
             System.out.printf(numero + "é um número primo.");
         } else{
             System.out.printf(numero + "não é um número primo.");
         }

    }
}