package Task5;
import java.util.ArrayList;
import java.util.Collections;

public class Question15 {
    public static void main(String[] args) {

        ArrayList<String> kelimeler = new ArrayList<>();
        kelimeler.add("dili");
        kelimeler.add("programlama");
        kelimeler.add("java");

        kelimeler.add(0, "bugün");
        kelimeler.add("öğreniyorum");

        Collections.sort(kelimeler);

        System.out.println("Sıralanmış kelime listesi: " + kelimeler);
    }

}
// Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
//Listenin başına ve sonuna yeni kelimeler ekleyin, ardından listeyi sıralayın ve sonucu ekrana yazdırın.