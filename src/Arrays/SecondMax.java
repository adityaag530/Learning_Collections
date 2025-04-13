package Arrays;
/*
 * @author adityagupta
 * @date 23/02/24
 */

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1, 12345, 54321, 444777, 2222};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - " + secondMax(arr[i]));
        }
    }

    public static int secondMax(int n) {
        int max = -1;
        int sMax = -1;
        while (n > 0) {
            int rem = n % 10;
            // 45397
            if(rem>max){
                sMax=max;
                max = rem;
            }else if(rem>sMax){
                sMax = rem;
            }
            if(sMax==max){
                sMax=-1;
            }
            n /=10;
        }
        return sMax;
    }
}
