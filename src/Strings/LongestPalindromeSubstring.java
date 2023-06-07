package Strings;

public class LongestPalindromeSubstring {
    static String answer = "";
    public static void main(String[] args) {
        longestPalindrome("", "cbbd");
        System.out.println(answer);
    }
    static void longestPalindrome(String p, String up){
        if(up.isEmpty()){
            if(isPalindrome(p)){
                if(answer.length()<p.length())
                    answer = p;
            }
            return;
        }
        char ch = up.charAt(0);
        longestPalindrome(p+ch, up.substring(1));
        longestPalindrome(p, up.substring(1));
        return;
    }

    static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
