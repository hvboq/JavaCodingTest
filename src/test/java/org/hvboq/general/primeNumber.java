package org.hvboq.general;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class primeNumber {
    public boolean isPrimeNumber(int num) {
        boolean[] primeNumberArray = new boolean[num + 1]; //본인도 체크해야하므로 개수는 본인 +1
        Arrays.fill(primeNumberArray, true);

        int count = 0;
        for (int i = 2; i < primeNumberArray.length; i++) {
            if (primeNumberArray[i]) {
                count++;
                for (int j = i; j * i < primeNumberArray.length; j++) {
                    primeNumberArray[j * i] = false;
                }
            }
        }
        System.out.println(count);
        return primeNumberArray[num];
    }

    @Test
    @DisplayName("primeNumber")
    void test() {
        System.out.println(isPrimeNumber(97));
    }
}
