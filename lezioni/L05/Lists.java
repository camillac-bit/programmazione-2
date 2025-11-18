package lezioni.L05;

import java.util.List;

public class Lists {
    // OVERVIEW: Classe di utilità per liste. Fornisce procedure indipendenti per
    // manipolare le liste.

    public static void removeDupls(List<Integer> l) {
        // REQUIRES: Tutti gli elementi di l devono non devono essere null.
        // MODIFIES: l
        // EFFECTS: Rimuove tutti gli elementi duplicati da l; utilizza equals.

        if (l == null)
            return;

        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    l.remove(j);
                    j--;
                }
            }
        }
    }
}