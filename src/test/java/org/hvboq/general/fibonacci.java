package org.hvboq.general;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class fibonacci {
    public int fibonacci(int num) {
        if (num < 2) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    @Test
    @DisplayName("fibonacci")
    void test() {
        System.out.println(fibonacci(10));
    }
}
