package Task2;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Bir sayı gririniz: ");
        int num = scanner.nextInt();

        if(num > 0)
            System.out.println("Sayı pozitiftir");
        if( num < 0 )
            System.out.println("Sayı negatiftir");
        if( num == 0)
            System.out.println("Sayı sıfırdır");

        scanner.close();



    }
}
