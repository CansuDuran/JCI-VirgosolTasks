package Task3;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        int basTop = 0;

        for (int i = num ; i != 0; i /= 10) {
            basTop += i % 10;
        }

        System.out.println("Sayının basamakları toplamı: " + basTop);

        scanner.close();
    }
}
