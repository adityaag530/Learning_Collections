package Arrays;


/*
 * @author adityagupta
 * @date 12/04/25
 */

import java.util.*;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int arr1[] = new int[]{1,1,2,3,4,5};
        int arr2[] = new int[]{2,5,7,8,9,30,50};

//        usingTreeSet(arr1, arr2);
          usingTwoPointer(arr1, arr2);
     }

     public static void usingTwoPointer(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        Stack<Integer> union = new Stack<>();
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(union.isEmpty() || union.peek()!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.isEmpty() || union.peek()!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        for(int k=i; k<n1; k++){
            if(union.isEmpty() || union.peek()!=arr1[k])
                union.add(arr1[k]);
        }
         for(int k=j; k<n2; k++){
             if(union.isEmpty() || union.peek()!=arr2[k])
                union.add(arr2[k]);
         }

        union.forEach(k -> System.out.print(k + " "));
     }

     public static void usingTreeSet(int[] arr1, int[] arr2){
         // remember hashset(random fast), linkedhashset(order of addition), treeset(sort)
         Set<Integer> set = new TreeSet<>();
         for (int i: arr1){
             set.add(i);
         }
         for(int i: arr2){
             set.add(i);
         }

         set.forEach(x-> System.out.print(x + " "));
     }
}
