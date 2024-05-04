package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] stringArrVersion1 = version1.split("\\.");
        String[] stringArrVersion2 = version2.split("\\.");

        int minLength = Math.min(stringArrVersion1.length, stringArrVersion2.length);
        for (int i = 0; i < minLength; i++) {
            int v1 = Integer.parseInt(stringArrVersion1[i]);
            int v2 = Integer.parseInt(stringArrVersion2[i]);

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }

        if (stringArrVersion1.length > stringArrVersion2.length) {
            for (int i = minLength; i < stringArrVersion1.length; i++) {
                if (Integer.parseInt(stringArrVersion1[i]) != 0) {
                    return 1;
                }
            }
        } else {
            for (int i = minLength; i < stringArrVersion2.length; i++) {
                if (Integer.parseInt(stringArrVersion2[i]) != 0) {
                    return -1;
                }
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
