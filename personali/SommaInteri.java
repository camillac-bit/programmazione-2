/* Leggi due numeri interi da tastiera e stampa la loro somma. */

import java.util.Scanner;

public class SommaInteri {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("La somma tra " + a + " e " + b + ": " + (a+b));
            //per forzare il calcolo matematico bisogna mettere le parentesi
        }
    }
}
