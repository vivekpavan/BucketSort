package com.BucketSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1};
        var sort = new BucketSort();
        sort.BucketSort(numbers,3);
        System.out.println(Arrays.toString(numbers));
    }
}
