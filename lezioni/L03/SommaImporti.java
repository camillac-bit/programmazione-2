import java.util.Scanner;
public class SommaImporti {
    public static void main(String[] args) {
        double somma = 0;
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNextDouble()) {    //esempio con 0,1+0,2
                somma+=sc.nextDouble();
            }
        }
        System.out.println(somma);

    }
}
