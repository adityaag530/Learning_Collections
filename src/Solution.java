import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
//        [-1,0,1,2,-1,-4] ->  6

        int n=nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int first=0; first<n-2; first++){
            if(nums[first]>0){
                break;
            }
            int second = first+1;
            int third = n-1;
            while(second<third){
                int sum = nums[first] + nums[second] + nums[third];
                if(sum == 0){
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    if(!answer.contains(temp)){
                        answer.add(temp);
                    }
                    third--;
                }else if(sum<0){
                    second++;
                }else{
                    third--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{-1,0,1,2,-1,-4};
        int[] nums2 = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        //[[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(nums2));
    }
}