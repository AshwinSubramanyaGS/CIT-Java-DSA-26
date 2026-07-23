//package Day 4;


import java.util.HashSet;

import java.util.Set;

public class IntersectionOfArrays {
    static int[] findIntersection(int array1[],int array2[]){
        Set<Integer> l1= new HashSet<>();
        Set<Integer> resultSet= new HashSet<>();
        for (Integer integer : array1) {
            l1.add(integer);
        }

        for (Integer integer : array2) {
            if(l1.contains(integer)){
                resultSet.add(integer);
            }
        }
        int result[]=new int[resultSet.size()];
        int i=0;
        for(Integer no:resultSet){
            result[i++]= no;
        }
        return result;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int b[]={2,5,7,8,9,10};
        int c[]=findIntersection(a, b);
        for(int intersection:c)
        System.out.print(intersection+" ");
    }
}
