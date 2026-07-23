import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice=true;
        List<Integer> listOfIntegers = new ArrayList<>();
        while(choice){
            System.out.println("press 1 to add an element and press 2 stop input");
            int choiceValue=sc.nextInt();
            if(choiceValue==1){
                System.out.println("Enter the value to add to list");
                listOfIntegers.add(sc.nextInt());
            }else{
                choice=false;
            }
        }
        System.out.println("The contents of the list : ");
        /* for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.print(listOfIntegers.get(i)+" ");
        } */
       for (Integer integer : listOfIntegers) {
        System.out.print(integer + " ");
       }
       sc.close();

    }    
}