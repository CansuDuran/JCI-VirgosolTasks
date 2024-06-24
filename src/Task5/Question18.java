package Task5;
import java.util.ArrayList;
import java.util.Collections;
public class Question18 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("programlama");
        words.add("dilini");
        words.add("öğreniyor");



        ArrayList<Integer> wordLengths = new ArrayList<>();
        for (String word : words) {
            wordLengths.add(word.length());
        }

        Collections.sort(wordLengths);

        System.out.println("Kelimelerin uzunlukları (küçükten büyüğe):");
        System.out.println(wordLengths);


        int shortestLength = wordLengths.get(0);
        int longestLength = wordLengths.get(wordLengths.size() - 1);

        String shortestWord = "";
        String longestWord = "";
        for (String word : words) {
            if (word.length() == shortestLength) {
                shortestWord = word;
            }
            if (word.length() == longestLength) {
                longestWord = word;
            }
        }

        System.out.println("En kısa kelime: " + shortestWord + ", Uzunluğu: " + shortestLength);
        System.out.println("En uzun kelime: " + longestWord + ", Uzunluğu: " + longestLength);
    }
}
//Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
//Her kelimenin uzunluğunu tutan bir ArrayList daha oluşturun ve bu uzunlukları sıralı olarak ekrana yazdırın.
//Son olarak, en uzun ve en kısa kelimeleri bularak ekrana yazdırın.