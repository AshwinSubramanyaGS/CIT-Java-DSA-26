import java.util.Scanner;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        int rows = 0;
        System.out.println("enter the rows");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        int[] arrs[] = new int[rows][];
        for (int i = 0; i < arrs.length; i++) {
            System.out.print("\nenter the no of columns in row "+(i+1));
            var column= sc.nextInt();
            arrs[i]=new int[column];
            for(int j=0;j<column;j++){
                System.out.print("\nEnter element "+(j+1));
                arrs[i][j]=sc.nextInt();
            } 
        }

        System.out.println("The jagged array is:");

        for(int[] row:arrs){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
