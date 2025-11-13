import java.util.Scanner;

public class MainRettangolo {
    public static void main(String[] args){
        double h, b;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("base: ");
            b = sc.nextDouble();
            System.out.print("altezza: ");
            h = sc.nextDouble();
        }

        Rettangolo r = new Rettangolo(b,h);

        System.out.println(r);
    }
}
