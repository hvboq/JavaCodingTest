package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q9PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] charArr = (Integer.toString(x)).toCharArray();
        for (int i = 0; i <= charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - (i + 1)]) {
                return false;
            }
        }
        return true;
    }

//    public boolean isPalindrome(int x) {
//        if (x == 0)
//            return true;
//        else if (x < 0 || x % 10 == 0) {
//            return false;
//        }
//        int reverseNum = 0;
//        while (reverseNum < x) {
//            int digit = x % 10;
//            reverseNum = reverseNum * 10 + digit;
//            x = x / 10;
//        }
//        return x == reverseNum || x == reverseNum / 10;
//    }


    @Test
    @DisplayName("q9PalindromeNumber")
    void test() {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(121));
    }
}
