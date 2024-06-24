package Task4;
import java.util.Arrays;
public class Question20 {
    public static void main(String[] args) {
        String ifade = "Java Task";

        char[] karakterler = stringiDiziyeAktar(ifade);

        System.out.println("Karakter dizisi: " + Arrays.toString(karakterler));
    }

    public static char[] stringiDiziyeAktar(String ifade) {

        char[] karakterler = new char[ifade.length()];

        for (int i = 0; i < ifade.length(); i++) {
            karakterler[i] = ifade.charAt(i);
        }

        return karakterler;
    }

}
//String bir ifadenin tüm karakterlerini bir diziye karakter karakter aktaran bir method yazın.
//Method parametre olarak String almalı, return olarak dizi dönmeli.
