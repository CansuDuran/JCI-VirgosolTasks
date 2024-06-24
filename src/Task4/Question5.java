package Task4;

public class Question5 {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        System.out.println("Dizideki elemanların toplamı: " + toplam(array) );

    }
    public static int toplam(int[] array){
        int top=0;
        for(int i=0; i < array.length; i++){
            top+=array[i];
        }
        return top;
    }
}
//Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metod yazın.