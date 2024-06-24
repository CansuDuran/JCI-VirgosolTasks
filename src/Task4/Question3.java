package Task4;

public class Question3 {
     public static void main (String[] args){
         int[] array = {15, 2, 45, 4, 5};


         System.out.println("Dizideki en büyük eleman: " + enBuyukEleman(array));

     }
     public static int enBuyukEleman(int[] array){
         int enb = array[0];
         for (int i = 1; i < array.length; i++){
             if(enb < array[i])
                 enb = array[i];
         }
         return enb;
     }
}
//Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metod yazın.