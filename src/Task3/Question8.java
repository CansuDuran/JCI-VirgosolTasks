package Task3;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        int basTop = 0;

        while (num != 0) {
            basTop+= num % 10;
            num /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + basTop);
        scanner.close();

    }
}
//Bir sayının basamaklarını toplayan ve while döngüsü kullanan bir Java programı yazın.