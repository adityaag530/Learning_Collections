package BinarySearch;

public class BinarySearchInSortedArray {


    // array should be sorted
    // total no of comparison = total no of level = logN
    public static void main(String[] args) {
        int[] nums = {2,22,33,44,777,5434,53224,5634524,23452345};
        int target = 777;
        int pivot = findThePivotIndex(nums);
        int start = 0;
        int end = nums.length - 1;
        System.out.println("Pivot = "+ pivot );
        if(pivot == -1){
            System.out.println( binarySearch(nums, start, end, target) );
        }
        else if(nums[pivot] == target){
            System.out.println( pivot);
        }else if(target >= nums[start]){
            System.out.println( binarySearch(nums, start, pivot-1, target) );
        }else{
            System.out.println( binarySearch(nums, pivot+1, end, target) );
        }

    }

    static int binarySearch(int[] arr, int start, int end, int target){

        while(start<=end){

            int mid = start + (end -start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findThePivotIndex(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start<=end) {

            int mid = start + (end - start) / 2;

            // NOTE: for if condition - if(mid==0 && arr[mid] > arr[mid+1]) -- second condition should be the compile error one.

            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
