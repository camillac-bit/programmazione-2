package lezioni.L06;

import java.util.List;

/**
 * Classe di utilità per le liste. Fornisce procedure indipendenti per
 * manipolare liste di interi
 */
public class Lists {

    /** . */
    private Lists() {
    };

    /**
     * Cerca un elemento nella lista.
     * 
     * Se {@code x} sta in {@code l} restituisce un indice in cui {@code x} è
     * memorizzato,
     * altrimenti restituisce {@code -1}. Non muta il contenuto della lista.
     * 
     * @param l la lista di interi in cui cercare. Tutti gli elementi di l devono
     *          essere diversi
     *          da {@code null}.
     * @param x l'intero da cercare.
     * @return un indice in cui l'intero da cercare è memorizzato, oppure
     *         {@code -1}.
     */
    public static int search(List<Integer> l, int x) {
        if (l == null)
            return -1;

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == x) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Cerca un elemento in una lista ordinata in ordine non decrescente.
     * 
     * Se {@code x} sta in {@code l} restituisce un indice in cui {@code x} è
     * memorizzato,
     * altrimenti restituisce {@code -1}. Non muta il contenuto della lista.
     * 
     * @param l la lista di interi in cui cercare. l deve essere ordinata in ordine
     *          non decrescente
     *          e tutti i suoi elementi devono essere diversi da {@code null}.
     * @param x l'elemento da cercare.
     * @return un indice in cui l'intero da cercare è memorizzato, altrimenti
     *         {@code -1}.
     */
    public static int searchSorted(List<Integer> l, int x) {
        if (l == null)
            return -1;

        int i = 0;
        int f = l.size();
        while (i < f) {
            int m = (i + f) / 2;
            int midValue = l.get(m);
            if (midValue == x)
                return m;
            else if (x < midValue)
                f = m;
            else
                i = m + 1;
        }

        return -1;
    }

    /**
     * Riordina la lista in ordine non decrescente.
     * 
     * Ordina in loco gli elementi della lista in ordine non decrescente, modifica
     * quindi
     * la lista {@code l}. Non restituisce alcun valore.
     * 
     * @param l la lista da ordinare. Tutti gli elementi della lista devono essere
     *          diversi da
     *          {@code null}
     */
    public static void sort(List<Integer> l) {
        for (int i = 1; i < l.size(); i++) {
            int elem = l.get(i);
            int j = i - 1;

            while (j >= 0 && elem < l.get(j)) {
                l.set(j + 1, l.get(j));
                j--;
            }
            l.set(j + 1, elem);
        }
    }

    /**
     * Crea una nuova lista.
     * 
     * Restituisce una nuova lista {@code l2} contenente gli elementi di {@code l}
     * nello stesso
     * ordine. Gli elementi di {@code l} maggiori di {@code n} vengono sostituiti
     * con {@code n}.
     * Non modifica la lista.
     * 
     * @param l la lista sulla base della quale viene riempita {@code l2}. Tutti gli
     *          elementi
     *          di {@code l} devono essere diversi da {@code null}.
     * @param n l'intero con cui sostituire gli elementi di {@code l} che risultano
     *          maggiori
     * @return una nuova lista contenente gli elementi di {@code l}, dove tutti
     *         i valori di {@code n} sono stati sotituiti con {@code n}.
     */
    public static List<Integer> boundList(List<Integer> l, int n) {
        return l;
    }

}
