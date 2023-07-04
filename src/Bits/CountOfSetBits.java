package Bits;
/*
 * @author adityagupta
 * @date 04/07/23
 */

public class CountOfSetBits {
    public static void main(String[] args) {
        System.out.println("counting");
//        System.out.println(naiveMethod(13));//1101
//        System.out.println(brianKerningamAlgorithm(13));
        System.out.println(lookupTableSolution(13));
    }

    public static int naiveMethod(int n){
        // run for all bits wheather it is set or unset - O(no of bits)
        int count=0;
        while(n>0){
            if((n&1)==1){ //n%2!=0;
                count++;
            }
            n=n>>1;//n=n/2;
        }
        return count;
    }

    public static int  brianKerningamAlgorithm(int n){
        // run for number which is equal to no of set bits - O(no of set bits)
        int count=0;
        while(n>0){

            n = n & (n-1);
            count++;
        }
        return count;
    }

    // serach for lookupTableSolution for timeComplexity in contant time - gfg
    public static int lookupTableSolution(int n){
        // calculating table for all values in 8 bit number;
        int[] table = new int[256];
        table[0] = 0;
        for(int i=1; i<256; i++){
            table[i] = table[i & (i-1)] + 1;
        }

        return table[n & 255] +
                table[(n>>8) & 255] +
                table[(n>>16) & 255] +
                table[(n>>24) & 255];
    }

}
