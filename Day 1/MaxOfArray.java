//package Day 1;

import java.util.Scanner;

public class MaxOfArray {
   public static void main(String[] args) {
    int size=0;
    System.out.println("enter the size");
    Scanner sc= new Scanner(System.in);
    size=sc.nextInt();
    int[] arrs=new int[size];
    System.out.println("enter the elements");
    for(int i=0;i<size;arrs[i++]=sc.nextInt());

    int max=arrs[0];

    for(int i=1;i<size;i++){
        max= max<arrs[i]?arrs[i]:max;
    }

    System.out.print("The max value is "+max);
   } 
}
