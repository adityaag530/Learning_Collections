package Sorting;

import java.util.Arrays;

public class MergeSort {
    // Akra-bazzi formula: - learn later
    // T(N) = T(N/2) + T(N/2) + (N-1 comparisions check);

    public static void main(String[] args) {
        int[] arr = {3,2,22,452,4,5,3245,234,52};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] leftPart = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rigthPart = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftPart, rigthPart);
    }

    private static int[] merge(int[] leftPart, int[] rigthPart) {
        int[] mix = new int[leftPart.length + rigthPart.length];

        int i=0,j=0,k=0;
        while(i<leftPart.length && j<rigthPart.length){
            if(leftPart[i]<rigthPart[j]){
                mix[k]=leftPart[i];
                i++;
            }else{
                mix[k]=rigthPart[j];
                j++;
            }
            k++;
        }

        while(i<leftPart.length){
            mix[k]=leftPart[i];
            i++;
            k++;
        }

        while(j<rigthPart.length){
            mix[k]=rigthPart[j];
            j++;
            k++;
        }

        return mix;
    }
}
