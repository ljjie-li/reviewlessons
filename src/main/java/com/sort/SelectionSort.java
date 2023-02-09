package com.sort;

import com.utils.Print;

/**
 * @Package com.sort
 * @Author : 李俊杰
 * @Date : 2023/2/9 16:55
 * @Desc :选择排序
 * 循环相互比对
 */
public class SelectionSort {
    public static void main(String[] args) {
        int num[] = {0,2,1,4,6,8,3,5,7,1,2,4,6,9};

        /*0,2,1,4,6,8,3,5,7,1,2,4,6,9*/
        /*0,1,2,3,4,5,6,7,8,9,10,11,12,13*/
        selectSort(num);
        Print.printArray(num);
    }

    /**
     *  选择排序
     * @param arr
     */
    public static void selectSort(int[] arr){
        if(null == arr || arr.length < 2) {
            return;

        }
        /*0~n*/
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            /*0+1~n*/
            for (int j = i+1; j < arr.length; j++) {
                /*比较大小——拿出下标替换*/
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            /*交换位置*/
            swap(arr,i,minValueIndex);
        }
    }

    /**
     * 交换位置
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
