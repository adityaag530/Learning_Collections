package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class RetainingRepetitions {

    // not correct
    static ArrayList<Integer> retainingRepetitions(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int j : arr) {
            if (freq.containsKey(j)) {
                freq.put(j, freq.get(j) + 1);
            } else {
                freq.put(j, 1);
            }
        }
        int count=1;
        ArrayList<Integer> result = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
            if(freq.get(arr[i])==1){
                result.add(arr[i]);
            }else if(freq.get(arr[i])>1){
                for(int l=1; l<=Math.min(count,freq.get(arr[i])); l++){
                    result.add(arr[i]);
                }
                if(count<k && freq.get(arr[i])!=count){
                    count++;
                }
                i += freq.get(arr[i])-1;
            }
        }
        return result;

    }

    //correct one below
    static ArrayList<Integer> retainingRepetitions1(int[] arr, int k) {
        int start=0;
        int count = 1;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++){

            if(arr[i]==arr[i+1]){
                continue;
            }else{
                int diff = i - start + 1;
                start = i+1;
                for(int j=1; j<=Math.min(count, diff); j++){
                    result.add(arr[i]);
                }
                if(count<k && diff>count){
                    count++;
                }
            }
        }
        if(start!=arr.length-1){
            for (int j = 1; j <= Math.min(count, arr.length -start); j++) {
                result.add(arr[start]);
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3, 3, 4, 5, 5, 5, 5, 6, 6, 7,7, 7, 7, 7};
        int k = 3;

        ArrayList<Integer> result = retainingRepetitions1(arr , k);
        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
