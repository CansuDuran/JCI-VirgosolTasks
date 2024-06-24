package Task4;

public class Question13 {
    public static void main(String[] args){
        int[] array = {2, 5, 7, 3, 8, 6, 12, 4, 14};


        int[] evenNumbersArray = evenNumbers(array);

        System.out.println("Çift sayılar dizisi: ");
        for (int eleman : evenNumbersArray) {
            System.out.print(eleman + " ");
        }
    }

    public static int[] evenNumbers(int[] array1) {

        int count = 0;
        for (int eleman : array1) {
            if (eleman % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbersArray = new int[count];
        int index = 0;

        for (int eleman : array1) {
            if (eleman % 2 == 0) {
                evenNumbersArray[index++] = eleman;
            }
        }

        return evenNumbersArray;
    }
}
//Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.