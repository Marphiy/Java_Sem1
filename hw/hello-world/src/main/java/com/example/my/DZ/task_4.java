package com.example.my.DZ;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args){
        // имеем ki + jl = x
        int num = 0;
        int newnum = 0;
        while(true){
            System.out.printf("Введите целое положительное число от 0 до 100: ");
            Scanner s = new Scanner(System.in, "utf-8");
            num = Integer.parseInt(s.nextLine());
            newnum = num / 100;
            if(newnum == 0 && num > 0) {
                s.close();
                for(int i = 0; i <=9; i++) {
                    for(int j = 0; j <= 9; j++){
                        for(int k = 0; k <= 9; k++){
                            for(int l = 0; l <= 9; l++){
                                if((k * 10 + i) + (j * 10 + l) == num) System.out.printf("%s%s + %s%s = %s\n", k, i, j, l, num);
                            }
                        }                    
                    }
                }
                break;
            }
            else System.out.printf("Введено некорректное значение!\n");
        }
    }
}
