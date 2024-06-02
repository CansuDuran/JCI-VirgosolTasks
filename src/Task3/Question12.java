package Task3;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num= scanner.nextInt();

        int asalCarpan = 0;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                asalCarpan++;
                System.out.println(asalCarpan + ". asal çarpan: " + i);
                num /= i;
            }
        }

        System.out.println("Toplam asal çarpan sayısı: " + asalCarpan);

        scanner.close();
    }
}
