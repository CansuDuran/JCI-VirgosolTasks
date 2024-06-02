package Task3;
import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String str = scanner.nextLine();

        String uniqueCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharacters += currentChar;
            }
        }

        System.out.print("Benzersiz karakterler: ");
        for (int i = 0; i < uniqueCharacters.length(); i++) {
            System.out.print(uniqueCharacters.charAt(i) + " ");
        }
    }
}
// Verilen bir string içerisindeki benzersiz karakterleri bulan ve bunları ekrana yazdıran bir Java programı yazın.
// Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir.
