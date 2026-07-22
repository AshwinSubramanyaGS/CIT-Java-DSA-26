//package Day 2;

public class SimpleException {
    public static void main(String[] args) {
        try {
            String str = args[0];
    

            //str=null;
            System.out.println("Length of string is " + str.length());

            int arr[] = new int[10];
            for (int i = 0; i < 11; i++) {
                System.out.println(arr[i]);
            }
        } /* catch (NullPointerException e) {
            System.out.println("The string is empty");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The array is out of bounds");
        } */
       catch (NullPointerException | ArrayIndexOutOfBoundsException e){
        System.out.println("Oops someting has gone wrong please contact administrator");
       }
    }
}
