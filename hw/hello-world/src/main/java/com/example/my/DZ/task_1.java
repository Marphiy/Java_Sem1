package com.example.my.DZ;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args){

        int num = 0;
        int res1 = 0;
        int res2 = 1;
        Scanner scanner = new Scanner(System.in, "utf-8");
        System.out.printf("Введите число: ");
        num = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= num; i++) {
            res1 = res1 + i;
            res2 = res2 * i;
        }
        System.out.printf("Сумма чисел ол 1 до %s = %s\n", num, res1);
        System.out.printf("Факториал числа %s = %s\n", num, res2);
    }
}
