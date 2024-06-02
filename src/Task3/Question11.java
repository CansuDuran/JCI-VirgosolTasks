package Task3;

public class Question11 {
    public static void main(String[] args) {

        String str = "Java Eğitimi";

        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);
            if (str.indexOf(karakter) != i) {
                System.out.println("Tekrar eden karakter: " + karakter);
            }
        }


    }
}
//For döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın.