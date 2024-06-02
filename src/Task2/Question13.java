package Task2;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.print("Aranacak karakter: ");
        char karakter = scanner.next().charAt(0);

        int pozisyon = metin.indexOf(karakter);

        if (pozisyon != -1) {
            System.out.println("Karakter '" + karakter + "' " + (pozisyon + 1) + ". pozisyonda bulunuyor.");
        } else {
            System.out.println("Karakter '" + karakter + "' metinde bulunamadı.");
        }

        scanner.close();

    }
}
