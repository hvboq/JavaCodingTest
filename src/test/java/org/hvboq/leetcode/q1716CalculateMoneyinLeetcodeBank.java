package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q1716CalculateMoneyinLeetcodeBank {
    public int totalMoney(int n) {
        int lastMondayMoney = 1;
        int currentInputMoney = 0;
        int totalMoney = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= 8 && i % 8 == 0) {
                currentInputMoney = ++lastMondayMoney;
                totalMoney += currentInputMoney;
            } else {
                totalMoney += ++currentInputMoney;
            }
        }
        return totalMoney;
    }

    @Test
    @DisplayName("q1716CalculateMoneyinLeetcodeBank")
    void test() {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
    }
}

