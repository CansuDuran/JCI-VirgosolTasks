package Task2;
import java.util.Scanner;


public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir yıl giriniz: ");
        int yil = scanner.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }
}
