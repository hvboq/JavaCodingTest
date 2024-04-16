package org.hvboq;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// 문자열 s에서 p y P Y 개수

public class PYCount {
    boolean solution(String s) {
        boolean answer;

        char[] chars = s.toCharArray();
        Map<Character, Integer> counts = new HashMap<>();

        for (char temp : chars) {
            int count = 0;
            if (counts.get(temp) != null)
                count = counts.get(temp);

            counts.put(temp, ++count);
        }

        answer = (counts.get('p') == null ? 0 : counts.get('p')) + (counts.get('P') == null ? 0 : counts.get('P'))
                == (counts.get('y') == null ? 0 : counts.get('y')) + (counts.get('Y') == null ? 0 : counts.get('Y'));

        return answer;
    }

    @Test
    void test() {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}