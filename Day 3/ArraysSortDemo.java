//package Day 3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSortDemo {
    public static void main(String[] args) {
        var sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("The sorted array:"); 
        for(int i: arr){
            System.out.print(i +" ");
        }
        sc.close();
    }  
}
