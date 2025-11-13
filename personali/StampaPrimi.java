/* Stampa tutti i numeri primi fino a n. */

import java.util.Scanner;

public class StampaPrimi {
    public static void main(String[] args){
        int n;
        try(Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Inserisci un numero > 1: ");
                n = sc.nextInt();
            } while(n<=1);
            
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        for(int i=2;i<=num/2;i++) {
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
}
