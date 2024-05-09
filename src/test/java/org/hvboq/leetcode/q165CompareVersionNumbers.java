package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] stringArrVersion1 = version1.split("\\.");
        String[] stringArrVersion2 = version2.split("\\.");

        int maxLength = Math.max(stringArrVersion1.length, stringArrVersion2.length);
        for (int i = 0; i < maxLength; i++) {
            int v1 = i < stringArrVersion1.length ? Integer.parseInt(stringArrVersion1[i]) : 0;
            int v2 = i < stringArrVersion2.length ? Integer.parseInt(stringArrVersion2[i]) : 0;

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }

    @Test
    @DisplayName("165. Compare Version Numbers")
    void Test() {
        System.out.println(compareVersion("1.01", "1.001"));
        System.out.println(compareVersion("1.0", "1.0.0"));
        System.out.println(compareVersion("0.1", "1.1"));
        System.out.println(compareVersion("1.0.1", "1"));
    }
}
