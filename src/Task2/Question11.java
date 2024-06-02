package Task2;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.print("Kontrol edilecek kelime: ");
        String kelime = scanner.nextLine();

        if (cumle.startsWith(kelime)) {
            System.out.println("Cümle '" + kelime + "' ile başlıyor.");
        } else {
            System.out.println("Cümle '" + kelime + "' ile başlamıyor.");
        }

        scanner.close();
    }
}
