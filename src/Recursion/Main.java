package Recursion;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2,4,6,7,8,99};
        int ss = binarySearch.checkIndexOfList(arr, 888, 0, arr.length);
        System.out.println(ss);
    }
}
