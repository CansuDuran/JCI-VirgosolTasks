package Task4;

public class Question12 {
    public static void main(String[] args){
        int[] array= {2, 3, 4, 5, 6, 7, 8, 9};
        int start=2; //3. eleman
        int finish=6;  //7.eleman

        int[] newArray = copyArray(array, start, finish);

        System.out.println("Orijinal dizi: ");
        for (int eleman : array) {
            System.out.print(eleman + " ");
        }
        System.out.println("\nKopyalanmış dizi: ");
        for (int eleman : newArray) {
            System.out.print(eleman + " ");
        }



    }
    public static int[] copyArray(int[] array1, int start, int finish){
        int uzunluk = finish - start + 1;
        int[] newArray = new int [uzunluk];
        for (int i = 0; i < uzunluk; i++){
            newArray[i] = array1[start + i];

        }
        return newArray;

    }
}
//Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metod yazın.