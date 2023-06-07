package Recursion;

import java.util.HashMap;

public class FiboNumber {

    public static void main(String[] args) {
        System.out.println(fibo(45));
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
