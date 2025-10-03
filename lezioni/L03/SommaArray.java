import java.util.Scanner;

public class SommaArray {
    public static void main(String[] args){
        int[] valori = new int[10];
        int letti = 0;

        // try-with-resources: Scanner viene chiuso automaticamente alla fine
        try (Scanner sc = new Scanner(System.in)) { 
            while (letti < valori.length && sc.hasNextInt()) {
                valori[letti++] = sc.nextInt(); // "scanner dimmi il prossimo intero"
            }
        } // sc.close() viene chiamato automaticamente qui

        System.out.println(somma(valori)); // "flusso di uscita stampa"
    }

    static int somma(int[] valori){
        int somma = 0;
        for(int i = 0; i < valori.length; i++){
            somma += valori[i];
        }
        return somma;
    }
}