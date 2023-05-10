package com.gk.string_s;

public class PalindromString {
    public static void main(String[] args) {
       String input = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
       String result  = longestPalindrome(input);
        System.out.println(result);
    }

    public static String longestPalindrome(String s) {
        String reversString = "";
        String sub="";
        String result = "";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            int j = n - 1;
            while(i < j) {
                if(s.charAt(i) == s.charAt(j) && result.length() < (j-i+1))
                    sub = s.substring(i, j+1);
                reversString = new StringBuilder(sub).reverse().toString();
                if(reversString.equals(sub)){
                    result = sub;
                }
                j--;
            }
        }
        if(result.length() == 0) {
            result = s.substring(0, 1);
        }
        return result;
    }
}
