package lezioni.L05;

public class Arrays {
    // OVERVIEW: Classe di utilità per gli array. Questa classe fornisce procedure
    // indipendenti per manipolare array di interi.

    public static int search(int[] a, int x) {
        // EFFECTS: Se x sta in a, restituisce un indice dove x è memorizzato.
        // Altrimenti, restituisce -1.

        if (a == null)
            return -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }

        return -1;
    }

    public static int searchSorted(int[] a, int x) {
        // REQUIRES: a array ordinato in ordine crescente.
        // EFFECTS: Se x sta in a, restituisce un indice dove x è memorizzato.
        // Altrimenti, restituisce -1.
        if (a == null)
            return -1;
        int i = 0;
        int f = a.length;
        while (i < f) {
            int m = (i + f) / 2;
            if (a[m] == x)
                return m;
            else if (x < a[m])
                f = m;
            else
                i = m + 1;
        }

        return -1;
    }

    public static void sort(int[] a) {
        // MODIFIES: a
        // EFFECTS: Modifica a riordinando i suoi elementi in ordine crescente.
        // Per esempio se a = [3, 1, 6, 1], a_post = [1, 1, 3, 6].

        if (a == null)
            return;

        for (int k = 0; k < a.length - 1; k++) {
            int m = k;
            for (int j = k + 1; j < a.length; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }

            if (k != m) {
                int temp = a[k];
                a[k] = a[m];
                a[m] = temp;
            }
        }
    }

    public static int[] boundArray(int[] a, int n) {
        // EFFECTS: Restituisce un nuovo array contenente gli elementi di a nello stesso
        // ordine.
        // Gli elementi di a > n vengono sostituiti, nel nuovo array, con n.

        if (a == null)
            return null;

        int[] b = new int[a.length];
        int i = 0;
        for (int elem : a) {
            if(elem>n) b[i] = n;
            else b[i] = elem;
            i++;
        }
        return b;
    }

    public static void printArray(int[] a){
        // OVERVIEW: Stampa il contenuto dell'array a e un ritorno a capo.
        //           Se l'array è null o vuoto non fa niente.

        if (a==null) return;
        for(int elem : a) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int[] filterRange(int[] a, int min, int max) {
        // REQUIRES: min<=max
        // EFFECTS: Se a è null rstituisce null.
        //          Altrimenti restituisce un nuovo array b contenente soltanto gli elementi di a 
        //          compresi tra min e max (estremi inclusi). Gli elementi in b mantengono
        //          l'ordine originale.

        return a;
    }
}
