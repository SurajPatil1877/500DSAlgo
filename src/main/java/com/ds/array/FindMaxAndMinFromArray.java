package com.ds.array;

import java.util.Arrays;

public class FindMaxAndMinFromArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //way 1
        System.out.println("Way 1 solution");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        //Way2
        System.out.println("Way 2 Solution");
        int minValue = Arrays.stream(arr)
                .min()
                .getAsInt();

        int maxValue = Arrays.stream(arr)
                .max()
                .getAsInt();

        System.out.println("Min Value: " + minValue);
        System.out.println("Max Value: " + maxValue);
    }
}
