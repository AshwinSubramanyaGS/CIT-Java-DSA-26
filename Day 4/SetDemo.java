import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet – O(1) operations
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("apple");   // ignored
        System.out.println("HashSet: " + hashSet);

        // TreeSet – sorted
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(5, 2, 8, 1, 9, 2));
        System.out.println("TreeSet: " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Higher than 5: " + treeSet.higher(5));

        // Deduplicate a list
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = new LinkedHashSet<>(list);  // preserves order
        System.out.println("Deduped list (order preserved): " + new ArrayList<>(set));
    }
}
