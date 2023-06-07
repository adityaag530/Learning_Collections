package Recursion;

public class BasicQues {
    public static void main(String[] args) {
//        nTo1(5);
//        oneToN(5);
//        System.out.println(factorial(5));
//        System.out.println(sumOfDigits(123456789));
        System.out.println(countStepToZero(14, 0));
    }

    public static int countStepToZero(int num, int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            num = num/2;
        }else{
            num = (num - 1);
        }
        count++;
        return countStepToZero(num, count);
    }
    public static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // concept(n--) -> first pass n then sub so result in stack overflow.

    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    public static void nTo1(int n){
        if(n==0) return;
        //print then call
        System.out.println(n);
        nTo1(n-1);
    }

    public static void oneToN(int n){
        if(n==0) return;
        // call then print
        oneToN(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
