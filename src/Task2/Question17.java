package Task2;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int num = scanner.nextInt();

        int kare = num * num;

        int kup = num * num * num;

        System.out.println("Karesi: " + kare);
        System.out.println("Küpü: " + kup);
        scanner.close();
    }
}
