public class SommaArray {
	public static void main(String[] args){
		int[] primi = {1,2,3};
		int[] secondi = {-1,-2,-3};
		
		IO.println(somma(primi));
		IO.println(somma(secondi));
	}
	
	static int somma(int[] valori){
		int somma = 0;
		for(int i=0;i<valori.length;i++){
			somma+=valori[i];
		}
		return somma;
	}
}