package Bits;

import java.util.Arrays;

public class FindNonRepeatingElement {
    public static void main(String[] args) {
        //XOR
        // n^n = 0
        // 0^n = n
        int[] arr = {2, 4, 7, 9, 2, 4};
//        System.out.println(findNonRepeatingElement(arr));
        System.out.println(twoNonRepeatingElement(arr));
    }
    static int findNonRepeatingElement(int[] arr){
        int result = 0;
        for(int n: arr) {
            result ^= n;
        }
        return result;
    }

    static String twoNonRepeatingElement(int[] arr){
        //[5,4,1,4,3,5,1,2] -> [2,3]
        int[] result = new int[2];
        int temp = 0;
        for(int n: arr) {
            temp ^= n;
        }
        //finding set_bit in xor of two no
        temp = temp & -temp;
        for(int n: arr){
            if( (n & temp) > 0){
                result[0] ^=n;
            }else{
                result[1] ^=n;
            }
        }
//        result[1] = result[0]^temp;

        return Arrays.toString(result);
    }
}
