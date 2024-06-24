package Task5;

public class Question7 {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6};

        tersCevir(dizi);

        System.out.println("Dizinin ters hali:");
        for (int sayi : dizi) {
            System.out.print(sayi + " ");
        }
    }

    public static void tersCevir(int[] dizi) {
        for (int i = 0; i < dizi.length / 2; i++) {
            int gecici = dizi[i];
            dizi[i] = dizi[dizi.length - 1 - i];
            dizi[dizi.length - 1 - i] = gecici;
        }
    }
}
// int tipinde bir dizi oluşturun ve bu diziyi tersine çeviren bir metot yazın. Bu metodu çağırarak sonucu ekrana yazdırın