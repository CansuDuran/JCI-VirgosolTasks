package Task2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        int kenar1 = scanner.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        int kenar2 = scanner.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        int kenar3 = scanner.nextInt();

        if( kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Bu üçgen eşkenar üçgendir.");
        }  else
            System.out.print("Bu üçgen eşkenar üçgen değildir.");

        scanner.close();
    }
}
