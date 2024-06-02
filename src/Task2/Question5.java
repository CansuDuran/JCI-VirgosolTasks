package Task2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrencinin notunu giriniz: ");
        int not = scanner.nextInt();

        if (not>=90 && not<=100) {
            System.out.print("Not: A");
        } else if( not>=80 && not<=89) {
            System.out.print("Not: B");
        } else if( not>=70 && not<=79) {
            System.out.print("Not: C");
        } else if( not>=60 && not<=69) {
            System.out.print("Not: D");
        } else if( not>=0 && not<=59) {
            System.out.print("Not: F");
        } else
            System.out.println("Geçersiz not girdiniz.");

        scanner.close();




    }
}
