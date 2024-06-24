package Task5;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        int[] dizi = {5, 12, 9, 3, 17, 6};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak sayıyı girin: ");
        int arananSayi = scanner.nextInt();


        boolean varMi = false;
        for (int sayi : dizi) {
            if (sayi == arananSayi) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println(arananSayi + " dizide bulunmaktadır.");
        } else {
            System.out.println(arananSayi + " dizide bulunmamaktadır.");
        }
    }
}
//int tipinde bir dizi oluşturun ve kullanıcıdan bir sayı alın.
// Bu sayının dizide olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
