package Bits;

public class BitMasking {
    public static void main(String[] args) {
        System.out.println(no_of_change_a2b(13, 4));
    }
    static int find_ith_Bit(int n, int k){
        // 100110101 ->check 5th index from right is 0 or 1;
        // create a mask no by shifting 1, 5 times left side -> 100000
        int mask = 1<<(k-1);
        return (n & mask)>>(k-1);
    }

    static int set_ith_Bit_to_1(int n , int k){
        int mask = 1<<(k-1);
        return (n | mask);
    }

    static int clear_ith_Bit(int n, int k){
        int mask = 1<<(k-1);//1000
        int negateOfMask = ~mask;//0111
        return (n & negateOfMask);
    }

    static int no_of_change_a2b(int a, int b){
        // 13 -> 1101
        //  3 -> 0011
        // 13^3 -> 1100
        // 2 changes
        // number of total 1 bit or setbit = log2n+1;
        int temp = a^b;
        int count = 0;
        //making least sig bit to 0 -> (n & (n-1))
        //1101 - 1100 - 1000- 0000
        while(temp!=0){
            temp = temp & (temp-1);
            count++;
        }
        return count;
    }
}
