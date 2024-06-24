package Task4;

public class Question4 {
    public static void main(String[] args){
        int[] array={5, 10, 2, 6, 20};

        System.out.println("Dizideki en küçük eleman: " + enKucukEleman(array));

    }
    public static int enKucukEleman(int[] array){
        int enk = array[0];
        for(int i = 1; i < array.length; i++) {
            if (enk > array[i])
                enk = array[i];
        }
        return enk;
    }
}
//Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metod yazın.