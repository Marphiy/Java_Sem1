package com.example.my;
import java.util.Arrays;

//Перемещаем все 3 в конец массива
public class task_3 {
    public static void main(String [] args){
        int[] array1 = {3, 2, 2, 3, 3, 3, 0, 3, 7, 12, 3, 3, 3, 3, 3};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        int val = 3, end = 0, k = 0;
        for(int i = 0; i < array1.length; i++){
            if(array1[i] == val){
                array2[array2.length -1 - end] = val;
                end++;
            }
            else {
                array2[k] = array1[i];
                k++;
            }
        }
        array1 = array2;
        System.out.println(Arrays.toString(array1));
    }
}
