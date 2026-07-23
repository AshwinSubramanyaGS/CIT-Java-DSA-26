// Remove Duplicates – Write a method that takes a `List<Integer>` and returns a new list with all duplicates removed, preserving the original order.
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class RemoveDuplicates{
    static List<Integer> deDeuplicator(List<Integer> integerList){
        List<Integer> newIntegerList= new ArrayList<Integer>();

        for(Integer integer: integerList){
            if(!newIntegerList.contains(integer))
                newIntegerList.add(integer);
        }
        return newIntegerList;
    }

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
        System.out.println("Original List"+listOfIntegers);

        System.out.println("De Duplicated List"+deDeuplicator(listOfIntegers));

    }
}