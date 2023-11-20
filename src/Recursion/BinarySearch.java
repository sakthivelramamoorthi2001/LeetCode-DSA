package Recursion;

public class BinarySearch {


    public int checkIndexOfList(int[] arr, int target, int  s, int e){

        if(s >= e){
            return -1;
        }

        int m = s + (e - s) / 2;


        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]) {
            return checkIndexOfList(arr, target, s, m-1);

        }

        return checkIndexOfList(arr, target, m+1, e);
      
    }
}
