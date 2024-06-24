package Task4;

public class Question6 {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};

        double ortalama = ortalamaBul(array);
        System.out.println("Dizideki elemanların ortalaması: " + ortalama );

    }
    public static int ortalamaBul(int[] array){
        int top=0;
        for(int i=0; i < array.length; i++){
            top+=array[i];
        }
        return  (int) ((double) top/ array.length);
    }

}
//Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metod yazın.