package Task4;

public class Question14 { public static void main(String[] args){
    int[] array = {2, 5, 7, 3, 8, 6, 12, 4, 9};


    int[] oddNumbersArray = oddNumbers(array);

    System.out.println("Tek sayılar dizisi: ");
    for (int eleman : oddNumbersArray) {
        System.out.print(eleman + " ");
    }
}

    public static int[] oddNumbers(int[] array1) {

        int count = 0;
        for (int eleman : array1) {
            if (eleman % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbersArray = new int[count];
        int index = 0;

        for (int eleman : array1) {
            if (eleman % 2 != 0) {
                oddNumbersArray[index++] = eleman;
            }
        }

        return oddNumbersArray;
    }
}

//Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen bir metod yazın.