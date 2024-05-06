package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q12IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num / 1000; i++) {
            sb.append("M");
        }
        num %= 1000;

        if (num / 100 == 9) {
            sb.append("CM");
            num -= 900;
        } else if (num / 100 >= 5) {
            sb.append("D");
            num -= 500;
        } else if (num / 100 == 4) {
            sb.append("CD");
            num -= 400;
        }
        for (int i = 0; i < num / 100; i++) {
            sb.append("C");
        }
        num %= 100;

        if (num / 10 == 9) {
            sb.append("XC");
            num -= 90;
        } else if (num / 10 >= 5) {
            sb.append("L");
            num -= 50;
        } else if (num / 10 == 4) {
            sb.append("XL");
            num -= 40;
        }
        for (int i = 0; i < num / 10; i++) {
            sb.append("X");
        }
        num %= 10;

        if (num == 9) {
            sb.append("IX");
            num = 0;
        } else if (num >= 5) {
            sb.append("V");
            num -= 5;
        } else if (num == 4) {
            sb.append("IV");
            num = 0;
        }
        for (int i = 0; i < num; i++) {
            sb.append("I");
        }

        return sb.toString();
    }

    @Test
    @DisplayName("q12IntegerToRoman")
    void test() {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
