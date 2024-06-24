package Task5;
import java.util.ArrayList;
public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        int indeks = 2;   //
        int yeniDeger = 10;

        if (indeks >= 0 && indeks < liste.size()) {
            liste.set(indeks, yeniDeger);
            System.out.println("ArrayList'te " + indeks + ". indeksteki sayı " + yeniDeger + " ile değiştirildi.");
        } else {
            System.out.println("Geçersiz indeks!");
        }

        System.out.println("ArrayList'teki Son Hali:");
        for (int sayi : liste) {
            System.out.println(sayi);
        }
    }

}
//Bir ArrayList oluşturun ve içine birkaç sayı ekleyin. Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirin ve sonucu ekrana yazdırın.
