package Sorting;

import java.sql.Array;
import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int arr[]){

        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndexInArray(arr, 0, last);
            swapArray(arr, maxIndex, last);
        }

        return arr;
    }

    private static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndexInArray(int[] arr, int start, int end) {
        int max = start;

        for (int j = start ; j <= end; j++) {
            if(arr[j] > arr[max]){
                max = j;
            }
        }

        return max;
    }
}
