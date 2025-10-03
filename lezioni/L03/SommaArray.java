import java.util.Scanner;

public class SommaArray {
	public static void main(String[] args){
		int[] valori = new int[10];
		Scanner sc = new Scanner(System.in); //creaimo scannere che può scannerizzare
											 //da System.in =
											 //= flusso di ingresso
		int letti=0;
		while(letti<valori.length && sc.hasNextInt()) {
			valori[letti++] = sc.nextInt(); //"scanner dimmi il prossimo intero"
		}
		sc.close();
		System.out.println(somma(valori)); //"flusso di uscita stampa"
	}
	
	static int somma(int[] valori){
		int somma = 0;
		for(int i=0;i<valori.length;i++){
			somma+=valori[i];
		}
		return somma;
	}
}