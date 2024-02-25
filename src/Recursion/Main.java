package Recursion;
import Searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2,4,6,7,8,99};
        int s = BinarySearch.checkTheNumberIsThere(arr, 0, arr.length -1 ,7);
        System.out.println(s);
        // System.out.println(ss);
    }
}
