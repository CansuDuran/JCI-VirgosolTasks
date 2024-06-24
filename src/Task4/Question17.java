package Task4;

public class Question17 {
    public static void main(String[] args) {

        int[] dizi = {3, 5, 7, 8, 6, 1, 9};

        int aranacakEleman = 5;


        boolean sonuc = elemanVarMi(dizi, aranacakEleman);

        if (sonuc) {
            System.out.println(aranacakEleman + " dizide bulunuyor.");
        } else {
            System.out.println(aranacakEleman + " dizide bulunmuyor.");
        }
    }


    public static boolean elemanVarMi(int[] dizi, int aranacakEleman) {
        for (int eleman : dizi) {
            if (eleman == aranacakEleman) {
                return true;
            }
        }
        return false;
    }
}
//Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden bir metod yazın.
//(ipucu method true veya false olarak değer dönmeli)