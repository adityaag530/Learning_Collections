package Recursion.Permutations;

public class Arrangements {

    public static void main(String[] args) {
        findAllArrangements("","abc");
    }

    public static void findAllArrangements(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
            findAllArrangements(first + ch + second, up.substring(1));
        }
    }
}
