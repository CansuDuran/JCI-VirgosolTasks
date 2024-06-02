package Task3;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int a = 0, b = 1;
        while(a <= num){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        scanner.close();



    }
}
   // Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini while döngüsü kullanarak yazdıran bir Java programı yazın.
