package Math;
/*
 * @author adityagupta
 * @date 17/08/23
 */

public class SquareRoot {
    public static void main(String[] args) {
        int num = 2147395600;
        // 2147395600 -> 46340
        // 2147483647(integer max Value) -> 46340
        System.out.println(myBinarySqrt(num));
        System.out.println(mySqrt(num));
    }
    // binary search solution -- if (mid <= x / mid && (mid + 1) > x / (mid + 1))  -- socho
    public static int myBinarySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int l=1, r=x;
        while(l<=r){
            int mid = l + (r-l)/2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
                return mid;
            else if (mid > x / mid)// Keep checking the left part
                r = mid;
            else
                l = mid + 1;// Keep checking the right part
        }
        return l;
    }
    // newton raphson solution

    public static int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int i=1;
        int ans=1;
        while(ans<=x && ans>0){
            i++;
            ans=i*i;
        }
        return i-1;
    }
}
