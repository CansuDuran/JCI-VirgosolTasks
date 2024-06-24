package Task5;
import java.util.Scanner;
import java.util.ArrayList;
public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println("10 adet tam sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            int sayi = scanner.nextInt();
            sayilar.add(sayi);
        }

        int ciftSayisi = 0;
        int tekSayisi = 0;
        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayisi++;
            } else {
                tekSayisi++;
            }
        }

        System.out.println("Çift sayıların sayısı: " + ciftSayisi);
        System.out.println("Tek sayıların sayısı: " + tekSayisi);

        scanner.close();
    }
}
//Bir ArrayList kullanarak kullanıcıdan alınan 10 farklı tam sayıyı saklayın.
//Bu tam sayılardan kaç tanesinin çift, kaç tanesinin tek olduğunu bulan ve sonucu ekrana yazdıran bir program yazın.
