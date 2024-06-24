package Task5;
import java.util.ArrayList;

public class Question13 {
    public static int rakamlarToplami(int sayi) {
        int top = 0;
        while (sayi != 0) {
            top += sayi % 10;
            sayi /= 10;
        }
        return top;
    }

    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(21);
        sayilar.add(35);
        sayilar.add(46);
        sayilar.add(111);

        for (int sayi : sayilar) {
            int toplam = rakamlarToplami(sayi);
            System.out.println(sayi + " sayısının rakamlarının toplamı: " + toplam);
        }
    }
}

//Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
//Bu Integer değerlerin her birinin rakamlarının toplamını hesaplayın ve bu toplamları ekrana yazdırın.
//Örneğin, listede 123 varsa, rakamların toplamı 6 olmalıdır (1 + 2 + 3).
