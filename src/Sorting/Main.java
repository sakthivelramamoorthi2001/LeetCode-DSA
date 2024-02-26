package Sorting;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int arr[] = new int[]{5,4,3,2,1,24,24,4,};

    MergeSort mergeSort = new MergeSort();
    SelectionSort selectionSort = new SelectionSort();
    BubbleSort bubbleSort = new BubbleSort(arr);
    System.out.println(Arrays.toString(bubbleSort.arr));


    
    // int[] mergeSortRes = mergeSort.mergeSort(arr);

    }
    
}
