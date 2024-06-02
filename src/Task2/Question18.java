package Task2;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gezegen adı giriniz: ");
        String gezegen = scanner.nextLine();

        switch (gezegen) {
            case "Merkür":
            case "Venüs":
            case "Dünya":
            case "Mars":
                System.out.println("İç gezegen");
                break;
            case "Jüpiter":
            case "Satürn":
            case "Uranüs":
            case "Neptün":
                System.out.println("Dış gezegen");
                break;
            default:
                System.out.println("Geçersiz gezegen adı");
                break;
        }
        scanner.close();
    }
}
