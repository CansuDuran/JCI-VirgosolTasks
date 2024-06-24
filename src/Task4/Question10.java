package Task4;

public class Question10 {
    public static void main(String[] args) {
        int[] array= {3, 5, 7, 2, 8, 6, 5, 5, 3};

        int arananDeger = 6;

        int indeks = arananIndeksiBul(array, arananDeger);
        if (indeks != -1) {
            System.out.println("Dizide " + arananDeger + " değeri bulundu. İndeks: " + indeks);
        } else {
            System.out.println("Dizide " + arananDeger + " değeri bulunamadı.");
        }
    }

    public static int arananIndeksiBul(int[] array, int arananDeger) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arananDeger) {
                return i;
            }
        }
        return -1;
    }
}

//Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metod yazın.