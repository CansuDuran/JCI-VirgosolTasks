package Task4;

public class Question8 {
    public static void main(String[] args) {
        int[] dizi = {10, 5, 23, 54, 6, 2};

        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (dizi[j] < dizi[j + 1]) {

                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        System.out.println("Büyükten küçüğe sıralanmış hali: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}
// Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metod yazın.