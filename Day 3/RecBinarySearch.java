//package Day 3;

import java.util.Arrays;
import java.util.Scanner;

public class RecBinarySearch {
    static int recBin(int[] arr,int key,int low,int high){
        if(low>high)return -1;
        int mid =(low+high)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid]>key) return recBin(arr, key, low, mid-1);
        else if(arr[mid]<key) return recBin(arr, key, mid+1, high);
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int index=recBin(arr, key, 0, size-1);
        System.out.println("The element is " + (index > -1 ? "found in pos " +(index+1) : "not found"));
        sc.close();
    }
}
