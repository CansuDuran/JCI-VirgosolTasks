package Task3;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int num = scanner.nextInt();
        int sayac = 0;

        for( int i=1; i<=num; i++){
            int kalan = num % i;
            if(kalan==0) {
                sayac++;
            }

        }
        if(sayac==2)
            System.out.println("Sayı asaldır");
        else
            System.out.println("Sayı asal sayı değildir");

    }
}
    //Bir sayının asal olup olmadığını for döngüsü kullanarak kontrol eden bir Java programı yazın.