package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class q13RomanToInteger {
    //IV 는 4
    //
//    public int romanToInt(String s) {
//        char[] charArray = s.toCharArray();
//        int answer = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            switch (charArray[i]) {
//                case 'I':
//                    if (i < charArray.length - 1) {
//                        if (charArray[i + 1] == 'V') {
//                            answer += 4;
//                            i++;
//                        } else if (charArray[i + 1] == 'X') {
//                            answer += 9;
//                            i++;
//                        } else {
//                            answer += 1;
//                        }
//                    } else {
//                        answer += 1;
//                    }
//                    break;
//                case 'V':
//                    answer += 5;
//                    break;
//                case 'X':
//                    if (i < charArray.length - 1) {
//                        if (charArray[i + 1] == 'L') {
//                            answer += 40;
//                            i++;
//                        } else if (charArray[i + 1] == 'C') {
//                            answer += 90;
//                            i++;
//                        } else {
//                            answer += 10;
//                        }
//                    } else {
//                        answer += 10;
//                    }
//                    break;
//                case 'L':
//                    answer += 50;
//                    break;
//                case 'C':
//                    if (i < charArray.length - 1) {
//                        if (charArray[i + 1] == 'D') {
//                            answer += 400;
//                            i++;
//                        } else if (charArray[i + 1] == 'M') {
//                            answer += 900;
//                            i++;
//                        } else {
//                            answer += 100;
//                        }
//                    } else {
//                        answer += 100;
//                    }
//                    break;
//                case 'D':
//                    answer += 500;
//                    break;
//                case 'M':
//                    answer += 1000;
//                    break;
//            }
//        }
//        return answer;
//    }

//    public int romanToInt(String s) {
//        // I = 0
//        HashMap<String, Integer> countMap = new HashMap<>();
//        countMap.put("I", 0);
//        countMap.put("IV", 0);
//        countMap.put("IX", 0);
//        countMap.put("V", 0);
//        countMap.put("X", 0);
//        countMap.put("XL", 0);
//        countMap.put("XC", 0);
//        countMap.put("L", 0);
//        countMap.put("C", 0);
//        countMap.put("CD", 0);
//        countMap.put("CM", 0);
//        countMap.put("D", 0);
//        countMap.put("M", 0);
//
//        char[] charArray = s.toCharArray();
//
//        for (int i = 0; i < charArray.length; i++) {
//            if (i < charArray.length - 1) {
//                if (charArray[i] == 'I') {
//                    switch (charArray[i + 1]) {
//                        case 'V':
//                            countMap.put("IV", countMap.get("IV") + 1);
//                            i++;
//                            break;
//                        case 'X':
//                            countMap.put("IX", countMap.get("IX") + 1);
//                            i++;
//                            break;
//                        default:
//                            countMap.put("I", countMap.get("I") + 1);
//                            break;
//                    }
//                } else if ((charArray[i] == 'X')) {
//                    switch (charArray[i + 1]) {
//                        case 'L':
//                            countMap.put("XL", countMap.get("XL") + 1);
//                            i++;
//                            break;
//                        case 'C':
//                            countMap.put("XC", countMap.get("XC") + 1);
//                            i++;
//                            break;
//                        default:
//                            countMap.put("X", countMap.get("X") + 1);
//                            break;
//                    }
//                } else if ((charArray[i] == 'C')) {
//                    switch (charArray[i + 1]) {
//                        case 'D':
//                            countMap.put("CD", countMap.get("CD") + 1);
//                            i++;
//                            break;
//                        case 'M':
//                            countMap.put("CM", countMap.get("CM") + 1);
//                            i++;
//                            break;
//                        default:
//                            countMap.put("C", countMap.get("C") + 1);
//                            break;
//                    }
//                } else {
//                    String key = Character.toString(charArray[i]);
//                    countMap.put(key, countMap.get(key) + 1);
//                }
//            } else {
//                String key = Character.toString(charArray[i]);
//                countMap.put(key, countMap.get(key) + 1);
//            }
//        }
//
//        int answer = 0;
//        answer += countMap.get("I") * 1;
//        answer += countMap.get("IV") * 4;
//        answer += countMap.get("IX") * 9;
//        answer += countMap.get("V") * 5;
//        answer += countMap.get("X") * 10;
//        answer += countMap.get("XL") * 40;
//        answer += countMap.get("XC") * 90;
//        answer += countMap.get("L") * 50;
//        answer += countMap.get("C") * 100;
//        answer += countMap.get("CD") * 400;
//        answer += countMap.get("CM") * 900;
//        answer += countMap.get("D") * 500;
//        answer += countMap.get("M") * 1000;
//        return answer;
//    }

    public int oneRomeToInteger(char oneRome) {
        switch (oneRome) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return -1;
    }

    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int answer = 0;
        for (int i = 0; i < charArray.length; i++) {
            int integer1 = oneRomeToInteger(charArray[i]);
            int integer2 = i < charArray.length - 1 ? oneRomeToInteger(charArray[i + 1]) : -1;

            answer += integer1 >= integer2 ? integer1 : -(integer1);
        }
        return answer;
    }

    @Test
    @DisplayName("q13RomanToInteger")
    void test() {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
