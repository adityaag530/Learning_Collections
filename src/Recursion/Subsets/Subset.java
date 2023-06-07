package Recursion.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        // "abc"
        // ['a', 'b', 'c', 'ab', 'bc', 'cd', 'abc']
        // take-it/ ignore it : means apply recursion to calculate subset
        // processed/unprocessed : e.g "abc"/""
        // e.g -> 'a' : take a / ignore b and c
        //        'ac': take a and c/ ignore b
        //        "abc": take abc and ignore ""
//        findSubsets("", "abc");
//        System.out.println(findSubsetsWithReturn("", "abc"));
        System.out.println(findingSubsetUsingIteration(new int[]{1,2,3}));
    }


    public static void findSubsets(String p, String up){
        // p-> processed & up - unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        findSubsets(p+ch, up.substring(1)); // accepting
        findSubsets(p, up.substring(1)); // rejecting
    }

    public static ArrayList<String> findSubsetsWithReturn(String p, String up){
        // p-> processed & up - unprocessed
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = findSubsetsWithReturn(p+ch, up.substring(1)); // accepting
        ArrayList<String> right = findSubsetsWithReturn(p, up.substring(1)); // rejecting
        left.addAll(right);
        return left;
    }

    //finding subset using iteration
    // NAHI SAMAJH AA RAHA YAAR; AUR NA HI ISKA TC
    // https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=7 59:03
    // [1, 2, 3]
    // [] [1]
    // [] [1]  ->  [2] [1,2]
    // [] [1] [2] [1,2] -> [3] [1,3] [2,3] [1,2,3]
    public static List<List<Integer>> findingSubsetUsingIteration(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
