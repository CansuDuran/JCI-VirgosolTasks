package Task5;
import java.util.ArrayList;
import java.util.Collections;
public class Question17 {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(3);
        sayilar.add(8);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(1);

        Collections.sort(sayilar);

        System.out.println("Sıralanmış liste:");
        System.out.println(sayilar);

        System.out.println("Tersten yazdırılmış liste:");
        for (int i = sayilar.size() - 1; i >= 0; i--) {
            System.out.print(sayilar.get(i) + " ");
        }
        System.out.println();

        ArrayList<Integer> sayınınKaresi = new ArrayList<>();
        for (int num :sayilar) {
            int karesi = num * num;
            sayınınKaresi.add(karesi);
        }

        System.out.println("Her sayının karesi:");
        System.out.println(sayınınKaresi);
    }
}
//Bir ArrayList oluşturun ve içine 10 farklı tam sayı ekleyin. Bu sayıları küçükten büyüğe sıralayın, ardından sıralanmış listeyi tersten yazdırın.
//Son olarak, listedeki her sayının karesini hesaplayarak yeni bir ArrayList içinde saklayın ve bu listeyi ekrana yazdırın.
