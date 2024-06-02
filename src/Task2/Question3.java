package Task2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        int carp = num1 * num2;

        System.out.print("Sayıların çarpımı: " + carp);
        scanner.close();

    }
}
