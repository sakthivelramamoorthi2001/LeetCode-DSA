package Searching;


public class BinarySearch {
    
    public static int checkTheNumberIsThere(int[] arr, int start, int end, int target) {

        int mid = start + (end - start) / 2;

        if (start > end) {
            return -1;
        }

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return checkTheNumberIsThere(arr, start, mid - 1, target);
        } else {
            return checkTheNumberIsThere(arr, mid + 1, end, target);
        }
    }

    public static int findTheTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
           return checkTheNumberIsThere(arr, start, end, 73);
    }

    public static int[] findTheTargetIn2D(int[][] arr, int target){

        int row = 0;
        int col = arr.length ;

        while (row < arr.length && col >= 0) {
            System.out.println(arr[row][col] + " "+row + " <- row " + col + " <- col  target ->"  + target);

            if(arr[row][col] == target) {
                return new int[]{row, col};
            }

            if(arr[row][col] > target){ 
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1, -1};

    }

   
}
