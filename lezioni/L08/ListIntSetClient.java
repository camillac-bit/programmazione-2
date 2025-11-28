package lezioni.L08;

/** Classe per testare alcuni metodi di {@link ListIntSet} */
public class ListIntSetClient {
    /** . */
    private ListIntSetClient(){}

    /** Test di alcuni metodi di {@link ListIntSet}
     * 
     * Crea un insieme e inserisce in questo insieme gli elementi contenuti in {@code args}.
     * Sceglie un elemento arbitrario dell'insieme e lo rimuove, per poi verificare se l'elemento
     * è stato effettivamente rimosso.
     * 
     * @param args l'array contenente gli elementi passati da linea di comando, da inserire come
     * elementi dell'insieme creato.
     * 
     */
    public static void main(String[] args){
        ListIntSet s = new ListIntSet();
        for(String elem : args){
            s.insert(Integer.parseInt(elem));
        }

        int x = s.choose();

        System.out.println("Elemento scelto: " + x);

        s.remove(x);

        System.out.println(x + " fa parte dell'insieme? " + s.isIn(x));
        


    }
}
