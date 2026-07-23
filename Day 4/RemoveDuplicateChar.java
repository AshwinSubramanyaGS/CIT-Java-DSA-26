import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        LinkedHashSet<Character> set= new LinkedHashSet<>();

        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        System.out.println(set.toString());
        sc.close();
    }    
}
