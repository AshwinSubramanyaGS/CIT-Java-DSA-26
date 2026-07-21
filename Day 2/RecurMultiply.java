//package Day 2;

import java.util.Scanner;

public class RecurMultiply {
    static int multiply(int no,int multiple){
        if(multiple==0)return 0;
        if(multiple==1)return no;
        return no+multiply(no, multiple-1);
    }  

    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        System.out.println("Enter 2 no to be multiplied");
        int no=sc.nextInt();
        int multiplier=sc.nextInt();

        System.out.println(no+" X "+multiplier+" = "+multiply(no,multiplier));
    }
}
