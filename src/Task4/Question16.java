package Task4;

public class Question16 {
    public static void main(String[] args){
        int[] dizi1 = {3, 5, 7, 9};
        int[] dizi2 = {2, 8, 6, 10};

        int[] birlesmisDizi = dizileriBirleştir(dizi1, dizi2);

        System.out.println("Birleşmiş dizi: ");
        for (int eleman : birlesmisDizi) {
            System.out.print(eleman + " ");
        }
    }

    public static int[] dizileriBirleştir(int[] dizi1, int[] dizi2) {

        int[] birlesmisDizi = new int[dizi1.length + dizi2.length];


        for (int i = 0; i < dizi1.length; i++) {
            birlesmisDizi[i] = dizi1[i];
        }


        for (int i = 0; i < dizi2.length; i++) {
            birlesmisDizi[dizi1.length + i] = dizi2[i];
        }

        return birlesmisDizi;
    }
}
//İki diziyi birleştiren ve yeni bir dizi oluşturan bir metod yazın.
//(ipucu: method iki adet parametre (int[] dizi1, int[] dizi2) alıyor)
