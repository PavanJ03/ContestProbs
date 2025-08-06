package Algo;

import java.util.*;

public class SmallerInLeftAndLargerInRight {
    public static int findElement(List<Integer> list) {
        int n = list.size();
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], list.get(i - 1));
        }

        
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], list.get(i + 1));
        }

       
        for (int i = 0; i < n; i++) {
            if (list.get(i) >= leftMax[i] && list.get(i) <= rightMin[i]) {
                return list.get(i);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 4, 3, 6, 8, 10, 7, 9);
        int result = findElement(list);
        System.out.println("Result: " + result);
    }
}