package Sorting;
/*
 * @author adityagupta
 * @date 26/04/24
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3,23,2,6,453,3,4235,43,3,46,3,342,34};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                int a = arr[j];
                int b = arr[j+1];
                if(a>b){
                    arr[j] = b;
                    arr[j+1] = a;
                }
            }
        }
        return arr;
    }
}
