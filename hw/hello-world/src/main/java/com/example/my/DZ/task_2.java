package com.example.my.DZ;

public class task_2 {
    public static void main(String[] args){

    
        int num = 1000;
        Boolean bool = false;
        System.out.printf("Простые числа от 1 до %s:\n", num);
        for(int i = 1; i <= num; i++){
            bool = true;
            if (i == 2 || i == 3) bool = true;
            else if (i <= 1 || i % 2 == 0 || i % 3 == 0) bool = false;
            for (int j = 5; j * j <= i; j += 6)
            {
                if (i % j == 0 || i % (j + 2) == 0) {
                    bool = false;
                }
            }
            if(bool) System.out.println(i);
        }
    }

    
}
