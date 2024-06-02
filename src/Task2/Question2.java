package Task2;


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.next();

        int uzunluk = kelime.length();
        System.out.print("Kelimenin uzunluğu: " + uzunluk);

        scanner.close();

    }

}
