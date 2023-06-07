package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementArray {

//    https://www.enjoyalgorithms.com/blog/find-next-greater-element
//    https://leetcode.com/problems/next-greater-element-ii/
    public static void main(String[] args) {
        int[] arr = {13, 7, 14, 12};//{11,13,21,3}
        System.out.println(Arrays.toString(nextLargerElementFromRightToLeft(arr, arr.length)));
    }

    public static int[] nextLargerElementFromLeftToRight(int[] nums, int n) {
        //1 3 2 4
        // WIP
        Stack<Integer> ans = new Stack<>();
        int[] result = new int[n];
        ans.push(nums[0]);
        int j=0;
        for(int i=1; i<n; i++){
            while(!ans.isEmpty() && nums[i]>=ans.peek()){
                result[j++]=nums[i];
                ans.pop();
            }
            ans.push(nums[i]);
        }
        while(!ans.isEmpty()){
            result[j++]=-1;
            ans.pop();
        }
        return result;
    }

    public static int [] nextLargerElementFromRightToLeft(int[] nums, int n) {
        //1 3 2 4
        Stack<Integer> s = new Stack<>();
        int[] result = new int[n];
        s.push(0);
        for(int i=n-1; i>-1; i--){
            while(!s.isEmpty() && s.peek() <= nums[i]) {
                s.pop();
            }
            if(!s.isEmpty()) {
                result[i] = s.peek();
            } else {
                result[i] = -1;
            }
            s.push(nums[i]);
        }

        return result;
    }
}
