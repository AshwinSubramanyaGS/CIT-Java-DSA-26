//package Day 2;

import java.util.Scanner;

public class RecPallindrome {
    static boolean isPallindrome(String word, int left, int right) {
        if (left > right)
            return true;
        if (word.charAt(left) != word.charAt(right))
            return false;
        return isPallindrome(word, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        
        System.out.println("The word "+ word + (isPallindrome(word, 0, word.length()-1) ? " is pallindrome" : " is not pallindrome"));

    }
}
