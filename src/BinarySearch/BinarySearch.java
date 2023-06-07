package BinarySearch;

public class BinarySearch {


    // array should be sorted
    // total no of comparison = total no of level = logN
    public static void main(String[] args) {
        int[] numbers = {2,22,33,44,777,5434,53224,5634524,23452345};
        int target = 777;
//        System.out.println(binarySearch(numbers, 21));
//        System.out.println(binarySearchInArray(numbers, target, 0, numbers.length));
        // questions on binary search

        // order agnostic binary search, when you dont know the order asc or desc
        // ceiling of a no - greater or equal to the target element
        // floor of a no - less than or equal to
        // first and last position of an element in an array.
        // find index of an element in a sorted infinite array.
        // find the peak element in mountain array or bitonic array.  -> need to check condition end = mid and strt = mid + 1;

        // find the pivot index -
        System.out.println(findThePivotIndex(new int[]{4,5,6,7,0,1,2}));

    }

    static int binarySearchInArray(int[] arr, int target, int start, int end){

        int mid = start + (end - start)/2;
        if(start>=end){
            return -1;
        }
        if(arr[mid] == target) {
            return mid;
        }
        else if(arr[mid]<target){
            return binarySearchInArray(arr, target, start, mid -1);
        }else{
            return binarySearchInArray(arr, target, mid+1, end);
        }

    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length -1;
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
        // 4,5,6,7,0,1,2
        // 0 1 2 3 4 5 6
        //
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
