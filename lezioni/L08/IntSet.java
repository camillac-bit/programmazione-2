package lezioni.L08;
/** Rappresenta un insieme di interi.
 * 
 * IntSet è mutabile e rappresenta un insieme illimitato di interi.
 * Un tipico insieme di interi è S={x1,x2,x3,...}.
 */
public class IntSet {

    /**
     * Inizializza {@code this} in modo che sia un insieme vuoto.
     * 
     * Dopo l'esecuzione del costruttore, l'insieme non contiene elementi.
     */
    public IntSet(){

    }

    /**
     * Inserisce un elemento nell'insieme {@code this}.
     * 
     * Inserisce un elemento {@code x} tra gli elementi di this,
     * in modo tale che this_post = {@code this} + {@code x}
     * Modifica {@code this}.
     * 
     * @param x l'elemento da inserire.
     */
    public void insert(int x){
    }

    /**
     * Rimuove un elemento dall'insieme {@code this}.
     * 
     * Rimuove un elemento {@code x} dall'insieme {@code this}, in modo tale che
     * this_post = {@code this} - {@code x}. Modifica {@code this}.
     * 
     * @param x l'elemento da rimuovere.
     */
    public void remove(int x) {
    }

    /**
     * Restituisce un elemento dell'insieme {@code this}.
     * 
     * Restituisce un elemento arbitrario dell'insieme {@code this}. Non modifica {@code this}.
     * @return un elemento qualsiasi dell'insieme.
     * @throws IllegalStateException se {@code this.size==0}
     */
    public int choose(){
        return 0;
    }

    /**
     * Determina se un elemento appartiene o meno a {@code this}. 
     * 
     * Restituisce {@code true} se {@code x} sta nell'insieme, altrimenti {@code false}.
     * Non modifica {@code this}.
     * 
     * @param x l'elemento di cui determinare la presenza.
     * @return {@code true} se {@code x} \in {@code this}, altrimenti {@code false}.
     */
    public boolean isIn(int x){
        return false;
    }

    /**
     * Determina la cardinalità di {@code this}.
     * 
     * Restituisce il numero di elementi che stanno nell'insieme.
     * Non modifica {@code this}.
     * 
     * @return il numero di elementi in {@code this}.
     * 
     */
    public int size() {
        return 0;
    }

}
