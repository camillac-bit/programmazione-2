import java.util.Arrays;

public class StringUtils {

    public static boolean sonoPalin(String s) {
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int contaLettera(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static boolean sonoAnagrammi(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static String cifra(String s) {
        char[] a = s.toCharArray();
        int shift = 2;
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            if (c >= 'a' && c <= 'z') {
                a[i] = (char) (((c - 'a' + shift) % 26) + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                a[i] = (char) (((c - 'A' + shift) % 26) + 'A');
            }
        }

        return new String(a);
    }

    /*
     * riduce una stringa sostituendo
     * sequenze di lettere uguali consecutive con la lettera seguita dal numero di
     * ripetizioni.
     * Se una lettera compare una sola volta, deve comunque essere seguita da 1.
     * Se input : "aaabbccccd", output: "a3b2c4d1"
     */
    public static String comprimi(String s) {
        if (s.length() == 0) {
            return s;
        }

        int count = 1;
        String newS = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {
                newS += count;
                newS += s.charAt(i);
                count = 1;
            }

        }

        return newS + count;
    }

}
