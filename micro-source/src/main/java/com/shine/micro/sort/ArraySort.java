package com.shine.micro.sort;

/**
 * 数组排序
 */
public class ArraySort {


    /**
     * 冒泡排序
     *
     * @param arrays
     */
    public static void buddingSort(int[] arrays) throws Exception {

        if (arrays == null || arrays.length == 0) {
            throw new Exception("数组为空！");
        }
        int len = arrays.length;
        for (int i = 0; i < len - 1; i++) {

            for (int j = 0; j < len - 1; j++) {
                if (arrays[j + 1] < arrays[j]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }

        }
    }

    /**
     * 快速排序
     *
     * @param arrays
     */
    public static void quickSort(int[] arrays, int low, int high) throws Exception {
        if (arrays == null || arrays.length == 0) {
            throw new Exception("数组为空！");
        }

        int start = low;
        int end = high;
        int key = arrays[low];

        while (end > start) {

            //从后向前搜索
            while (end > start && arrays[end] >= key)
                end--;
            if (arrays[end] <= key) {
                int temp = arrays[end];
                arrays[end] = arrays[start];
                arrays[start] = temp;
            }


            //从前往后比较
            while (end > start && arrays[start] <= key)
                start++;
            if (arrays[start] >= key) {
                int temp = arrays[start];
                arrays[start] = arrays[end];
                arrays[end] = temp;
            }

            if (start > low)
                quickSort(arrays, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
            if (end < high)
                quickSort(arrays, end + 1, high);//右边序列。从关键值索引+1到最后一个
        }
    }
}
