package Task5;

import java.util.Arrays;

public class Question11 {
    public static void siralama(int[] dizi) {
        Arrays.sort(dizi);
    }

    public static void main(String[] args) {
        int[] array= {2, 9, 5, 8, 1, 0, 6};

        System.out.println("Sıralamadan önce dizi: " + Arrays.toString(array));

        siralama(array);

        System.out.println("Sıralandıktan sonra dizi: " + Arrays.toString(array));
    }
}
//int tipinde bir dizi oluşturun ve bu diziyi sıralayan bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın.