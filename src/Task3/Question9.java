package Task3;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int top= 0;
        int num;

        do {
            System.out.print("Bir sayı giriniz: ");
            num = scanner.nextInt();
            top += num;
        } while (num != 0);

        System.out.println("Girilen sayıların toplamı: " + top);

        scanner.close();

    }
}
    //Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar devam
    // eden do-while döngüsü kullanan bir Java programı yazın.
