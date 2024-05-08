package org.hvboq.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q1914HanoiTower {
    static int count = 0;

    public void q1914HanoiTower(int n, char from, char mid, char to, StringBuilder sb) {
        count++;
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }
        q1914HanoiTower(n - 1, from, to, mid, sb);
        sb.append(from + " " + to + "\n");
        q1914HanoiTower(n - 1, mid, from, to, sb);
    }

    @Test
    @DisplayName("q1914HanoiTower")
    void test() {
        StringBuilder sb = new StringBuilder();
        q1914HanoiTower(3, '1', '2', '3', sb);
        System.out.println(count);
        System.out.println(sb);
    }
}
