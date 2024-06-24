package Task5;
import java.util.ArrayList;
import java.util.Collections;

public class Question20 {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(12.5);
        numbers.add(7.2);
        numbers.add(15.8);
        numbers.add(5.4);
        numbers.add(9.1);

        double max = Collections.max(numbers);
        double min = Collections.min(numbers);

        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();

        System.out.println("Ortalama: " + average);

        System.out.println("Her elemanın ortalamadan büyük mü küçük mü olduğu:");
        for (double num : numbers) {
            if (num > average) {
                System.out.println(num + " > Ortalama");
            } else if (num < average) {
                System.out.println(num + " < Ortalama");
            } else {
                System.out.println(num + " = Ortalama");
            }
        }
    }
}
//Bir ArrayList oluşturun ve içine birkaç Double değer ekleyin.
//Bu değerlerden en büyük ve en küçük olanını bulun. Ardından, listedeki tüm elemanların ortalamasını hesaplayın ve bu ortalamayı ekrana yazdırın.
//Son olarak, listedeki her elemanı ortalamadan büyük mü küçük mü diye kontrol edin ve sonuçları ayrı ayrı ekrana yazdırın.