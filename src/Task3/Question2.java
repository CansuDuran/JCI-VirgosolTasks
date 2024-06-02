package Task3;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        int fak = 1;
        for (int i = 1; i <= num; i++){
            fak *= i;
        }
        System.out.print( num + " sayısının faktöriyeli: " + fak);


    }
}
    //Bir sayının faktöriyelini for döngüsü kullanarak hesaplayan bir Java programı yazın.
    // Örneğin, 5'in faktöriyeli 120'dir.
