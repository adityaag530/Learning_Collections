package Recursion;

public class NumbersExample {

    //write a fun take a no and print numbers from 1 to that number
    // call fun only one time in main
    // no multiple print statements to be added
    // no more that one fun to be defined

    ///////
    //first approach problem with recursion then convert it into iterations and vice versa



    public static void main(String[] args) {
        printNumber(5);
    }

    static void printNumber(int n){
        System.out.println(n);
        //base conditon
        if(n==1){
            return ;
        }
//        printNumber1(n-1);
        printNumber(n-1);// this is tail recursion as recursive call at the end without return;
    }
//    static void printNumber1(int n){
//        System.out.println(n);
//        printNumber2(n-1);
//    }
//    static void printNumber2(int n){
//        System.out.println(n);
//        printNumber3(n-1);
//    }
//    static void printNumber3(int n){
//        System.out.println(n);
//    }


}
