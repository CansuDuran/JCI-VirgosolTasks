package Task5;

public class Question5 {
    public static void main(String[] args) {

        int[] dizi = {4, 12, 8, 23, 10, 1};

        int enBuyuk = enBuyukSayi(dizi);

        System.out.println("Dizideki en büyük sayı: " + enBuyuk);
    }

    public static int enBuyukSayi(int[] dizi) {
        int enBuyuk = dizi[0];

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }

}
//int tipinde bir dizi oluşturun ve bu dizideki en büyük sayıyı bulan bir metot yazın.
// Bu metodu çağırarak sonucu ekrana yazdırın.
