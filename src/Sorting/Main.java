package Sorting;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int arr[] = new int[]{5,4,3,2,1};

    MergeSort mergeSort = new MergeSort();
    SelectionSort selectionSort = new SelectionSort();
    BubbleSort bubbleSort = new BubbleSort(arr);
    InsertionSort insertionSort = new InsertionSort();

    insertionSort.insertionSort(arr);

    System.out.println(Arrays.toString(arr));

    }
    
}
