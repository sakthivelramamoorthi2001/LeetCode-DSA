package Sorting;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int arr[] = new int[]{7,6,5,4,3,2,1};

    MergeSort mergeSort = new MergeSort();
    int[] sd = mergeSort.mergeSort(arr);
    System.out.println(Arrays.toString(sd));
    }
    
}
