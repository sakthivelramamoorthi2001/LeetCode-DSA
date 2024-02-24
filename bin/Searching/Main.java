package DSA.bin.Searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // LinearSearch linearSearch = new LinearSearch<Integer>();
        // Integer[] s ={3,45};
        // @SuppressWarnings("unchecked")
        // Integer ssd =   (Integer) linearSearch.checkTheNumber(s, 45);
        // System.out.println(ssd + "sss");

        BinarySearch s = new BinarySearch();
        int ss =  BinarySearch.findTheTarget(new int[]{3,4,4}, 35);

        int[][] array2d = new int[][] { 
            {2,3,4,5},
            {22,23,25,55},
            {33,35,36,38}
        };

        System.out.println(Arrays.toString(BinarySearch.findTheTargetIn2D(array2d, 33)));
    }
}