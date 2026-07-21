//package Day 1;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        System.out.print("Enter no of terms to print: ");
        var noOfTerms=sc.nextInt();

        int fib1=0,fib2=1;

        //int currentTerm=1;
        System.out.println("The fibb series: ");
        /* while (currentTerm<=noOfTerms) {
            System.out.print(fib1+" ");
            int temp=fib1+fib2;
            fib1=fib2;
            fib2=temp;
            ++currentTerm;
        } */

        /* do {
            System.out.print(fib1+" ");
            int temp=fib1+fib2;
            fib1=fib2;
            fib2=temp;
            ++currentTerm;
        }while (currentTerm<=noOfTerms); */

        for(int currentTerm=1;currentTerm<=noOfTerms;++currentTerm){
            System.out.print(fib1+" ");
            int temp=fib1+fib2;
            fib1=fib2;
            fib2=temp;
        }
    }
}
