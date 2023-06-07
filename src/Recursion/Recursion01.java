package Recursion;

public class Recursion01 {

    /* note:
        call the same fun with same type of parameter
        fun call goes into stack
        fun get removed only when the work of that fn is over

        0. identify if you are able to break the problem into smaller problem
        0.1 write the recurrence relation if needed
        0.2 draw recurrence tree
        0.3 about the tree
            0.3.1 see how they are getting in stack
            0.3.2 identify and focus on left tree calls and right tree calls
            0.3.3 draw the tree and pointer again and again using pen and paper, use debugger to see the flow.
        0.4 see how the values are returned at each step.
        0.5 see where the function call will come out in, in the end you will come out of the main function.

        0.6 focusing on variables in recursion
            0.6.1 in argument, return type and in body
            0.6.2 focus on the variable which is to be pass again in recursive call
            0.6.3 also focus on the return type in recursive call

        0.7 types of recurrence relation
            a. linear  -> fibo
            b. divide and conquer -> binary search

            e.g binary search:
                1. comparing O(1)
                2. dividing into two half
                3. F(N) -> O(1) + F(N/2)  ; this is recurrence relation



        1. base condition required must.(that we know)
        2. body
        3. recursive call
        4. space complexity O(n) - because of recursive calls

        note* - help in solving bigger problem into smaller problems
        5. visualising recursion (recursive tree):
            main()-> print1()-> print2() -> print3() -> print4()



    */
    public static void main(String[] args) {
        message0();
    }

    static void message0(){
        System.out.println("Hello World!..1");
        message1();
    }
    static void message1(){
        System.out.println("Hello World!..2");
        message2();
    }
    static void message2(){
        System.out.println("Hello World!..3");
        message3();
    }
    static void message3(){
        System.out.println("Hello World!..4");
        message4();
    }
    static void message4(){
        System.out.println("Hello World!..5");
    }

}
