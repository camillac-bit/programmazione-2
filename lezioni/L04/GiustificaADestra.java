package lezioni.L04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiustificaADestra {
    public static void main(String[] args) {
        List<String> parole = new ArrayList<>();
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) parole.add(sc.next());
        }
        printRightAligned(parole);
    }

    static int maxLength(List<String> l) {
        int max = 0;
        if(l.size()!=0) {
            max=l.get(0).length();
            for(int i=1;i<l.size();i++) {
                int parolaLength = l.get(i).length();
                if(parolaLength>max) {
                    max=parolaLength;
                }
            }
        }
        
        return max;
    }

    static void printRightAligned(List<String> l) {
        int max = maxLength(l);
        for(String parola : l) {
            int numSpazi=max-parola.length();
            for(int i=0;i<numSpazi;i++){
                System.out.print(" ");
            }
            System.out.println(parola);
        }
    }
}