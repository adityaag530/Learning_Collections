package Sorting;

import java.util.Arrays;

public class CyclicSorting {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        // 5, 3, 4, 2, 1
        // 0, 1, 2, 3, 4

        System.out.println(Arrays.toString(cyclicSorting(arr)));
    }

    static int[] cyclicSorting(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctPlace = arr[i] - 1;
            if(arr[i] != arr[correctPlace]){
                swap(arr, i, correctPlace);
            }else{
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
