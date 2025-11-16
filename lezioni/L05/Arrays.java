package lezioni.L05;

public class Arrays {
    // OVERVIEW: Classe di utilità per gli array. Questa classe fornisce procedure indipendenti
    //           per manipolare array di interi.

    public static int search(int[] a, int x){
        // EFFECTS: Se x sta in a, restituisce un indice dove x è memorizzato.
        //          Altrimenti, restituisce -1.
        return 0;
    }

    public static int searchSorted(int[] a, int x){
        // REQUIRES: a array ordinato in ordine crescente.
        // EFFECTS: Se x sta in a, restituisce un indice dove x è memorizzato.
        //          Altrimenti, restituisce -1.
        return 0;
    }

    public static void sort(int[] a){
        // MODIFIES: a
        // EFFECTS: Modifica a riordinando i suoi elementi in ordine crescente.
        //          Per esempio se a = [3, 1, 6, 1], a_post = [1, 1, 3, 6].
    }

    public static int[] boundArray(int[] a, int n){
        // EFFECTS: Restituisce un nuovo array contenente gli elementi di a nello stesso ordine.
        //          Gli elementi di a > n vengono sostituiti, nel nuovo array, con n.
        return a;
    }

    
}
