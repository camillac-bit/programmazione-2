import java.util.Scanner;

public class StringUtilsClient {
    public static void main(String[] args) {
        String word1, word2;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Inserisci la prima parola: ");
            word1 = sc.next();

            System.out.print("Inserisci la seconda parola: ");
            word2 = sc.next();
        }
        
        if (StringUtils.sonoPalin(word1)) {
            System.out.println(word1 + " è palindroma");
        }

        System.out.println(word1 + " contiene " + StringUtils.contaLettera(word1, 'a') + " a");

        if(StringUtils.sonoAnagrammi(word1, word2)) {
            System.out.println(word1 + " e " + word2 + " sono anagrammi");
        }

        System.out.println(StringUtils.cifra(word1));

        System.out.println(StringUtils.comprimi(word1));
    }
}
