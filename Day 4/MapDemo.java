import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Frequency count
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println("Frequencies: " + freq);

        // Using computeIfAbsent (more concise)
        Map<String, Integer> freq2 = new HashMap<>();
        for (String word : words) {
            freq2.computeIfAbsent(word, k -> 0);
            freq2.put(word, freq2.get(word) + 1);
        }
        System.out.println("Freq2: " + freq2);

        // TreeMap – sorted keys
         TreeMap<String, Integer> sortedMap = new TreeMap<>(freq);
        System.out.println("Sorted by key: " + sortedMap);

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        } 
    }
}