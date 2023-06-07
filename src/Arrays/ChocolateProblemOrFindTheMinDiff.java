package Arrays;


import java.util.Arrays;

public class ChocolateProblemOrFindTheMinDiff {

    public static void main(String[] args) {
        int[] choco = {7, 3, 2, 4, 9, 12, 56};//2
        System.out.println(findMinDiff(7, 3, choco));
    }

    static int findMinDiff(int n, int m, int[] chocolates) {
        // Write your code here.
        //cannot use kadane because it is used for maxi sum contiguous sub array.

        //naive approach
        //find all possible subset with diff m

        Arrays.sort(chocolates);
        //2 7 8 11 15 - 3
        //0 1 2  3  4
        //11- 7
        int min = Integer.MAX_VALUE;
        for(int i=m-1; i<n; i++){
            int diff = chocolates[i] - chocolates[i-m+1];
            if(diff<min){
                min = diff;
            }
        }
        return min;
    }
}
