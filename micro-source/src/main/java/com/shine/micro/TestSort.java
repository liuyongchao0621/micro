package com.shine.micro;

import com.shine.micro.sort.ArraySort;


public class TestSort {

    public static void main(String[] args) throws Exception{

        int[] arrays = new int[]{13,11,24,18,16,9};

         ArraySort.quickSort(arrays,0,arrays.length - 1);

        for (int a: arrays) {
            System.out.println(a);
        }

    }
}
