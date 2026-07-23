//Reverse a List – Reverse the elements of a given `List<String>` in‑place (without creating a new list).
//package Day 4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayList {

    static void listReverser(List<Integer> list){
        int size = list.size()-1;
        for (int i = 0; i <= size/2; i++) {
            int temp=list.get(i);
            list.set(i, list.get(size-i));
            list.set(size-i, temp);
        }
    }
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
        listReverser(listOfIntegers);
        System.out.println("De Duplicated List" + listOfIntegers);
        sc.close();

    }
}
