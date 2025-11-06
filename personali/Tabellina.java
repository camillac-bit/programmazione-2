/* Chiedi un numero n e stampa la tabellina di n fino a 10. */

import java.util.Scanner;

class Tabellina {
    public static void main(String[] args){
        int num;
        try(Scanner sc = new Scanner(System.in)){
            do {
                System.out.print("Inserisci un numero da 1 a 10: ");
                num = sc.nextInt();
            } while(num<1 || num>10);
        }

        for(int i=0;i<=10;i++){
            System.out.println(i + " * " + num + " = " + i*num);
        }
    }
}