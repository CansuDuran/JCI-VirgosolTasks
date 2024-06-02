package Task3;

public class Question13 {
    public static void main(String[] args) {
        int top = 0;

        for (int i = 1; i <= 1000; i++) {
            int number = i;
            int originalNumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            if (originalNumber == reversedNumber) {
                top += i;
            }
        }

        System.out.println("palindromik sayıların toplamı: " + top);
    }
}
    //Bir aralık belirleyerek (örneğin 1 ile 1000 arası) bu aralıktaki palindromik sayıların toplamını hesaplayan bir Java programı yazın.
    //Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131).
