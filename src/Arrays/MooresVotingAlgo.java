package Arrays;

public class MooresVotingAlgo {
    public static void main(String[] args) {
        // [5,1,4,1,1] -> >n/2
        // counting consecutive frequency and reducing if found other
        // 5=1, 5=0; 1=1, 1=0; 4=1, 4=0, 1=1, 1=2 -> 1 ans
        // last me jo element bachega wahi ans hona chahiye

        int[] num= {1,3,1,2,2,1,1};
        System.out.println(majorityElement(num));
    }

    static int majorityElement(int[] arr){
        int freq = 1;
        int ansIndex = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[ansIndex]){
                freq++;
            }else{
                freq--;
            }
            if(freq==0){
                ansIndex = i;
                freq=1;
            }
        }
        return checkIfAnsIsTrue(arr, arr[ansIndex])?arr[ansIndex]:-1;
    }
    static boolean checkIfAnsIsTrue(int[] arr, int ans){
        int count = 0;
        for(int x: arr){
            if(x==ans){
                count++;
            }
        }
        return count > (arr.length / 2);
    }
}
