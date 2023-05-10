package com.gk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here

        char[] chars = s.toCharArray();
        String calString = getString(chars, n);
        String remainingStr = calString.replaceAll("[^a]+?", "");
        System.out.println("REMAINING STR :: "+remainingStr+" lenght :: "+remainingStr.length());
        char[] finalArr = calString.toCharArray();

        List<Character> characters = new ArrayList<>();
        for(int count =  0; count < calString.length(); count++){

            characters.add(finalArr[count]);
        }

        System.out.println("Calculate string :: "+calString);
        return characters.stream().filter(str-> str.equals('a')).count();
    }

    static String getString(char[] s , long n){
        String str = "";
        boolean stop = true;
        while(stop){

            for(int count = 0; count < s.length; count++){
                if(str.length() < n ){
                    str = str + s[count];

                } else {
                    if(str.length()==n) {
                        stop = false;
                        break;
                    }
                }

            }
        }
        System.out.println("CALCULATE STRING :: "+str);
        return str;
    }
    public static void main(String[] args)  {
        long n = 872514961806L;
        String s = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
//        String newStr = String.join("", Collections.nCopies((int) n, s));
//        System.out.println("New String :: "+newStr.substring(0, (int)n));


        String remainingStr = getString(s);
        int initialCountOfA = remainingStr.length();
        System.out.println("Initial count of A :: "+initialCountOfA);
        long divisionCount = n/s.length();
        long moduleCount = n % s.length();
        String sub = s.substring(0, (int)moduleCount);
        String remainingFinalStr = getString(sub);
        System.out.println("Module Count :: "+moduleCount);
        long finalCount = initialCountOfA * divisionCount + remainingFinalStr.length();
        System.out.println("Final count :: "+finalCount);

//        long result = repeatedString(s, n);
//        System.out.println("Result :: "+result);

    }

    static String getString(String str){
        return str.replaceAll("[^a]+?", "");
    }
}


