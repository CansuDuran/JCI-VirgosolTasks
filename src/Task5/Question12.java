package Task5;
import java.util.ArrayList;

public class Question12 {
    public static int harfSayisiniBul(String kelime, char harf) {
        int count = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == harf) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<String> kelimeler = new ArrayList<>();
        kelimeler.add("java");
        kelimeler.add("programlama");
        kelimeler.add("dili");


        char aranacakHarf = 'a';
        for (String kelime : kelimeler) {
            int harfSayisi = harfSayisiniBul(kelime, aranacakHarf);
            System.out.println(kelime + " kelimesi " + aranacakHarf + " harfini " + harfSayisi + " tane içeriyor.");
        }
    }
}
//Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
//Her kelimenin içindeki belirli bir harfin sayısını bulan bir metot yazın ve sonucu ekrana yazdırın.
