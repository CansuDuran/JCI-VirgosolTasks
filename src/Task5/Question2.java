package Task5;

import java.util.Random;
public class Question2 {
    public static void main(String[] args) {
        int diziBoyutu = 100;
        Random random = new Random();

        int[] sayilar = new int[diziBoyutu];
        for (int i = 0; i < diziBoyutu; i++) {
            sayilar[i] = random.nextInt(1000);
        }

        double top = 0;
        for (int sayi : sayilar) {
            top += sayi;
        }
        double ort = top / diziBoyutu;


        int buyukSayiAdedi = 0;
        for (int sayi : sayilar) {
            if (sayi > ort) {
                buyukSayiAdedi++;
            }
        }

        System.out.println("Dizideki sayıların ortalaması: " + ort);
        System.out.println("Ortalamadan büyük olan sayıların adedi: " + buyukSayiAdedi);
    }

}
//100 adet rastgele sayının bulunduğu bir dizi oluşturun. Bu sayıların ortalamasını hesaplayın ve ortalamadan büyük olan sayıların kaç tane olduğunu bulun.