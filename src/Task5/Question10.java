package Task5;

public class Question10 {
    public static void main(String[] args) {
    int sonuc1 = topla(6, 10);
    int sonuc2 = topla(23, 32);

    double sonuc3 = topla(5.6, 10.4);
    double sonuc4 = topla(20.25, 30.27);

    System.out.println("6 + 10 = " + sonuc1);
    System.out.println("23 + 32 = " + sonuc2);
    System.out.println("5.6 + 10.4 = " + sonuc3);
    System.out.println("20.25 + 30.27 = " + sonuc4);
    }
    public static int topla(int num1, int num2) {
        return num1 + num2;
    }

    public static double topla(double num1, double num2) {
        return num1 + num2;
    }


}

//int ve double tipinde iki sayının toplamını bulan iki farklı metot yazın.
// Bu metotları kullanarak çeşitli toplama işlemleri yapın ve sonucu ekrana yazdırın.