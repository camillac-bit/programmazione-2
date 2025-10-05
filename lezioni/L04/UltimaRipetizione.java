package lezioni.L04;

/* Scrivete un programma che, data una sequenza di argomenti sulla linea di comando, 
   emetta nel flusso di uscita l'ultimo argomento ripetuto.
   Il flusso di uscita deve contenere l'ultimo argomento ripetuto seguito da a-capo. */

public class UltimaRipetizione {
    public static void main(String[] args) {
        String ripetuta = "";
        boolean found = false;

        for(int i=args.length-1;i>=1 && !found;i--) {
            for(int j=i-1;j>=0;j--) {
                if(args[i].equals(args[j])) {
                    ripetuta=args[i];
                    found=true;
                    break;
                }
            }
        }

        System.out.println(ripetuta);
    }
}