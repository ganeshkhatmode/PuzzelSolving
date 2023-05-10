package com.gk.string_s;

/**
 * formula - √(x1 - x2)2 + (y1 - y2)2).
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 */
public class EucledianDistance  {
    public static void main(String[] args) {

        double value = (1-(-2))^2 + (3-2)^2;
        double sq = Math.sqrt(value);
        System.out.println(sq);

        double value1 = (((-2)-1)^2) + ((2-3)^2);
        double sq1 = Math.sqrt(value1);
        System.out.println(sq1);
    }
}
