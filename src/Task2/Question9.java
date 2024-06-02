package Task2;

public class Question9 {
    public static void main(String[] args) {
        String kelime = "abc";

        char ilkHarf = kelime.charAt(0);
        int ilkHarfA = ilkHarf;

        char ikinciHarf = kelime.charAt(1);
        int ikinciHarfA = ikinciHarf;

        char ucuncuHarf = kelime.charAt(2);
        int ucuncuHarfA = ucuncuHarf;

        System.out.println("Karakter: " + ilkHarf + ", ASCII Değeri: " + ilkHarfA);
        System.out.println("Karakter: " + ikinciHarf + ", ASCII Değeri: " + ikinciHarfA);
        System.out.println("Karakter: " + ucuncuHarf + ", ASCII Değeri: " + ucuncuHarfA);

    }
}
