package lezioni.L05;

public class ArraysClient {
    // OVERVIEW: Client per la classe Arrays. Classe per testare le procedure di Arrays.

    public static void main(String[] args) {
            int[] a = {5, 7, 9, 1, 2, 8, 4};

            int[] b = null;

            int[] c = new int[0];

            int[] d = {7,20,40,41,55};

            // test search
            System.out.println("Arrays.search(a,1): " + Arrays.search(a,1));
            System.out.println("Arrays.search(a,10): " + Arrays.search(a,10));
            System.out.println("Arrays.search(b,3): " + Arrays.search(b,1));
            System.out.println("Arrays.search(c,1): " + Arrays.search(c,1));

            // test searchSorted
            System.out.println("Arrays.searchSorted(b,2): " + Arrays.searchSorted(b,2));
            System.out.println("Arrays.searchSorted(c,3): " + Arrays.searchSorted(c,3));
            System.out.println("Arrays.searchSorted(d,41): " + Arrays.searchSorted(d,41));
            System.out.println("Arrays.searchSorted(d,11): " + Arrays.searchSorted(d,11));


            // test sort
            System.out.print("Array a prima di Arrays.sort(a): ");
            Arrays.printArray(a);
            Arrays.sort(a);
            System.out.print("Array a dopo Arrays.sort(a): ");
            Arrays.printArray(a);

            // test boundArray
            System.out.print("Arrays.boundArray(d,22): ");
            Arrays.printArray(Arrays.boundArray(d,22));




    }
}
