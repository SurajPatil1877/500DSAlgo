package com.ds.learning;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        for (int i : temp) {
            System.out.println(i);
        }
    }
}
