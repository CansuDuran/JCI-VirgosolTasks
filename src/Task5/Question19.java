package Task5;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(101));
        }

        System.out.println("Oluşturulan rastgele sayılar:");
        System.out.println(numbers);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int targetNumber = scanner.nextInt();


        System.out.println("Toplamı 100 olan çiftler:");
        for (int num : numbers) {
            int sum = num + targetNumber;
            if (sum == 100 && (num % 2 == 0)) {
                System.out.println("(" + num + ", " + targetNumber + ")");
            }
        }
    }
}
//Bir ArrayList oluşturun ve içine 20 rastgele tam sayı ekleyin.
//Kullanıcıdan bir sayı alın ve bu sayının listedeki elemanlarla toplamının 100 olduğu tüm çiftleri bulun ve ekrana yazdırın.
