package Task4;

public class Question18 {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 5, 7, 8, 19,};

        int aranacakEleman = 3;
        int yeniDeger = 10;


        boolean sonuc = elemaniGuncelle(dizi, aranacakEleman, yeniDeger);

        if (sonuc) {
            System.out.println(aranacakEleman + " elemanı bulundu ve " + yeniDeger + " ile güncellendi.");
        } else {
            System.out.println(aranacakEleman + " elemanı dizide bulunamadı.");
        }

        System.out.print("Güncellenmiş dizi: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }

    public static boolean elemaniGuncelle(int[] dizi, int aranacakEleman, int yeniDeger) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranacakEleman) {
                dizi[i] = yeniDeger;
                return true;
            }
        }
        return false;
    }
}
//Bir dizinin belirli bir elemanını bulup güncelleyen bir metod yazın.
//(ipucu: method ayrıca eleman dizide varsa ve güncelleme gerçekleşirse true, yoksa false dönsün)
