package org.hvboq;

import org.junit.jupiter.api.Test;

public class StringToInt {
    @Test
    void test() {
        System.out.println(solution("-19"));
        System.out.println(solution("1"));
        System.out.println(solution("6974"));
        System.out.println(solution("-6974"));
    }

    int solution(String s) {
        return Integer.parseInt(s);
    }
}