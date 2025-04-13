package Arrays;


/*
 * @author adityagupta
 * @date 12/04/25
 */

import java.util.Arrays;

public class MoveZerosToEnd {

    // Bruteforce appract - store non zero number in an new variable
    // TWO POINTER

    static int[] arr = new int[]{2,3,53,34,23,4,0,0,8,34,2,342,0,3,24};

    public static void main(String[] args) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        for (int k = j+1; k < arr.length; k++) {
            if(arr[k]!=0){
                swap(k, j);
                j++;
            }
        }

        Arrays.stream(arr).forEach( x -> System.out.print(x + " "));
    }

    public static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
