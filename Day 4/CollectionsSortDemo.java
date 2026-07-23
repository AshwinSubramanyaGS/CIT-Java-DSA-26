//package Day 4;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CollectionsSortDemo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        List<Integer> listOfIntegers = new ArrayList<>();
        while (choice) {
            System.out.println("press 1 to add an element and press 2 stop input");
            int choiceValue = sc.nextInt();
            if (choiceValue == 1) {
                System.out.println("Enter the value to add to list");
                listOfIntegers.add(sc.nextInt());
            } else {
                choice = false;
            }
        }
        System.out.println("Original List" + listOfIntegers);
        Collections.sort(listOfIntegers);
        System.out.println("Sorted List" + listOfIntegers);

        sc.close();

    }
  
}
