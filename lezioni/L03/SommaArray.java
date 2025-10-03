public class SommaArray {
    public static void main(String[] args){
      int[] primi = {1,2,3};
      int somma=0;

      for(int i=0;i<primi.length;i++){
        somma+=primi[i];
      }  

      IO.println(somma);
    }
}