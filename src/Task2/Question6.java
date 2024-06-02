package Task2;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        if (cumle.length() <50){
           System.out.println("Kısa bir cümle");
        }else{
            System.out.println("uzun bir cümle");
        }
        scanner.close();

    }

}
