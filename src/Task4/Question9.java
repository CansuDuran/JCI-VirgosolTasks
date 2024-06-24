package Task4;

public class Question9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 2, 4, 3, 1,};
        int arananDeger = 4;

        System.out.println("Dizide aranan sayı: " + arananDeger + " değerine sahip " +kacAdet(array, arananDeger) + " adet eleman var");

    }

    public static int kacAdet(int[] array, int arananDeger) {
        int count = 0;
        for (int eleman : array) {
            if (eleman == arananDeger) {
                count++;
            }

        }
        return count;
    }
}
//Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metod yazın.