package Task5;

import java.util.ArrayList;
public class Question1 {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<>();

        sehirler.add("Izmir");
        sehirler.add("Ankara");
        sehirler.add("Kayseri");
        sehirler.add("Bursa");
        sehirler.add("Aydın");


        for (int i = 0; i < sehirler.size(); i++) {
            System.out.println(sehirler.get(i));
        }
    }

}
// ArrayList sınıfını kullanarak bir ArrayList oluşturun ve içine 5 farklı şehir ekleyin. Bu şehirleri ekrana yazdırın.