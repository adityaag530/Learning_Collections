package Arrays;

public class KadaneAlgo {

    public static void main(String[] args) {
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) );
    }

    static public int maxSubArray(int[] nums) {

        int resultMax = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            // check if current sum > current elemen
            currentSum = Math.max(currentSum, num);
            // if current sum is > max so far update.
            if (currentSum > resultMax) {
                resultMax = currentSum;
            }
        }
        return resultMax;
    }
}
