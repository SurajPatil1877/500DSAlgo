package com.ds.array;

import java.util.Arrays;

public class NegativeElementToASide {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};

        int j = 0, temp;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
