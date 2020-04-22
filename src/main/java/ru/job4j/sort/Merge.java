package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[k++] = left[i++];
            } else {
                rsl[k++] = right[j++];
            }
        }
        while (i < left.length) {
            rsl[k++] = left[i++];
        }
        while (j < right.length) {
            rsl[k++] = right[j++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 2, 5},
                new int[]{3, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
