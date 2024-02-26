package Sorting;

import java.util.Arrays;

public class BubbleSort {
    
    public int[] arr;
    private boolean swped = true;

    public BubbleSort(int[] array){
        this.arr = array;
        bubbleSortCreation();
    }

    private void bubbleSortCreation(){
        for (int i = 0; i < this.arr.length; i++) {

            for (int j = 1; j < this.arr.length - i; j++) {

                if(this.arr[j] < this.arr[j-1]){
                this.swped = false;
                int temp = this.arr[j];
                this.arr[j] = this.arr[j-1];
                this.arr[j-1] = temp;
                }

            }

            if(swped){
                break;
            }

            
        }
    }
}
