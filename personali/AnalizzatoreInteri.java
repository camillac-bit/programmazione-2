/*  Scrivere un programma che:
    Chieda all’utente quanti numeri vuole inserire. Li legga uno per uno e li salvi in un array.
    Alla fine, calcoli e stampi:
        la media dei numeri,
        il valore massimo,
        il valore minimo,
        quanti numeri sono pari e quanti dispari. */

import java.util.Scanner;

public class AnalizzatoreInteri {
    public static void main(String[] args){
        int[] numeri;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Quanti numeri? "); 

            int n = sc.nextInt();

            numeri = new int[n];

            System.out.println("Numeri:");

            for(int i=0;i<n;i++) {
                numeri[i]=sc.nextInt();
            }
        }

       System.out.println("Media: " + avg(numeri));
       System.out.println("Massimo: " + max(numeri));
       System.out.println("Minimo: " + min(numeri));
       System.out.println("Pari: " + countPari(numeri));
       System.out.println("Dispari: " + countDispari(numeri));

    }

    public static int max(int[] num){
        int max = num[0];
        
        for(int i=1;i<num.length;i++){
            if(num[i]>max) {
                max=num[i];
            }
        }
        return max;
    }

    public static int min(int[] num){
        int min = num[0];
        
        for(int i=1;i<num.length;i++){
            if(num[i]<min) {
                min=num[i];
            }
        }
        return min;
    }

    public static double avg(int[] num) {
        int somma = 0;
        for(int i=0;i<num.length;i++){
            somma += num[i];
        }
        return (double) somma / num.length;
    }

    public static int countPari(int[] num){
        int count = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                count++;
            }
        }
        return count;
    }

     public static int countDispari(int[] num){
        int count = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                count++;
            }
        }
        return count;
    }
}
