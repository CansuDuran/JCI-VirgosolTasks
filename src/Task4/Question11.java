package Task4;

public class Question11 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7};


        int[] newArray = copyArray(array);


        System.out.println("Dizi: ");
        for (int eleman : array) {
            System.out.print(eleman + " ");
        }

        System.out.println("\nKopyalanmış dizi: ");
        for (int eleman : newArray) {
            System.out.print(eleman + " ");
        }
    }

    public static int[] copyArray(int[] array1) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        return newArray;
    }
}

//Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.
