package Strings;


/*
 * @author adityagupta
 * @date 08/02/25
 */

public class AddBinary {

//    public static String addBinary(String a, String b) {
//        // this solution is not efficient for large values of inputs
//        int num1 = 0;
//        int num2 = 0;
//        for(int i=a.length()-1; i>=0; i--){
//            // "11" 0 1
//            int n1 = a.charAt(i) - '0';
//            num1 = num1 + n1 * (int)Math.pow(2, a.length()-i-1);
//        }
//        for(int i=b.length()-1; i>=0; i--){
//            int n2 = b.charAt(i) - '0';
//            num2 = num2 + n2 * (int)Math.pow(2, b.length()-i-1);
//        }
//        int res = num1 + num2;
//        if(res == 0){
//            return "0";
//        }
//        String result = "";
//        while(res!=0){
//            int rem = res%2;
//            res = res/2;
//            result = String.valueOf(rem) + result;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        //1100011110011010010010110111010
        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        return null;
    }
}
