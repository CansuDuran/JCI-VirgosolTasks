package Task2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");

        int num = scanner.nextInt();
        if (num < 0){
            System.out.println("Sayı negatiftir ");

        }
        scanner.close();


    }
}
