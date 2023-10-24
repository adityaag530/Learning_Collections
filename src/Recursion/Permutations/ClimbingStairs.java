package Recursion.Permutations;
/*
 * @author adityagupta
 * @date 17/08/23
 */
// https://youtu.be/Y0lT9Fck7qI
public class ClimbingStairs {
    public static void main(String[] args) {
        int num=5;
//        System.out.println(climbStairs(0, num));
        System.out.println(fiboSolution(num));
    }

    public static int climbStairs(int m, int n) {
        if(m==n){
            return 1;
        }
        if(m>n){
            return 0;
        }
        int oneStep = climbStairs(m+1, n);
        int twoStep = climbStairs(m+2, n);

        return oneStep+twoStep;
    }

    public static int fiboSolution(int n){
        int one =1, two =1;
        for(int i=0; i<n-1; i++){
            int temp = one;
            one = one + two;
            two=temp;
        }
        return one;
    }
}
