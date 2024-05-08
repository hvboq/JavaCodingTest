package org.hvboq.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q1914HanoiTower {
    public void q1914HanoiTower(int n, char from, char mid, char to) {
        if (n == 1) {
            System.out.println("원반 1을 " + from + " 에서 " + to + "로 이동");
            return;
        }
        q1914HanoiTower(n - 1, from, to, mid);
        System.out.println("원반 " + n + "을 " + from + " 에서 " + to + "로 이동");
        q1914HanoiTower(n - 1, mid, from, to);
    }

    @Test
    @DisplayName("q1914HanoiTower")
    void test() {
        q1914HanoiTower(5, 'A', 'B', 'C');
    }
}
