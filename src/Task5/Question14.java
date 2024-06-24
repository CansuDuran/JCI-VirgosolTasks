package Task5;
import java.util.ArrayList;

public class Question14 {
    public static void main(String[] args) {

            ArrayList<Integer> sayilar = new ArrayList<>();
            sayilar.add(26);
            sayilar.add(45);
            sayilar.add(11);
            sayilar.add(77);


            int enKucuk = sayilar.get(0);
            int enBuyuk = sayilar.get(0);

            for (int sayi : sayilar) {
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
            }

            System.out.println("En küçük sayı: " + enKucuk);
            System.out.println("En büyük sayı: " + enBuyuk);
        }
    }

//Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
//Bu sayılar arasından en küçük ve en büyük sayıları bulun ve sonucu ekrana yazdırın.