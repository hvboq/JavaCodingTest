package org.hvboq.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class q1TwoSum {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> indexMap = new HashMap<>();
//        HashMap<Integer, Integer> indexMap2 = new HashMap<>();
//        ArrayList<Integer> sortedList = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (indexMap.containsKey(num)) {
//                indexMap2.put(num, i);
//            } else {
//                indexMap.put(num, i);
//            }
//            if (num <= target) {
//                sortedList.add(Integer.valueOf(nums[i]));
//            }
//        }
//
//        if (sortedList.size() == 2) {
//            return buildAnswer(indexMap, indexMap2, sortedList.get(0), sortedList.get(1));
//        }
//
//        Collections.sort(sortedList);
//
//        for (int i = 0; i <= (sortedList.size() / 2 + 1); i++) {
//            int firstNum = sortedList.get(i);
//            int secondNum = target - firstNum;
//            for (int j = sortedList.size() - 1; j >= sortedList.size() / 2; j--) {
//                if (secondNum == sortedList.get(j)) {
//                    return buildAnswer(indexMap, indexMap2, firstNum, secondNum);
//                }
//            }
//        }
//        return new int[]{0, 0};
//    }
//
//    public int[] buildAnswer(HashMap<Integer, Integer> indexMap, HashMap<Integer, Integer> indexMap2, int firstNum, int secondNum) {
//        if (firstNum == secondNum) {
//            return Arrays.stream(new int[]{indexMap.get(firstNum), indexMap2.get(secondNum)}).sorted().toArray();
//        } else {
//            return Arrays.stream(new int[]{indexMap.get(firstNum), indexMap.get(secondNum)}).sorted().toArray();
//        }
//    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (indexMap.containsKey(target - num)) {
                return new int[]{indexMap.get(target - num), i};
            }
            indexMap.put(num, i);
        }
        return null;
    }

    @Test
    @DisplayName("q1TwoSum")
    void test() {
//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{0, 4, 3, 0}, 0)));
    }
}
