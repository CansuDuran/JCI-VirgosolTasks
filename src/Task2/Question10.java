package Task2;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci cümleyi giriniz: ");
        String cumle1 = scanner.nextLine();

        System.out.print("İkinci cümleyi giriniz: ");
        String cumle2 = scanner.nextLine();

        String uzunCumle;
        if(cumle1.length() > cumle2.length()){
            uzunCumle= cumle1;
        }else{
            uzunCumle = cumle2;
        }
        System.out.print("Uzun olan cümle: " + uzunCumle);
        scanner.close();

    }
}
