package Task5;
import java.util.ArrayList;
public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        double ort = 0;
        for (int sayi : liste) {
            ort += sayi;
        }
        ort /= liste.size();


        System.out.println("Ortalama: " + ort);
        System.out.println("Ortalamadan büyük olanlar:");
        for (int sayi : liste) {
            if (sayi > ort) {
                System.out.print(sayi + " ");
            }
        }
        System.out.println();

        System.out.println("Ortalamadan küçük olanlar:");
        for (int sayi : liste) {
            if (sayi < ort) {
                System.out.print(sayi + " ");
            }
        }
        System.out.println();
    }

}
// Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin. Bu değerlerin ortalamasını hesaplayın.
// Ardından, listedeki her elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edin
// ve ortalamanın üstündeki ve altındaki değerleri ayrı ayrı ekrana yazdırın.