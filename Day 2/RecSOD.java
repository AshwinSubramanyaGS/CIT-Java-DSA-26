//package Day 2;

import java.util.Scanner;

public class RecSOD {
    static int sod(int number) {
        if (number == 0)
            return 0;
        return (number % 10) + sod(number / 10);
    }

    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        System.out.print("Enter a no: ");
        var no= sc.nextInt();

        System.out.printf("The sum of digit of number %d is %d",no,sod(no));
        sc.close();
    }
}
