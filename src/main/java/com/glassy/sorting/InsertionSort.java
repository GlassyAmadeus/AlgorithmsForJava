package com.glassy.sorting;


import org.apache.commons.lang.StringUtils;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] a = {5,2,4,6,1,3};
        System.out.println(StringUtils.join(Insertion(a),","));
    }

    public static Integer[] Insertion(Integer[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int value = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > value){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = value;
        }
        return arr;
    }

}
