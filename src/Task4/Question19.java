package Task4;
import java.util.Arrays;
public class Question19 {public static void main(String[] args) {

    int[] dizi = {3, 5, 7, 8, 6, 4};

    int silinecekEleman = 7;

    int[] yeniDizi = elemaniSil(dizi, silinecekEleman);

    System.out.println("Yeni dizi: " + Arrays.toString(yeniDizi));
}


    public static int[] elemaniSil(int[] dizi, int silinecekEleman) {

        boolean elemanBulundu = false;
        for (int eleman : dizi) {
            if (eleman == silinecekEleman) {
                elemanBulundu = true;
                break;
            }
        }
        if (!elemanBulundu) {
            return dizi;
        }

        int[] yeniDizi = new int[dizi.length - 1];
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != silinecekEleman) {
                yeniDizi[j++] = dizi[i];
            }
        }

        return yeniDizi;
    }

}
//Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren bir metod yazın.
//(ipucu: yeni dizinin boyutu bir azalmalı)
