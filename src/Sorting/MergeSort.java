package Sorting;

import java.util.Arrays;



public class MergeSort {


public static int[] mergeSort(int[] arr) {
    if (arr.length == 1) {
        return arr;
    }

    int mid = arr.length / 2;
    System.out.println( mid + "mid ");
    System.out.println( "cureent ---" + Arrays.toString(arr));
    System.out.println("left --- " + Arrays.toString(Arrays.copyOfRange(arr, 0, mid)));
    System.out.println("right --- " +  Arrays.toString(Arrays.copyOfRange(arr, mid, arr.length)));

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    System.out.println("---------- --");
    System.out.println(Arrays.toString(arr));

    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
    System.out.println("------ --");
    System.out.println(" ");



    return mergingTwoSortedArray(left, right);
}

private static int[] mergingTwoSortedArray(int[] first, int[] second) {
    System.out.println("merge call");
    int[] mixedArray = new int[first.length + second.length];

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < first.length && j < second.length) {

        if (first[i] < second[j]) {
            mixedArray[k] = first[i];
            i++;
        } else {
            mixedArray[k] = second[j];
            j++;
        }
        k++;
    }

    while (i < first.length) {
        mixedArray[k] = first[i];
        i++;
        k++;
    }

    while (j < second.length) {
        mixedArray[k] = second[j];
        k++;
        j++;
    }

    System.out.println(Arrays.toString(mixedArray) + "mixed arry");
    return mixedArray;
}
}

