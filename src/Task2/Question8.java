package Task2;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num  = scanner.nextInt();

        if ( num % 3 == 0 && num % 5 == 0){
            System.out.println("Sayı hem 3 hem de 5 bölünebilir");
        }else {
            System.out.println("Sayı hem 3 hem de 5 bölünemez");
        }
        scanner.close();

    }
}
