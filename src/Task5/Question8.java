package Task5;

import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        System.out.println("ArrayList'teki Sayılar:");
        for (int sayi : liste) {
            System.out.print(sayi + " ");
        }

        int top= 0;
        for (int sayi : liste) {
            top += sayi;
        }

        System.out.println("\nArrayList'teki Sayıların Toplamı: " + top);
    }
}
//Bir ArrayList oluşturun ve içine Integer wrapper sınıfı kullanarak birkaç sayı ekleyin.
//Bu sayıları ekrana yazdırın ve ardından toplamını hesaplayarak ekrana yazdırın.