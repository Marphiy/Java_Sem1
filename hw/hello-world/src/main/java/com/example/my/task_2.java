package com.example.my;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task_2 {
    public static void main( String[] args ){

        int[] array = new int[] {1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1};
        // for(int num : array) {
        //     System.out.printf("%d ", num);
        // }
        System.out.println(Arrays.toString(array)); //печать массива
        System.out.printf("\n");
        int count = 0;
        int maxCount = count;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) count++;
            else {
                if(count > maxCount) 
                    maxCount = count;
                count = 0;
            }    
        }
        System.out.printf("Максимальное количесмтво единиц в массиве подряд - %s!\n", maxCount);


    }
    
}
