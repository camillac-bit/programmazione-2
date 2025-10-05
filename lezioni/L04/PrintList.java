package lezioni.L04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintList {
	public static void main(String[] args){
		List<String> parole = new ArrayList<>();
		/* List è astratta, è un interfaccia
			 e non sa fare nulla, non esiste un costrutture
			 List, quindi devo scegliere il costrutture in base a come voglio implementarla.
			 Quindi vogliamo costruire una sua implemnetazione.
			 Se non scriviamo niente tra le parentesi angolari, fa type inference
			 sulla base di quello che abbiamo scritto a sx */
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNextLine()) parole.add(sc.nextLine());
		}
		
		printReverse(parole);
	}
	
	static void printReverse(List<String> l) {
		//for(int i=l.size()-1;i>=0;i--) System.out.println(l.get(i));
        for (String s : l.reversed()) System.out.println(s);
	}
	
}
