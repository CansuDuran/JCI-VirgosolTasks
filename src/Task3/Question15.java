package Task3;

import java.util.Scanner;

public class Question15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir kelime giriniz:");
            String str= scanner.next();
            boolean isPalindrome = true;
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println(isPalindrome);
        }
}

