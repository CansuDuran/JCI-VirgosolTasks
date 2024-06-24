package Task4;

public class Question15 {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6, 7, 8};

        int sum = sumArray(array);


        System.out.println("Dizideki elemanların toplamı: " + sum);
    }


    public static int sumArray(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        return sum;
    }

}
