package Task3;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç değeri girin: ");
        int start = scanner.nextInt();

        System.out.print("Bitiş değeri girin: ");
        int end = scanner.nextInt();

        System.out.println(start + " ile " + end + " arasındaki Armstrong sayıları:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int originalNumber = num;
            int result = 0;
            int n = 0;

            while (originalNumber != 0) {
                originalNumber /= 10;
                ++n;
            }

            originalNumber = num;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                int power = 1;
                for (int j = 0; j < n; j++) {
                    power *= remainder;
                }
                result += power;
                originalNumber /= 10;
            }

            if (result == num) {
                System.out.println(num);
            }
        }
    }
}
// Belirli bir aralıktaki tüm Armstrong sayıları bulan bir Java programı yazın. Bir sayının Armstrong sayısı olup olmadığını kontrol eden bir algoritma yazın.
//Armstrong sayısı, n basamaklı bir sayının, basamaklarının n’inci kuvvetleri toplamına eşit olduğu sayıdır (örneğin 153 = 1³ + 5³ + 3³).