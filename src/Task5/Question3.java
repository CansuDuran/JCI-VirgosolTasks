package Task5;

import java.util.ArrayList;
public class Question3 {
    public static void main(String[] args) {

        ArrayList<Object> liste = new ArrayList<>();

        liste.add(6);
        liste.add(5.6);
        liste.add(false);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }
}
//int, double ve boolean tiplerinde 3 farklı değeri tutan bir ArrayList oluşturun ve bu değerleri ekrana yazdırın.
