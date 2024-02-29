package Sorting;

class InsertionSort {
     public void insertionSort(int arr[]){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swapArray(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
     }

     private static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}