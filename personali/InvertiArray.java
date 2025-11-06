/* Leggi un array di numeri da linea di comando e stampalo al contrario. */
public class InvertiArray {
    public static void main(String[] args){
        for(int i=args.length-1;i>=0;i--){
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
