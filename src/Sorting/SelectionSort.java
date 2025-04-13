package Sorting;
/*
 * @author adityagupta
 * @date 26/04/24
 */
import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {3,23,2,6,453,3,4235,43,3,46,3,342,34};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min = arr[i];
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<=min){
                    min = arr[j];
                    minIdx=j;
                }
            }
            arr[minIdx] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
}
